
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
		System.out.println("이름 = "+getName()+", 주민번호 = "+getSn()+", 나이 = "+getAge()
		+", 부서 = "+field);
	}
	
}
