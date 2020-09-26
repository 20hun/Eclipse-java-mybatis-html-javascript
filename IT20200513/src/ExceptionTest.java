
public class ExceptionTest {

	public static void main(String[] args) {
		try {
		int a = 10, b=0;
		System.out.println("시작");
		System.out.println(a/b);
		System.out.println("끝");
		} catch (ArithmeticException e) {
			//ArithmeticException이 클래스라 import 해줘야 하는데
			//java.lang에 있는거라 안해줘도 됨
			System.out.println("예외 캐치 : "+ e.getMessage());
		} finally {
			System.out.println("마무리");
		}
	}

}
