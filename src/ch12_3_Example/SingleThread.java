package ch12_3_Example;

import javax.swing.JOptionPane;

public class SingleThread {
	public static void main(String[] args) {
		/*
		 * swing ��� ������ ���α׷�
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println(10 - i);
			try {
				Thread.sleep(1 * 1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���"); // �� �ű��ϳ� �̰�
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
	}
}
