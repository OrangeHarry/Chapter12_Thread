package ch12_2_thread_control;

public class PrintThread1 extends Thread{
	private boolean stop; //�⺻�� false

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) { //stop�� true�� �ɶ�
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
