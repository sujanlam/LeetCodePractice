package leetcode50;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashvsLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> l=new LinkedHashMap<Integer,String>();
        l.put(100,"John");  // Adding Elements

        l.put(103,"Zoya");
        l.put(102,"Arya");
        l.put(101,"Dev");

        for(Map.Entry m:l.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> m=new HashMap<Integer,String>();
        m.put(3,"Sam");
        m.put(1,"Chris");  //Adding elements in Map
        m.put(2,"Morris");

        m.put(4,"Cruise");
        System.out.println("Iterating Hashmap...");
        for(Map.Entry me : m.entrySet()){
            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
