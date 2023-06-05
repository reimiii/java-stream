package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {
    @Test
    void testMax() {
        List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .max(Comparator.naturalOrder())
                .ifPresent(v -> System.out.println(v));
    }

    @Test
    void testMin() {
        List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .min(Comparator.naturalOrder())
                .ifPresent(v -> System.out.println(v));
    }

    @Test
    void testCount() {
        long count = List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .count();

        System.out.println(count);
    }

    @Test
    void testSum() {
        Integer reduce = List.of(1, 2, 3, 4, 5)
                .stream()
                .reduce(0, (v, i) -> v + i);

        System.out.println(reduce);
    }

    @Test
    void testFactorial() {
        Integer reduce = List.of(1, 2, 3, 4, 5)
                .stream()
                .reduce(1, (v, i) -> v * i);

        System.out.println(reduce);
    }
}
