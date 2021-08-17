package ch12_2_thread_control;

public class DemonExample {
	public static void main(String[] args) {
		AutoSaver saver = new AutoSaver(20);

		// 데몬스레드 설정
		saver.setDaemon(true);
//		if (saver.isDaemon()) { //위에꺼랑 같은방법임
		saver.start();
//		}

		System.out.println("스레드 수 : " + Thread.activeCount());

		try {
			Thread.sleep(5 * 1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		saver.print();
		System.out.println(Thread.currentThread().getName() + " 종료");
	}
}
