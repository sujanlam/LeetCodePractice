package leetcode50;

public class FlipCertainTimes1 {
    public static void main(String[] args) {
        int k = 2;
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int[] nums2 = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println(longestOnes(nums2, k));
    }
    public static int longestOnes(int[] nums, int k) {
        int max = 0;
        int zeroCount = 0;
        int j = 0;
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroCount++;
            }
            while(zeroCount > k){
                if(nums[j] == 0){
                    zeroCount--;
                }
                j++;
            }
            len = i-j+1;
            max = Math.max(max, len);
        }

        return max;
    }
}
