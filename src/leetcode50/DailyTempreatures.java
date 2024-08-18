package leetcode50;

import java.util.Stack;

public class DailyTempreatures {
    public static void main(String[] args) {
        int[] temp = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] res = dailyTemperatures(temp);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        var stack = new Stack<Integer>();
        var ans = new int[temperatures.length];

        for (var i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                var a = stack.pop();
                ans[a] = i - a;
            }
            stack.push(i);
        }
        return ans;
    }
}
