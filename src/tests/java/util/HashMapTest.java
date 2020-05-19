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
        map.put("test", "test");
        String s = map.get("test");
        System.out.println(s);
    }
}
