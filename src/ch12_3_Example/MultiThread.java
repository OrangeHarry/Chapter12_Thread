package ch12_3_Example;

import javax.swing.JOptionPane;

public class MultiThread {
	public static void main(String[] args) {
		/*
		 * swing 사용 윈도우 프로그램
		 */
		
		Thread th1 = new Thread(new Runnable() { //새로운 스레드를 만들어서 실행
			@Override
			public void run() { //synchronized 얘를 해줘야 동기화가 되지??
				for (int i = 0; i < 10; i++) {
					System.out.println(10 - i);
					try {
						Thread.sleep(1 * 1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하세요"); //메인스레드 에서 실행
		System.out.println("입력하신 값은 " + input + " 입니다.");
	}
}
