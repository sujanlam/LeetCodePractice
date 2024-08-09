package leetcode50;

import java.util.HashSet;
import java.util.Set;

public class ReviewSent {
    public static String[] reviewIntentions(String[] reviews) {
        Set<String> positiveSet = Set.of("good", "best");
        Set<String> negativeSet = Set.of("bad", "worse", "worst");
        Set<String> intensifierSet = Set.of("very");

        String[] sentiments = new String[reviews.length];

        for (int i = 0; i < reviews.length; i++) {
            String review = reviews[i];
            String[] words = review.split("\\s+");
            boolean hasPositive = false;
            boolean hasNegative = false;
            boolean isIntensified = false;
// String[] reviews = {"very purple and good", "very very bad one of the worst", "good but worse than analogue", ""};
            for (int j = 0; j < words.length; j++) {
                String word = words[j].toLowerCase();

                if (positiveSet.contains(word)) {
                    hasPositive = true;
                } else if (negativeSet.contains(word)) {
                    hasNegative = true;
                } else if (intensifierSet.contains(word)) {
                    isIntensified = true;
                    if (j < words.length - 1) {
                        String nextWord = words[j + 1].toLowerCase();
                        if (positiveSet.contains(nextWord)) {
                            hasPositive = true;
                        } else if (negativeSet.contains(nextWord)) {
                            hasNegative = true;
                        }
                        j++;
                    }
                }
                if (hasPositive && hasNegative) {
                    sentiments[i] = "neutral";
                }
                else if (hasPositive) {
                    sentiments[i] = "positive";
                }
                else if (hasNegative) {
                    sentiments[i] = "negative";
                }
                else {
                    sentiments[i] = "neutral";
                }
            }

            }

        return sentiments;
    }
    public static void main(String[] args) {
        String[] reviews = {"very purple and good", "very very bad one of the worst", "good but worse than analogue", ""};
        String[] result = reviewIntentions(reviews);

        for (String sentiment : result) {
            System.out.println(sentiment);
        }
    }
}
