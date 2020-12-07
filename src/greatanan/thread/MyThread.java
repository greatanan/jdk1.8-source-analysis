package greatanan.thread;


public class MyThread {

	private static int count = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new Thread(() -> {
				try {
					 Thread.sleep(20);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 每个线程让count自增100次
				for (int i1 = 0; i1 < 100; i1++) {
					synchronized (MyThread.class){
						System.out.println(Thread.currentThread()+"   " + count  + "   " +i1);
						count++;
					}
				}
			}).start();
		}

		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}
}
