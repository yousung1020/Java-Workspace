package lec_04;

public class User {
	private String name;
	private int age;
	
	// 2. 생성자
	User(String name, int age){
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [이름 = " + name  + ", 나이 = " + age + "]";
	}
}
