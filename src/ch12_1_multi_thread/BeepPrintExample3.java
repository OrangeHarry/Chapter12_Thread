package ch12_1_multi_thread;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Task1());
		Thread th2 = new Thread(new Task2()); //둘다 똑같은 방식으로 실행시키면돼
	
		
		
		th1.start();
		th2.start();
	}
}
