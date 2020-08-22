package tests.java.util;

import org.junit.Test;
import tests.base.BaseTest;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest extends BaseTest {
    @Test
    public void testHashcode() {
        List<String> list = new ArrayList<>();
        list.add("test");
        System.out.println(list);
    }
}
