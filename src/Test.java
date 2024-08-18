import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class Test extends Thread {


    public static void main(String[] args) {
        Set<Integer> set = Set.of(1, 2, 3, 4);
        Set<Integer> set1 = new HashSet<Integer>() {{
            add(4);
            add(2);
            add(1);
            add(3);
        }};
        System.out.println(set1.equals(set));
    }
}
