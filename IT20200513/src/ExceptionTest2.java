import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		boolean flag = true;
		do {
			Scanner sc = new Scanner(System.in);
			//sc �ٽ� ������� > sc�� �����
		try{
			
		System.out.print("���� :");
		int num = sc.nextInt();
		System.out.println("�Է� ���� :"+num);
		flag = false;
		} catch(InputMismatchException e) {
			System.out.println("���� �Է��϶�ϱ�");
			//10��° �� do �ٱ��� ����
			//��� ���⿡ sc.nextLine(); �־ ��. > sc�� �����
		} finally {
			System.out.println("������ ����Ǵ� ����");
		}
		}while(flag); //���ѷ�����, ��? 
	}

}
