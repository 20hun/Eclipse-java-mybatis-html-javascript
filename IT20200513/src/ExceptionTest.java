
public class ExceptionTest {

	public static void main(String[] args) {
		try {
		int a = 10, b=0;
		System.out.println("����");
		System.out.println(a/b);
		System.out.println("��");
		} catch (ArithmeticException e) {
			//ArithmeticException�� Ŭ������ import ����� �ϴµ�
			//java.lang�� �ִ°Ŷ� �����൵ ��
			System.out.println("���� ĳġ : "+ e.getMessage());
		} finally {
			System.out.println("������");
		}
	}

}
