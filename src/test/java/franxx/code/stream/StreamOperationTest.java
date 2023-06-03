package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {
    @Test
    void testStreamOperation() {
        List<String> names = List.of("PinkMan", "Walter", "White");
        Stream<String> streamNames = names.stream();

        Stream<String> streamUpper = streamNames.map(v -> v.toUpperCase());

        streamUpper.forEach(v -> System.out.println(v));
        names.forEach(v -> System.out.println(v));
    }
}
