
public class ThrowTest4 {

	public static void main(String[] args) {
		try {
			onAction();
		}catch(Exception e) {
			System.out.println("onAction���� 6 �߰��߳���");
		}finally {
			System.out.println("trycatch ������ ���̳� ó��");
		}
	}
	
	public static void onAction() throws Exception {
		for(int i = 0 ; i<10 ; i++) {
			try {
				if(i!=6) {
					System.out.println(i+"�� 6 �Ƴ�");
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println(i+"�� 6 �³�");
				throw e;
			}
		}
	}
}
