package j0717_1;

public class DVD extends Media{
	private String director; // 감독
	
	public DVD(String id, String title, String director) {
		super(id,title);
		this.director=director;
	}
	


	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
