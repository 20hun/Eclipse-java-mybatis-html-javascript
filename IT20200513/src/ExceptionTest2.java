import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		boolean flag = true;
		do {
			Scanner sc = new Scanner(System.in);
			//sc 다시 만들어줌 > sc값 비워짐
		try{
			
		System.out.print("정수 :");
		int num = sc.nextInt();
		System.out.println("입력 정수 :"+num);
		flag = false;
		} catch(InputMismatchException e) {
			System.out.println("정수 입력하라니까");
			//10번째 줄 do 바깥에 놓고
			//대신 여기에 sc.nextLine(); 넣어도 됨. > sc값 비워짐
		} finally {
			System.out.println("무조건 실행되는 구문");
		}
		}while(flag); //무한루프됨, 왜? 
	}

}
