package j0711_1;

public class Member {
	private String name;
	private int age;
	private String birth;
	
	public Member(String name, int age, String birth) {
		this.name=name;
		this.age=age;
		this.birth=birth;
	}
	
	@Override
	public String toString() {
		return name+", "+age+", "+birth;
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	
//	public int compareTo(Member o) {
	
//		return this.name.compareTo(o.name); // 이름 기준 내림차순	
//		return (this.age - o.age)*-1; // 나이 기준 내림차선
	
//		return this.age - o.age; //나이 기준 오름차선
//	}
	
}
