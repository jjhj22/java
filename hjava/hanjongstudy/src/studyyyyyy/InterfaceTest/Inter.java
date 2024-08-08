package studyyyyyy.InterfaceTest;

public interface Inter {
	default String vehicle(String val) {
		System.out.println("안녕");
		return "안녕";
	}
	
	void brand(String val);
	
	void price(String val);
}
