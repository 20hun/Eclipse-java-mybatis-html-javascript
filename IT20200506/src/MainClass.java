import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Calculator cal = new Calculator(990.0); //sum�� �⺻�� 0���� �ʱ�ȭ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��� �ּ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��� �ּ��� : ");
		int num2 = sc.nextInt();
		
		int sum = cal.plus(num1, num2);
		
		System.out.println("������� : "+sum);
		System.out.println(cal.max);
	}
}
