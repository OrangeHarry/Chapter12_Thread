package ch12_3_Example;

public class Account {
	//잔고
	private int balance = 10_000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) { //synchronized가 있어야 오류가 없지(객체가 잠금을 걸어 실행중 다른 스레드가 실행하지 못하게한다 
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
