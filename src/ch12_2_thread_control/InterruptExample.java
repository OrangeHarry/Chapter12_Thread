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

		//�����带 �����ϱ� ���� InterruptedException�� �߻���Ų��.
		thread.interrupt(); //PrintThread2�� catch���·� ���ܸ� ����������.
	}
}
