package franxx.code.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {
    Stream<String> getStream() {
        return Stream.of("FranXX", "CODE", "Zero", "Two");
    }

    @Test
    void testCollection() {
        Set<String> set = getStream().collect(Collectors.toSet());
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());

        List<String> list = getStream().collect(Collectors.toList());
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());

        System.out.println(set);
        System.out.println(immutableSet);
        System.out.println(list);
        System.out.println(immutableList);
    }

    @Test
    void testMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
                s -> s,
                s -> s.length()
        ));

        System.out.println(map);
    }
}
