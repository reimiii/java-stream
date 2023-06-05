package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationTest {
    @Test
    void testMap() {
        List.of("FranXX", "Zero", "Two").stream()
                .map(v -> v.toUpperCase())
                .map(v -> v.length())
                .forEach(v -> System.out.println(v));
    }

    @Test
    void testFlatMap() {
        List.of("FranXX", "Zero", "Two").stream()
                .map(v -> v.toUpperCase())
                .flatMap(v -> Stream.of(v, v.length()))
                .flatMap(v -> Stream.of(v, v, v))
                .forEach(v -> System.out.println(v));

    }
}
