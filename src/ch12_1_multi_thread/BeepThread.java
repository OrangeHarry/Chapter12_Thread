package ch12_1_multi_thread;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}


//�ؿ� �� ��츦 Ȱ���ؼ� �����带 ����� �� �ִ�.
class Task1 extends Thread{//�Ϲ� ����̶� ���� ���� �����Ǹ� �������
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
class Task2 implements Runnable{//�������̽��� ������ �����ǰ� ��
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}