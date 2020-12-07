package tests.java.util;

import org.junit.Test;
import tests.base.BaseTest;

import java.util.ArrayList;


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

	@Test
	public void subListTest() {
		ArrayList<String> list = new ArrayList<>();
		list.add("test");
		list.add("test2");
		list.add("test3");
		list.subList(1, 2);
		System.out.println(list.subList(1, 2));
	}

}
