package ch12_1_multi_thread;

public class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for(int i=0; i<2000; i++) {
			System.out.println(getName() +"�� ����� ����");
		}
	}

}
