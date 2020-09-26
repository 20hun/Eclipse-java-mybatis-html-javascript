
public class Student extends Human {
	private int stNum;
	
	public Student (String a, int b, int c) {
		
		super(a, b); //±¸±Û¸µ

		stNum = c;
	}

	public int getStNum() {
		return stNum;
	}

	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	
	@Override
	public void showInfo() {
		System.out.println("name = "+getName());
		System.out.println("age = "+getAge());
		System.out.println("stNum = "+stNum);
	}
}
