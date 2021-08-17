package ch12_1_multi_thread;

import java.awt.Toolkit;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("나의 윈도우 프레이");
		setSize(300, 500);
		setVisible(true);
	}
}

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Tookit객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500);// 0.5초간 일시정지
			} catch (Exception e) {
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);// sleep은 스레드를 잠시 멈추는 것
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
