// 10.2  Demonstrate the use of minBy(), maxBy(), summingInt(), and averagingInt() collectors.

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class Collectors{

    public static void main(String[] args){

        List<Integer> numbers = Arrays.asList(10, 5, 8, 15, 3);

        // Find the minimum value using min()
        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
        System.out.println("Minimum Value: " + min.orElse(0));

        // Find the maximum value using max()
        Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
        System.out.println("Maximum Value: " + max.orElse(0));

        // Calculate the sum using sum()
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        // Calculate the average using average()
        double average = numbers.stream().mapToDouble(Integer::intValue).average().orElse(0.0);
        System.out.println("Average: " + average);

        // Collect additional statistics using IntSummaryStatistics
        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("Statistics: " + stats);
    }

}