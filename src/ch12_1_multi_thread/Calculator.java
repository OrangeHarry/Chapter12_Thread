package ch12_1_multi_thread;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { // ���� �޸𸮿� ���� �����ϴ� �޼ҵ�
		this.memory = memory; // �Ű����� memory�ʵ忡 ����
		try {
			Thread.sleep(2 * 1000); // 2�ʶ�� �ٷ� �˾ƺ��� ���ϰ� ����
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}                               // ������ �̸����                                              //�޸𸮰�
}
