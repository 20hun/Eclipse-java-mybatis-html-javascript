
public class Calc {

	public int sum (int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public int minus (int num1, int num2) {
		int sum = num1-num2;
		return sum;
	}
	
	public int multiply (int num1, int num2) {
		int sum = num1*num2;
		return sum;
	}
	
	public int dividing (int num1, int num2) {
		int sum = num1/num2;
		return sum;
	}
	
	public void printMenu () {
		System.out.println("==========");
		System.out.println("1. ´õÇÏ±â");
		System.out.println("2. »©±â");
		System.out.println("3. °öÇÏ±â");
		System.out.println("4. ³ª´©±â");
		System.out.println("==========");
	}
}
