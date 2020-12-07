package tests.java.util.concurrent;

import greatanan.thread.MyThread;
import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: chuanlei.guo
 * @date: 2020/12/07
 */
public class ReentrantLockTest {

	// 1. 初始化可重入锁
	private ReentrantLock lock = new ReentrantLock();

	@Test
	public void lockTest() {

		// 加锁
		lock.lock();
		try {
			Thread.sleep(1);
			System.out.println("test");
			// 2. 执行临界区代码
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// 3. 解锁
			lock.unlock();
		}


	}

	@Test
	public void Test() {

		for (int i = 0; i < 2; i++) {
			new Thread(() -> {
				try {
					Thread.sleep(20);
					// 加锁
					lock.lock();
					try {
						Thread.sleep(300000);
						System.out.println("test");
						// 2. 执行临界区代码
					} catch (InterruptedException e) {
						e.printStackTrace();
					} finally {
						// 3. 解锁
						lock.unlock();
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}).start();
		}

		try {
			Thread.sleep(600000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
