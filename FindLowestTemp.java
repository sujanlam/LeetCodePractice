package leetcode50;

import java.util.Arrays;
import java.util.List;

public class FindLowestTemp {
    public static double closestToZero(List<Double> ts) {
        // Write your code here
        if(ts.size() == 0){
            return 0;
        }
        double closestValue = ts.get(0);
        for(int i=1; i<ts.size(); i++){
            double currentValue = ts.get(i);

           if(Math.abs(currentValue) < Math.abs(closestValue) ||
                   Math.abs(currentValue) == Math.abs(closestValue) && currentValue > closestValue
           ){
               closestValue = currentValue;
           }
        }
        // To debug: System.err.println("Debug messages...");
        //System.out.println(closestDiff);
        return closestValue;
    }

    public static void main(String[] args) {
        List<Double> ts = Arrays.asList(-15.8, -50.7, -9.6, -14.5, -9.7
        );
        System.out.println(closestToZero(ts));
    }
}
