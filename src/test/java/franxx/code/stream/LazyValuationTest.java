package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyValuationTest {
    @Test
    void testIntermediateOperation() {
        List<String> list = List.of("Hilmi", "Akbar", "Muharrom");

        Stream<String> stream = list.stream()
                .map(v -> {
                    System.out.println("Change " + v + "TO UPPER CASE");
                    return v.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> list = List.of("Hilmi", "Akbar", "Muharrom");

        list.stream()
                .map(v -> {
                    System.out.println("Change " + v + " to UPPERCASE");
                    return v.toUpperCase();
                })
                .map(v -> {
                    System.out.println("Change UPPERCASE " + v + " to Mr");
                    return "Mr. " + v;
                })
                .forEach(v -> {
                    System.out.println(v);
                });
    }
}
