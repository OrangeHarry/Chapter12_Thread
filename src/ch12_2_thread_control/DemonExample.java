package ch12_2_thread_control;

public class DemonExample {
	public static void main(String[] args) {
		AutoSaver saver = new AutoSaver(20);

		// 데몬스레드 설정
		saver.setDaemon(true);
//		if (saver.isDaemon()) { //위에꺼랑 같은방법임
		saver.start();
//		}

		System.out.println("스레드 수 : " + Thread.activeCount());

		try {
			Thread.sleep(5 * 1000); //saver.start()가 움직이는 시간을 얘가 벌어준 거였네...그치 메인 스레드가 쭉 내려가는 속도가 훨씬 빠르니깐 바로 밑에 print()메소드로 도달하것지 
		} catch (Exception e) {
			e.printStackTrace();
		}
		saver.print();
		System.out.println(Thread.currentThread().getName() + " 종료");
	}
}
