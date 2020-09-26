
public class Student extends Human {
	private String ssn;
	
	public Student (String name, String sn, int age, String ssn) {
		super(name, sn, age);
		
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public void print () {
		System.out.println("이름 = "+getName()+", 주민번호 = "+getSn()+", 나이 = "+getAge()
		+", 학번 = "+ssn);
	}

}
