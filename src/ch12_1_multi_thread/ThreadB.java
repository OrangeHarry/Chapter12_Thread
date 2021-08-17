package ch12_1_multi_thread;

public class ThreadB extends Thread {
	public ThreadB() {
		setName("ThreadB");
	}

	@Override
	public void run() {
		for (int i = 0; i < 2000; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
