package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();

        builder.accept("002");
        builder.add("Zero").add("Two");

        Stream<String> stream = builder.build();
        stream.forEach(v -> System.out.println(v));
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Ram").add("Rem").add("Subaru").build();
        stream.forEach(v -> System.out.println(v));
    }
}
