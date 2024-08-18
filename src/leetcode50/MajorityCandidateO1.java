package leetcode50;

public class MajorityCandidateO1 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count += 1;
            }else {
                count -= 1;
            }
        }
        return candidate;
    }
}
//2,2,1,1,1,2,2,3