package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {
    @Test
    void testGroupingBy() {
        Map<String, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.groupingBy(n -> {
                    if (n > 5) {
                        return "Besar";
                    } else {
                        return "Kecil";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy() {
        Map<Boolean, List<Integer>> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.partitioningBy(n -> {
                    return n > 5;
                }));

        System.out.println(collect);
    }

    @Test
    void testGroupingBy2() {
        Map<String, List<String>> collect = Stream.of("Mee", "Vlad", "T34", "F2G", "MiG 29", "Peter", "The F 8819zzk")
                .collect(Collectors.groupingBy(n -> {
                    if (n.length() > 4) {
                        return "Panjang";
                    } else {
                        return "Pendek";
                    }
                }));

        System.out.println(collect);
    }

    @Test
    void testPartitioningBy2() {
        Map<Boolean, List<String>> collect = Stream.of("Mee", "Vlad", "T34", "F2G", "MiG 29", "Peter", "The F 8819zzk")
                .collect(Collectors.partitioningBy(n -> {
                    return n.length() > 4;
                }));

        System.out.println(collect);
    }
}
