package ch12_2_thread_control;

public class DemonExample {
	public static void main(String[] args) {
		AutoSaver saver = new AutoSaver(20);

		// ���󽺷��� ����
		saver.setDaemon(true);
//		if (saver.isDaemon()) { //�������� ���������
		saver.start();
//		}

		System.out.println("������ �� : " + Thread.activeCount());

		try {
			Thread.sleep(5 * 1000); //saver.start()�� �����̴� �ð��� �갡 ������ �ſ���...��ġ ���� �����尡 �� �������� �ӵ��� �ξ� �����ϱ� �ٷ� �ؿ� print()�޼ҵ�� �����ϰ��� 
		} catch (Exception e) {
			e.printStackTrace();
		}
		saver.print();
		System.out.println(Thread.currentThread().getName() + " ����");
	}
}
