package studyyyyyy;

public class Book {

	private String title;
	private int year;
	private int page;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
		
	}
	@Override
	public String toString() {
		return title+", "+year+", "+page;
		}
	public Book(String title, int year, int page){
		this.title=title;
		this.page=page;
		this.year=year;
	}
}

