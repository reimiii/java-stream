package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List.of("Hitomi", "Yue", "Yuu", "Kei", "Reimi", "Hitori", "Futari")
                .stream()
                .filter(v -> v.length() > 4)
                .forEach(v -> System.out.println(v));

    }

    @Test
    void testFilterModulo() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .filter(v -> v % 2 == 0)
                .forEach(v -> System.out.println(v));
    }

    @Test
    void testDistinct() {
        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 1, 2, 3)
                .stream()
                .distinct()
                .forEach(v -> System.out.println(v));
    }
}
