package ch12_3_Example;

class Withdrawer implements Runnable {

	Account account = new Account();

	@Override
	public void run() {
		//����ϱ�
		while(account.getBalance() > 0) {
			//100, 200, 300�� �� ���Ƿ� ���
			int money = (int)(Math.random()*3 + 1) *100;
			account.withdraw(money);
			System.out.println("�����ܰ� : "+account.getBalance());
		}
	}
}

public class AccountExample {
	public static void main(String[] args) {
		//����ϴ� ���� ����ȭ(��Ƽ ������ ����)
		Runnable withdrwer = new Withdrawer();
		
		Thread jWorker = new Thread(withdrwer);
		Thread yWorker = new Thread(withdrwer);
		
		jWorker.start();
		yWorker.start();
		
		
		
		

	}
}