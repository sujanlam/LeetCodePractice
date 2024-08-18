package leetcode50;

import java.util.HashSet;

public class CheckIfStringContainDups {
    public static void main(String[] args) {
        String s1= "apple";
        String s2= "mango";
        System.out.println(containDups(s1));
        System.out.println(containDups(s2));

    }

    private static boolean containDups(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); i++) {
            if(!set.add(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
