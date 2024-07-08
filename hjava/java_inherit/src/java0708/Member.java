 package java0708;

public class Member {
	private int id; // member_id 컬럼
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private int std_avg;
	//오른쪽 클림 -> source -> generate getters and setters
	//변수 전체 클릭 -> generate버튼 클릭
	
	public Member() {}
	//사용자 입력용 생성자 메서드
	public Member(String name, int kor, int eng, int mat) {
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	//데이터 베이스에서 가지고온 데이터 저장용 생성자 메서드
	public Member(int id, String name, int kor, int eng, int mat,
			int total, int std_avg) {
		this(name,kor,eng,mat);
		this.id=id;
		this.total=total;
		this.std_avg=std_avg;
	}
	
	@Override
	public String toString() {
		return "["+id+" ,"+name+", "+kor+", "+eng+", "+mat+", "+
				total+","+std_avg+"]";
	}
	
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStd_avg() {
		return std_avg;
	}
	public void setStd_avg(int std_avg) {
		this.std_avg = std_avg;
	}

	

}
