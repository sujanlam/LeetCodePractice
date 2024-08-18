import java.util.*;

public class Tests {
     public int answer(int a, int b){
       if(a/b == 0){
           throw new ArithmeticException();
         }
       return a/b;
     }

    public static void main(String[] args) throws Exception{
         List<Integer> list = Arrays.asList(2,1,4,5,4);
         list.forEach(System.out::println);
         Set<Integer> sett = new TreeSet<>();
         sett.add(99);
         sett.add(45);
         sett.add(45);
         sett.add(55);
        System.out.print(sett);
    }
}
