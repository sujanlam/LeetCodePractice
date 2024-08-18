package leetcode50;

public class MaxVowelsInStringOfSizeK {
        public static int maxVowels(String s, int k) {

            String vowels = "aeiou";

            int maxVowelCount = 0;
            int currentVowelCount = 0;

            for (int i = 0; i < k; i++) {
                if (vowels.indexOf(s.charAt(i)) != -1) {
                    currentVowelCount++;
                }
            }

            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);

            for (int i = k; i < s.length(); i++) {

                if (vowels.indexOf(s.charAt(i - k)) != -1) {
                    currentVowelCount--;
                }

                if (vowels.indexOf(s.charAt(i)) != -1) {
                    currentVowelCount++;
                }

                maxVowelCount = Math.max(maxVowelCount, currentVowelCount);
            }
            return maxVowelCount;

    }
    public static void main(String[] args) {

        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }
}

