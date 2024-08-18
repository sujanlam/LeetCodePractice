package leetcode50;

import java.util.*;

public class ReviewSentiment {

    private static String reviewIntentions(String review) {
        Set<String> positiveSet = Set.of("good", "best");
        Set<String> negativeSet = Set.of("bad", "worse", "worst");
        Set<String> intensifierSet = Set.of("very");

        String sentiment = "";
        String[] wordsArr = review.split("\\s+");
        int hasPositive = 0;
        int hasNegative = 0;
        //int isIntensified = 0;
        for (int i = 0; i < wordsArr.length; i++) {

            String word = wordsArr[i].toLowerCase();
            if (positiveSet.contains(word)) {
                hasPositive++;
            } else if (negativeSet.contains(word)) {
                hasNegative++;
            } else if (intensifierSet.contains(word)) {

                if (i < wordsArr.length - 1) {
                    String nextWord = wordsArr[i + 1].toLowerCase();
                    if (positiveSet.contains(nextWord)) {
                        hasPositive++;
                    } else if (negativeSet.contains(nextWord)) {
                        hasNegative++;
                    }
                }
            }

        }
        if (hasPositive > 0 && hasNegative < 0) {
            sentiment = "positive";
        } else if (hasPositive > 0 && hasNegative < 0) {
            sentiment = "negative";
        } else if ((hasNegative > 0 && hasPositive > 0) || (hasNegative == 0 && hasPositive == 0)) {
            sentiment = "neutral";
        }

        return sentiment;
    }

    public static void main(String[] args) {
        String[] positive = {"good", "best"};
        String[] negative = {"bad", "worse", "worst"};
        String[] intensifiers = {"very"};
        String[] reviews = {"very purple and good", "very very bad one of the worst", "good but worse than analogue", ""};
        String result = reviewIntentions("very very bad one of the worst");

        System.out.print(result);

    }


}
