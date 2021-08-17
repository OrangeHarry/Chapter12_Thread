package ch12_2_thread_control;

public class PrintThread1 extends Thread{
	private boolean stop; //기본값 false

	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		while(!stop) { //stop이 true가 될때
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
