package ch12_1_multi_thread;

import java.awt.Toolkit;

import javax.swing.JFrame;

class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("���� ������ ������");
		setSize(300, 500);
		setVisible(true);
	}
}

public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Tookit��ü ���
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // ������ �߻�
			try {
				Thread.sleep(500);// 0.5�ʰ� �Ͻ�����
			} catch (Exception e) {
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);// sleep�� �����带 ��� ���ߴ� ��
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
