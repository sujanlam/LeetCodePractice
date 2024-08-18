package leetcode50;

public class TestPal {
        public static void main(String[] args) {
            String str = "racecar";
            // call a method to verify if string is         palindrome.
            System.out.println(isPalindrome(str));
        }
        public static boolean isPalindrome(String word){
            int left = 0;
            int right = word.length() - 1;
            while(left < right){
                if(word.charAt(left) != word.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
}
