
public class Staff extends Human {
	private String field;
	
	
	public Staff(String a, String b, int c, String d) {
		super(a, b, c);
		
		field = d;
	}


	public String getField() {
		return field;
	}


	public void setField(String field) {
		this.field = field;
	}

	@Override
	public void print () {
		System.out.println("�̸� = "+getName()+", �ֹι�ȣ = "+getSn()+", ���� = "+getAge()
		+", �μ� = "+field);
	}
	
}
