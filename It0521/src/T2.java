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
				System.out.println("���Ŀ� ���� �ʴ� �Է��Դϴ�. ó������ �ٽ� �Է��ϼ���.");
			}
		}
		
	}
}