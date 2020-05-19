package tests.java.util;

import org.junit.Test;
import tests.base.BaseTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: chuanlei.guo
 * @Date: 2020-05-19
 */
public class ArrayListTest extends BaseTest {
    @Test
    public void testHashcode() {
        List<String> list = new ArrayList<>();
        list.add("test");
        System.out.println(list);
    }
}
