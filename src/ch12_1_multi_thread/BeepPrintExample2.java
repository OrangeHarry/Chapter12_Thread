package ch12_1_multi_thread;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Thread th = new Thread(new BeepTask());
		th.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);// sleep�� �����带 ��� ���ߴ� ��
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
