package ch12_1_multi_thread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);// sleep은 스레드를 잠시 멈추는 것
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
