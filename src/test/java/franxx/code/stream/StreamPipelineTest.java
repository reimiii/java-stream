package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testCreateStreamPipeline() {
        // Rarely used
        List<String> list = List.of("FranXX", "Zero", "Two", "Darling");

        Stream<String> stream = list.stream();

        Stream<String> upper = stream.map(v -> v.toUpperCase());
        Stream<String> mr = upper.map(v -> "Mr. " + v);

        mr.forEach(v -> System.out.println(v));
    }

    @Test
    void testStreamPipelineOk() {
        List<String> list = List.of("FranXX", "Zero", "Two", "Darling");

        list.stream()
                .map(v -> v.toUpperCase())
                .map(v -> "Mr. " + v)
                .forEach(v -> System.out.println(v));
    }
}
