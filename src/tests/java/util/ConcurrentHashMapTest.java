package tests.java.util;

import org.junit.Test;
import tests.base.BaseTest;

import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapTest extends BaseTest {

	@Test
	public void testHashcode() {

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();  //初始化ConcurrentHashMap

		//新增个人信息
		map.put("id", "1");
		map.put("name", "andy");
		map.put("sex", "男");
		//获取姓名
		String name = map.get("name");

		//计算大小
		int size = map.size();

	}
}


