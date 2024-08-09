package leetcode50;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int nextNum = target - nums[i];
            if(mapp.containsKey(nextNum)){
                return new int[]{mapp.get(nextNum), i};
            }else {
                mapp.put(nums[i], i);
            }
        }
       throw new IllegalArgumentException("No two sum solution");
    }
}
