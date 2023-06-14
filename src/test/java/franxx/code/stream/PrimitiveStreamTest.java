package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreamTest {
    @Test
    void testCreate() {
        IntStream intStream = IntStream.range(1, 100);
        intStream.forEach(value -> System.out.println(value));

        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);

        DoubleStream doubleStream = DoubleStream.builder()
                .add(0.1)
                .add(1.1)
                .add(2.1)
                .build();
    }

    @Test
    void testOperation() {
        IntStream intStream = IntStream.range(1, 100);

        OptionalDouble optionalDouble = intStream.average();
        optionalDouble.ifPresent(System.out::println);

        IntStream.range(1, 100)
                .mapToObj(n -> "Number: " + n)
                .forEach(System.out::println);
    }
}
