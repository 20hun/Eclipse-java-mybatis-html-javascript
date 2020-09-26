
public class Human {
	private String name;
	private int age;
	
	public Human (String a, int b) {
		name = a;
		age = b;
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
	
	public void showInfo() {
		System.out.println("age = "+age);
		System.out.println("name = "+name);
	}
}
