package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationTest {
    @Test
    void testAnyMatch() {
        boolean match = List.of(21, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .anyMatch(v -> v > 20);
        System.out.println(match);
    }

    @Test
    void testAllMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .allMatch(v -> v > 1);
        System.out.println(match);
    }

    @Test
    void testNoneMatch() {
        boolean match = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .stream()
                .noneMatch(v -> v > 10);
        System.out.println(match);
    }
}
