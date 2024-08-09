package leetcode50;

import java.util.Arrays;

public class MakeLargestNumOnArray {
    public static String largestNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }

        return sb.charAt(0)=='0' ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        int[] a = {20, 60, 40, 230, 72};
        largestNumber(a);
    }
}
