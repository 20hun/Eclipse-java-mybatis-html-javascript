
public class Human {
	private String sn, name;
	private int age;
	
	public Human (String a, String b, int c) {
		name = a;
		sn = b;
		age = c;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
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
	
	public void print () {
		System.out.println("�ֹι�ȣ = "+sn+", �̸� = "+name+", ���� = "+age);
	}

}
