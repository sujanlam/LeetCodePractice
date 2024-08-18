package leetcode50;

public class TripletSequence {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        int[] c = {2, 1, 5, 0, 4, 6};
        int[] d = {20,10,100,12,5,3};
        // System.out.println(increasingTriplet(a));
        // System.out.println(increasingTriplet(b));
        // System.out.println(increasingTriplet(c));
        System.out.println(increasingTriplet(d));
    }

    public static boolean increasingTriplet(int[] nums) {
        int numI= Integer.MAX_VALUE;
        int numJ= Integer.MAX_VALUE;
        for (int num: nums) {
            if(num<= numI){
                numI = num;
            }else if(num <numJ){
                numJ = num;
            }else {
                return true;
            }
        }
        return false;
    }
}
