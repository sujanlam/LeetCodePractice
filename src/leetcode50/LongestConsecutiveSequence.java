package leetcode50;
import java.util.*;
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> sett = new HashSet<>();
        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            sett.add(nums[i]);
        }
        System.out.println(sett);
        for(int num: nums){
          if(!sett.contains(num - 1)){
              count = 1;
              while(sett.contains(num + 1)){
                  count++;
                  num++;
              }
              max = Math.max(max, count);
          }
        }
        System.out.println(sett);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {10,4,20,11,3,12};
        System.out.println(longestConsecutive(nums));
    }
}
