package studyyyyyy;

public class Grade {
	String name;
	int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name+", "+score;
	}
	
	public Grade(String name, int score) {
		this.name=name;
		this.score=score;
	}

}
