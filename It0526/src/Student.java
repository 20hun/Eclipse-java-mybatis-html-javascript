
class Student extends Person{
	private int grade;
	
	public Student(String name, int age, String addr, int grade) {
		super(name, age, addr);
		this.grade = grade;
	}
	
	public void printInfo() {
		System.out.println("name "+name+"\nage : "+age+"\naddr : "+addr+"\ngrade : "+grade);
		// \t´Â ÅÇ, \nÀº ¿£ÅÍ
	}

}