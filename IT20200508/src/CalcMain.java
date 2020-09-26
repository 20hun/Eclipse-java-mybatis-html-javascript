import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		
		c.printMenu();
		
		System.out.print("연산할 번호 입력 : ");
		int num = sc.nextInt();
		System.out.print("연산할 첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("연산할 두번째 수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("답은 : ");
		switch(num) {
		
		case 1 :
			System.out.println(c.sum(num1, num2));
			break;
		case 2 :
			System.out.println(c.minus(num1, num2));
			break;
		case 3 :
			System.out.println(c.multiply(num1, num2));
			break;
		case 4 :
			System.out.println(c.dividing(num1, num2));
			break;
		}
	}
}
