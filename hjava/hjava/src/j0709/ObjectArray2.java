package j0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		
		Game[] gm = new Game[7];
		
		gm[0] = new Game("서든어택","fps","pc");
		gm[1] = new Game("리그오브레전드","롤플레잉","pc");
		gm[2] = new Game("크레이지아케이드","액션게임","pc");
		gm[3] = new Game("버블파이터","fps","pc");
		gm[4] = new Game("카트라이더","경주게임","pc");
		gm[5] = new Game("테트리스","비디오게임","pc");
		gm[6] = new Game("배틀그라운드","fps","pc");
		
		for(int i=0; i<gm.length; i++) {
			System.out.println(gm[i]);
		}

	}

}
//7개의 게임정보를 가진
//객체를 생성하고 출력하세요
