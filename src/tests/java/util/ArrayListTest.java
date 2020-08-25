package tests.java.util;

import org.junit.Test;
import tests.base.BaseTest;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest extends BaseTest {
    @Test
    public void testHashcode() {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test2");
        list.add("test3");
        list.remove(1);
        String s = list.toString();
        list.trimToSize();
        list.trimToSize();
        System.out.println(list.toString());
    }
}
