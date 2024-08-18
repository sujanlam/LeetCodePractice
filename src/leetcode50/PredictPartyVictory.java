package leetcode50;

import java.util.LinkedList;
import java.util.Queue;

public class PredictPartyVictory {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') qr.add(i);
            else qd.add(i);
        }
        System.out.println("Size of Radiant queue: "+ qr.size()+" "+ qr);
        System.out.println("Size of Dire queue: "+ qd.size()+" "+ qr);
        for (; !qr.isEmpty() && !qd.isEmpty(); ) {
            int r_i = qr.poll();
            System.out.println("Radiant "+r_i);
            int d_i = qd.poll();
            System.out.println("Dire: "+ d_i);
            if (r_i < d_i) qr.add(r_i + n);
            else qd.add(d_i + n);
        }
        return qr.size() > qd.size() ? "Radiant" : "Dire";
    }

    public static void main(String[] args) {
        //String senate1 = "RD";
        String senate2 = "RDD";
        //System.out.println( predictPartyVictory(senate1));
        System.out.println( predictPartyVictory(senate2));
    }
}













