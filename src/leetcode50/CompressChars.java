package leetcode50;

public class CompressChars {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','@','@','c','c','c'};
        System.out.println(compress(chars));
    }
    public static int compress(char[] chars) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < chars.length) {
            char c = chars[i];
            int count = 0;
            while (i<chars.length && chars[i] == c) {
                i++;
                count++;
            }
            sb.append(c);
            if (count > 1) {
                sb.append(count);
            }
        }
        System.out.println(sb.toString());
        return sb.length();
    }
}
