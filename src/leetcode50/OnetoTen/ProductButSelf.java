package leetcode50.OnetoTen;

public class ProductButSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int leftMult = 1;
        int rightMult = 1;
        for (int i = 0; i < n; i++) {
            res[i] = leftMult;
            leftMult *= nums[i];
        }

        for (int i = n-1; i >= 0; i--) {
            res[i] *= rightMult;
            rightMult *= nums[i];
        }
        return res;
    }
}
