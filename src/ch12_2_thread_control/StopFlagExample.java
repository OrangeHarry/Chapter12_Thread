package ch12_2_thread_control;

public class StopFlagExample {
	public static void main(String[] args) {
		PrintThread1 th1 = new PrintThread1();
		th1.start();

		try {
			Thread.sleep(3 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		th1.setStop(true); //스레드를 종료하기 위해 stop필드를 true로 변경
	}
}
