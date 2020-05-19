package tests.java.lang;

import org.junit.Test;
import tests.base.BaseTest;

/**
 * ѧϰ����String���Դ�밸��
 *
 * @see tests.base.BaseTest ���Ի��� ��Ҫ����һЩ���Թ��õķ��������������������
 */
public class StringTest extends BaseTest {

    private static int time = 100000;

    @Test
    public void test1() {
        String s1 = "hello world"; //���������ʱ�� �Ὺ��һ���ڴ�ռ� ���"hello world"  Ȼ���s1ָ������ڴ�ռ���
        String s2 = new String("hello world");
        String s3 = "hello world";  //���ʱ���ֳ����������Ѿ���"hello world"��  ��ʱs3ֱ��ָ����ڴ�ռ�  ����s1��s3ָ�����ͬһ��λ��
        String s4 = new String("hello world");
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s2 == s4);//false
    }

    @Test
    public void test2() {
        String s1 = "";
        for (int i = 0; i < 1000; i++) {
            s1 += "a";  //���ʱ��jvm���Ż� ���StringBuilderΪ����ƴ��  ���ǻ��Ǵ�����1000��StringBuilder����  ��������ֱ��ƴ�ӻ���Ҫ�����
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
        System.out.println("Stringƴ����ʱ�� " + (end - start));//4156
    }

    @Test
    public void testStringStringBuilder() {
        StringBuilder builder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            builder.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilderƴ����ʱ�� " + (end - start));//4
    }

    @Test
    public void testStringStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            buffer.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBufferƴ����ʱ�� " + (end - start));//5
    }

    @Test
    public void testString2() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < time; i++) {
            String s = "a" + "b" + "c"; //�ڱ����ʱ���Ѿ�֪����Щȷ����ֵ�� ֱ���Ż���"abc"�ַ���
        }
        long end = System.currentTimeMillis();
        System.out.println("Stringֱ��ƴ����ʱ�� " + (end - start));//2
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
        System.out.println("String���ƴ����ʱ�� " + (end - start));//20
    }

    @Test
    public void testString4() {
        String a = "helloa";
        String b = "hello" + "a"; //�ڱ����ʱ��ͻ��Ż���helloa ��Ϊ����ֱ��ƴ�ӵ�
        String c = b + "a";
        System.out.println(a == b);//true
        System.out.println(c==b);//false

    }
    @Test
    public void testString5() {
        String s = new String("abc");
        //�ʣ�ִ�е�ʱ�򴴽��˼�������

    }


}
