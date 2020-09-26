import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator(990.0); //sum이 기본값 0으로 초기화됨
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해 주세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해 주세요 : ");
		int num2 = sc.nextInt();
		
		int sum = cal.plus(num1, num2);
		
		System.out.println("결과값은 : "+sum);
		System.out.println(cal.max);
	}
}
