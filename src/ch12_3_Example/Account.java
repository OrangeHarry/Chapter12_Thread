package ch12_3_Example;

public class Account {
	//�ܰ�
	private int balance = 10_000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) { //synchronized�� �־�� ������ ����(��ü�� ����� �ɾ� ������ �ٸ� �����尡 �������� ���ϰ��Ѵ� 
		if(balance >= money) {
			try {
				Thread.sleep(1*1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			balance -= money;
		}
	}
}
