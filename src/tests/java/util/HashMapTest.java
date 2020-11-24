package tests.java.util;

import org.junit.Test;
import tests.base.BaseTest;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: chuanlei.guo
 * @Date: 2020-05-19
 */
public class HashMapTest extends BaseTest {
    @Test
    public void testHashcode() {
        Map<String,String> map = new HashMap<>();
        map.put("test1", "test");
        map.put("test2", "test");
        map.put("test3", "test");
        map.put("test4", "test");
        map.put("test5", "test");
        map.put("test6", "test");
        map.put("test7", "test");
        map.put("test8", "test");
        map.put("test9", "test");
        map.put("test10", "test");
        map.put("test11", "test");
        map.put("test12", "test");
        map.put("test13", "test");
        map.put("test14", "test");
        map.put("test15", "test");
        map.put("test16", "test");


        String s = map.get("test");
        System.out.println(s);
    }
}
