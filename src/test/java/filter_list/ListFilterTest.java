package filter_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListFilterTest {

    @Test
    public void examples() {
        assertEquals(List.of(1, 2), ListFilter.integerFilter(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
        assertEquals(List.of(1, 0, 15), ListFilter.integerFilter(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
        assertEquals(List.of(1, 2, 123), ListFilter.integerFilter(List.of(1, 2, "plane", "donkey", "desk", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}
