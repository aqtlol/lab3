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

        assertEquals(new String[] {"apple", "pineapple"}, ListExamples.filter(list, null));
    }
}
