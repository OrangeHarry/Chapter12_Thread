package ch12_3_Example;

import javax.swing.JOptionPane;

public class MultiThread {
	public static void main(String[] args) {
		/*
		 * swing ��� ������ ���α׷�
		 */
		
		Thread th1 = new Thread(new Runnable() { //���ο� �����带 ���� ����
			@Override
			public void run() { //synchronized �긦 ����� ����ȭ�� ����??
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
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ϼ���"); //���ν����� ���� ����
		System.out.println("�Է��Ͻ� ���� " + input + " �Դϴ�.");
	}
}
