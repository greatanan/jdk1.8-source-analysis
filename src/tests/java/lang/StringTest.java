package tests.java.lang;

import org.junit.Test;
import tests.base.BaseTest;

/**
 * 学习测试String类的源码案例
 *
 * @see tests.base.BaseTest 测试基类 主要放置一些测试公用的方法或变量，方便灵活测试
 */
public class StringTest extends BaseTest {

    private static int time = 100000;

    @Test
    public void test1() {
        String s1 = "hello world"; //运行在这的时候 会开辟一个内存空间 存放"hello world"  然后把s1指向这个内存空间上
        String s2 = new String("hello world");
        String s3 = "hello world";  //这个时候发现常量池里面已经有"hello world"了  把时s3直接指向该内存空间  所有s1和s3指向的是同一个位置
        String s4 = new String("hello world");
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s2 == s4);//false
    }

    @Test
    public void test2() {
        String s1 = "";
        for (int i = 0; i < 1000; i++) {
            s1 += "a";  //这个时候jvm会优化 变成StringBuilder为我们拼接  但是还是创建了1000个StringBuilder对象  所以这种直接拼接还是要避免的
        }
        System.out.println(s1);
    }

    @Test
    public void testString() {
        String s1 = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            s1 += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("String拼接用时： " + (end - start));//4156
    }

    @Test
    public void testStringStringBuilder() {
        StringBuilder builder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            builder.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder拼接用时： " + (end - start));//4
    }

    @Test
    public void testStringStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            buffer.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuffer拼接用时： " + (end - start));//5
    }

    @Test
    public void testString2() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            String s = "a" + "b" + "c"; //在编译的时候已经知道这些确定的值了 直接优化成"abc"字符串
        }
        long end = System.currentTimeMillis();
        System.out.println("String直接拼接用时： " + (end - start));//2
    }

    @Test
    public void testString3() {
        String a = "a";
        String b = "b";
        String c = "c";
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            String s = a + b + c;
        }
        long end = System.currentTimeMillis();
        System.out.println("String间接拼接用时： " + (end - start));//20
    }

    @Test
    public void testString4() {
        String a = "helloa";
        String b = "hello" + "a"; //在编译的时候就会优化成helloa 因为这是直接拼接的
        String c = b + "a";
        System.out.println(a == b);//true
        System.out.println(c==b);//false

    }
    @Test
    public void testString5() {
        String s = new String("abc");
        //问：执行的时候创建了几个对象

    }


}
