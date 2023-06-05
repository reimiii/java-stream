package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .map(v -> {
                    System.out.println("Before : " + v);
                    String upper = v.toUpperCase();
                    System.out.println("After : " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("Final : " + name));
    }

    @Test
    void testPeekAfter() {
        List.of("Kei", "Hitomi", "Yue", "Reimi", "Hitori", "Futari")
                .stream()
                .peek(v -> System.out.println("Before Upper: " + v))
                .map(v -> v.toUpperCase())
                .peek(v -> System.out.println("After Upper: " + v))
                .forEach(name -> System.out.println("Final : " + name));
    }

}
