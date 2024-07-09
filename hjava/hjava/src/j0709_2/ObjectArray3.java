package j0709_2;

public class ObjectArray3 {

	public static void main(String[] args) {
		
		BoardDAO dao= new BoardDAO();
		Board[] list = dao.findByAll();

	}

}
