package test.vo;

public class Person {
	private int num;
	private String name;
	private int age;
	
	public Person() { //source > constructor using ~ > 변수들 체크해제 > 기본생성자 만들어짐
		super();
	}

	public Person(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
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
	public String toString() { //person 객체 호출하면 주소값 나오는 것이 아니라 return 문자열이 나옴
		return "Person [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
}
