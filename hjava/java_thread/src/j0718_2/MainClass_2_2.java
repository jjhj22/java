package j0718_2;

public class MainClass_2_2 {

	public static void main(String[] args) throws InterruptedException {
		
		NormalTh th = new NormalTh("일반");
		th.start();
		
//		DaemonTh dm = new DaemonTh();
//		dm.setDaemon(true);
//		
//		dm.start();
		
		Thread.sleep(6000);
		
		System.out.println("main 종료");

	}

}
