package leetcode50;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mapp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if(!mapp.containsKey(nums[i])){
                mapp.put(nums[i], 1);
            }else{
                mapp.put(nums[i], mapp.get(nums[i]) + 1);
            }
        }
        System.out.println(mapp);
        int majority = mapp.entrySet()
                .stream()
                .filter(a -> a.getValue() > n/2)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No majority element found"));
        return majority;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
