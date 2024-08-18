import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleClasss {
    //array int
    //remove dups
    public static void main(String[] args) {
        int[] nums1 = {4,8,9,0,0,0};
        int[] nums2 = {2,5,6};
        int m=3;
        int n=3;
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        List<String> list = List.of("A", "B", "A", "C");

        List<String> nonDups = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by element and count occurrences
                .entrySet().stream() // Convert map entries to stream
                .filter(entry -> entry.getValue() == 1) // Filter out elements with more than one occurrence
                .map(Map.Entry::getKey) // Extract the key (the element itself)
                .collect(Collectors.toList()); // Collect the result as a list

        System.out.println(nonDups); // Output: [B, C]
    }


}
