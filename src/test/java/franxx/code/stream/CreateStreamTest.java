package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(value -> {
            System.out.println(value);
        });

        Stream<String> oneStream = Stream.of("Mee");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = "Code";
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(v -> {
            System.out.println(v);
        });
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Zero", "Two", "Franxx");
        arrayStream.forEach(v -> System.out.println(v));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 32, 1, 32, 123, 23, 12, 13);
        integerStream.forEach(v -> System.out.println(v));

        String[] array = new String[]{
                "Franxx", "Code", "002"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreatedStreamFromCollection() {
        Collection<String> collection = List.of("Hilmi", "FFXX", "Felix");

        Stream<String> stringStream = collection.stream();
        Stream<String> stringStream2 = collection.stream();

        // not re use `stream`
        stringStream.forEach(System.out::println);
        stringStream2.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Zero Two");
        //stream.forEach(System.out::println);

        Stream<Integer> iterator = Stream.iterate(1, v -> v + 1);
        //iterator.forEach(System.out::println);
    }
}
