package leetcode50;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String str = "dog cat cat dog";
        System.out.println("Final Result: "+wordPattern(pattern, str));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if (pattern.length() != strArr.length){
            return false;
        }
        int l = pattern.length();
        HashMap<Character, String> charToWordMap = new HashMap<>();
        HashMap<String, Character> wordToCharMap = new HashMap<>();
        for(int i=0; i<l; i++){
            char c = pattern.charAt(i);
            String word = strArr[i];

            if(charToWordMap.containsKey(c)){
                if(!charToWordMap.get(c).equals(word)){
                    return false;
                }
            }
            else {
                if(wordToCharMap.containsKey(word)){
                    return false;
                }
                charToWordMap.put(c, word);
                wordToCharMap.put(word, c);
            }
        }
        return true;

    }
}
