package tests.java.thread.threadLocal;

import org.junit.Test;
import tests.base.BaseTest;

/**
 *
 */
public class ThreadLocalTest extends BaseTest {

	@Test
	public void autoAddNumberTest() throws InterruptedException {

		AutoAddNumber an = new AutoAddNumber();

		AutoAddNumberThreadLocalThread testThread1 = new AutoAddNumberThreadLocalThread(an);
		AutoAddNumberThreadLocalThread testThread2 = new AutoAddNumberThreadLocalThread(an);
		AutoAddNumberThreadLocalThread testThread3 = new AutoAddNumberThreadLocalThread(an);
		AutoAddNumberThreadLocalThread testThread4 = new AutoAddNumberThreadLocalThread(an);

		testThread1.start();
		Thread.sleep(20);

		testThread2.start();
		testThread3.start();
		testThread4.start();

		Thread.sleep(200000);

	}


	static class AutoAddNumberThreadLocalThread extends Thread {

		private AutoAddNumber an;

		public AutoAddNumberThreadLocalThread(AutoAddNumber an) {
			this.an = an;
		}

		@Override
		public void run() {
			for (int i = 0; i < 1; i++) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("当前线程是：" + Thread.currentThread().getName() + "对应的编号是:" + an.getNextNum());
			}
		}

	}


}
