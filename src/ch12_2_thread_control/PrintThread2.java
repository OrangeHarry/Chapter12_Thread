package ch12_2_thread_control;

public class PrintThread2 extends Thread{
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행 중");
				//스레드가 실행대기, 실행 상태 일때는 예외가 발생X //interrupt()가 무의미한 상황 
				//스레드가 일시정지(sleep)상태 일때만 가능 
				Thread.sleep(1); //InterruptedException 발생
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
