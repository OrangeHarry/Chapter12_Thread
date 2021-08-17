package ch12_1_multi_thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
		this.memory = memory; // 매개값을 memory필드에 저장
		try {
			Thread.sleep(2 * 1000); // 2초라고 바로 알아보기 편하게 쓴거
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}                               // 스레드 이름얻기                                              //메모리값
}
