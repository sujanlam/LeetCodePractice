package leetcode50;

import java.util.Arrays;

public class MaxGap {
    public int maximumGap(int[] nums) {
        int maxGap = Integer.MIN_VALUE;
        int n = nums.length;
        if(n < 2){
            return 0;
        }
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            System.out.println(nums[i]);
        }
        for(int i = 1; i < n; i++){
            int diff= nums[i] - nums[i-1];
            if(diff > maxGap){
                maxGap = diff;
            }
        }
        return maxGap;
    }

    public static void main(String[] args) {
        int[] nums = {3,6,9,1};
        System.out.println(new MaxGap().maximumGap(nums));
    }
}
