import java.util.InputMismatchException;

public class T2 {

	public static void main(String[] args) {
		T1 ui = new T1();
		//ui.exec1();
		
		while(true) {
			try {
				ui.exec2();
				break;
			}catch (InputMismatchException e) {
				System.out.println("형식에 맞지 않는 입력입니다. 처음부터 다시 입력하세요.");
			}
		}
		
	}
}