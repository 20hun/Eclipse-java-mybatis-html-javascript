
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
		System.out.println("�̸� = "+getName()+", �ֹι�ȣ = "+getSn()+", ���� = "+getAge()
		+", �й� = "+ssn);
	}

}
