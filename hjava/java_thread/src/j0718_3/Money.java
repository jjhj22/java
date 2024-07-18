package j0718_3;

public class Money {
	private int myMoney=10000;
	public int getMyMoney() {
		return myMoney;
	}
	//widhdraw메서드를 임계영역으로 설정
	public synchronized boolean widhdraw(int money) {
		if(myMoney >= money) {
		//현재 보유 금액보다 출금금액이 작거나 같다면 출금
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
			//출금
			myMoney -=money;
			return true;
		}
		return false; // 출금 실패(돈 부족)
	}
}
