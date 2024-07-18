package j0718;

public class MainClass3 {

	public static void main(String[] args) {
		MeThread th1 = new MeThread(2000,"이천");
		MeThread th2 = new MeThread(3000,"삼천");
		
		//순차적으로 쓰레드 실행
		th1.start();
		
		try {
			th1.join();
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		
		th2.start();
		

	}

}

/*
 
  	sleep(밀리세컨드) - 지정된 시간만큼 대기
  	start() - 쓰레드 시작, run메서드 호출
  	join() - 해당 쓰레드가 끝날 때까지 다음 쓰레드 대기
  	run() - 쓰레드가 실행되는 메서드
  	stop() - 쓰레드를 중단(사용을 권장하지 않음)
  	interrupt() - 쓰레드 중단
  	setPriority(정수값) - 쓰레드의 우선순위
  	getPriority() - 설정된 쓰레드 우선순위값
  	isAlive() - 현재 쓰레드가 살아있다면 true, 종료되었다면 false
  	
  	suspend() - 쓰레드를 일시정지 시킨다 (사용을 권장하지 않음)
  	resume() - 일시정지 된 쓰레드를 실행 (사용을 권장하지 않음)
  	
  	yield() - 다른 쓰레드에게 실행 상태를 양보하고 대기
  	notify() - 대기상태에 있는 쓰레드를 실행대기로 변환
  			   실행대기에 있는 쓰레드는 실행상태로 변환된다
  
  
*/
