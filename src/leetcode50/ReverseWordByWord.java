package leetcode50;

public class ReverseWordByWord {
    public static void main(String[] args) {
        String str = "A dog is lying down";
        System.out.println(reverseWordsStr(str));
    }

    private static String reverseWordsStr(String str) {
        String[] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            sb.append(strArr[i]);
            if (i > 0)
                sb.append(" ");
        }

        return sb.toString();
    }

}
