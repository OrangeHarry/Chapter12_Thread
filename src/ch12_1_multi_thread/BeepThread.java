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


//밑에 두 경우를 활용해서 쓰레드를 사용할 수 있다.
class Task1 extends Thread{//일반 상속이라 내가 직접 재정의를 해줘야해
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
}
class Task2 implements Runnable{//인터페이스니 강제로 재정의가 뜸
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}