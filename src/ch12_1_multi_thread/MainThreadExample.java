package ch12_1_multi_thread;

public class MainThreadExample {
	public static void main(String[] args) {

		/*
		 * [멀티스레딩의 단점] 
		 * 여러 스레드가 같은 프로세스 내에서 자원 공유하면 생기는 문제 
		 * -동기화(synchronization)
		 * -교착상태(deadlock)
		 */
		
		
	
		Calculator calc = new Calculator();

		Thread jung = new Thread() {   //별다른 생성 없이 익명객체 값으로 구현
			@Override
			public void run() {
				calc.setMemory(100);
			}
		};
		jung.setName("Jung's Thread");
		Thread park = new Thread(new Runnable() {

			@Override
			public void run() {
				calc.setMemory(50);
			}
		});
		park.setName("Park's Thread");

		jung.start();
		park.start(); //이야 큰일날 놈이야 //동기화메소드를 쓰자!! synchronized
	}
}
