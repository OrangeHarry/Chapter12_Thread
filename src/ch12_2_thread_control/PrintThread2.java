package ch12_2_thread_control;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("���� ��");
				//�����尡 ������, ���� ���� �϶��� ���ܰ� �߻�X //interrupt()�� ���ǹ��� ��Ȳ 
				//�����尡 �Ͻ�����(sleep)���� �϶��� ���� 
				Thread.sleep(1); //InterruptedException �߻�
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
