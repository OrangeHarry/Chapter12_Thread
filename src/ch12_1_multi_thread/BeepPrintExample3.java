package ch12_1_multi_thread;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Task1());
		Thread th2 = new Thread(new Task2()); //�Ѵ� �Ȱ��� ������� �����Ű���
	
		
		
		th1.start();
		th2.start();
	}
}
