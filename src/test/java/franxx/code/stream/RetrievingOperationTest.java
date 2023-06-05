package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationTest {
    @Test
    void testLimit() {
        List.of("Hitomi", "Yue", "Yuu", "Kei", "Reimi", "Hitori", "Futari")
                .stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkip() {
        List.of("Hitomi", "Yue", "Yuu", "Kei", "Reimi", "Hitori", "Futari")
                .stream()
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhile() {
        List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .takeWhile(v -> v.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhile() {
        List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .dropWhile(v -> v.length() <= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAny() {
        Optional<String> optional = List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .findAny();

        optional.ifPresent(v -> System.out.println(v));
    }

    @Test
    void testFindFirst() {
        Optional<String> optional = List.of("Yue", "Yuu", "Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .findFirst();

        optional.ifPresent(v -> System.out.println(v));
    }
}
