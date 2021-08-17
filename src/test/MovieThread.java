package test;

public class MovieThread extends Thread {
//	@Override
//	public void run() {
//		try {
//			while (true) {
//				System.out.println("동영상을 재생합니다");
//				Thread.sleep(1000);
//			}
//		} catch (InterruptedException e) {
//			System.out.println("동영상을 종료합니다.");
//		}
//	}
//}
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("동영상을 종료합니다.");
	}
}