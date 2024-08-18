package leetcode50;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String word = "Hello World This is me";
        reverseWords(word);
    }

    private static void reverseWords(String word) {
        String revStr = "";
        String[] words = word.split("\\s");
        for (int i = words.length-1; i >=0; i--) {
            if(i != 0){
                revStr = revStr + words[i]+" ";
            }else {
                revStr = revStr + words[i];
            }
        }

        System.out.println(revStr);
    }
}
