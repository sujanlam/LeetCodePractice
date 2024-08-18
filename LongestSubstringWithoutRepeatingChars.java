package leetcode50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "abbcdee";
        //System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(s));
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring1(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0, right = 0;

        Set<Character> seenChars = new HashSet<>();

        while (right < n) {
            if (!seenChars.contains(s.charAt(right))) {
                seenChars.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                seenChars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;

    }

    public static int lengthOfLongestSubstring1(String s) {
        int maxLen = 0;
        int a_pointer = 0;
        int b_pointer = 0;
        Set<Character> setChars = new HashSet<>();
//abbcdee
        while(b_pointer < s.length()){
            char newChar = s.charAt(b_pointer);
            if (!setChars.contains(newChar)) {
                setChars.add(newChar);
                b_pointer++;
                maxLen = Math.max(maxLen, setChars.size());
            }else {
                setChars.remove(s.charAt(a_pointer));
                a_pointer++;
            }

        }
        return maxLen;
    }
}