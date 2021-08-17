package ch12_2_thread_control;

public class InterruptExample {
	public static void main(String[] args) {
//		Thread thread = new PrintThread2();
		Thread  thread = new PrintThread3();
		thread.start();

		try {
			Thread.sleep(1 * 1000);
		} catch (InterruptedException e) {
//			e.printStackTrace();
		}

		//스레드를 종료하기 위해 InterruptedException을 발생시킨다.
		thread.interrupt(); //PrintThread2으 catch상태로 예외를 던져버린다.
	}
}
