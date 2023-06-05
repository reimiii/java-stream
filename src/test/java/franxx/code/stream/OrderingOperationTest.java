package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverse = Comparator.reverseOrder();
        List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .sorted(reverse)
                .forEach(System.out::println);

    }
}
