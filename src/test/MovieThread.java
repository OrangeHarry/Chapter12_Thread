package test;

public class MovieThread extends Thread {
//	@Override
//	public void run() {
//		try {
//			while (true) {
//				System.out.println("�������� ����մϴ�");
//				Thread.sleep(1000);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("�������� �����մϴ�.");
//		}
//	}
//}
	@Override
	public void run() {
		while (true) {
			System.out.println("�������� ����մϴ�.");
			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("�������� �����մϴ�.");
	}
}