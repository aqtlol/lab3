import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.reflect.Array;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("fruit");
        list.add("strawberry");
        list.add("pineapple");
        list.add("grapes");

        StringChecker sc = new ListExamples();

        List<String> expected = new ArrayList<>(); // new String[] {"strawberry", "pineapple"}
        expected.add("strawberry");
        expected.add("pineapple");

        assertEquals(expected, ListExamples.filter(list, sc));
    }
}
