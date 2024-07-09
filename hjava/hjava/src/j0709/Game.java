package j0709;

public class Game {
	

	private String title; //게임 제목
	private String genre; //게임 장르
	private String platform; //게임 플렛폼
	
	public Game() {}
	public Game(String title, String genre, String platform) {
		this.title=title;
		this.genre=genre;
		this.platform=platform;
	}

	@Override
	public String toString() {
		return title+", "+genre+", "+platform;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
}

//게임 제목과, 장르 플랫폼
//장르는 액션, 롤플레잉, fps 같은거
//플랫폼은 pc, ps4, switch, xbox 같은거