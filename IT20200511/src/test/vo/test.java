package test.vo;

public class test {

	private String a, b, c;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	
	public void printInfo() {
		System.out.println("����� ID : "+a);
		System.out.println("����� PW : "+b);
		System.out.println("����� �̸� : "+c);
	}
}