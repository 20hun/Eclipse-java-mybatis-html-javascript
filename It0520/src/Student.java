public class Student extends Person {
	private String no;
	
	public Student (String name, int age, String no) {
		super(name, age);
		
		this.no = no;
		
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public String printAll() {
		return super.printAll()+", NO = "+no;
	}
	

}