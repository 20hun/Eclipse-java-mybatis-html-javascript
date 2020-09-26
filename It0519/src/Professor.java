
public class Professor extends Human{
	private String major;
	
	public Professor (String name, String sn, int age, String major) {
		super(name, sn, age);
		
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public void print () {
		System.out.println("�̸� = "+getName()+", �ֹι�ȣ = "+getSn()+", ���� = "+getAge()
		+", ���� = "+major);
	}

}
