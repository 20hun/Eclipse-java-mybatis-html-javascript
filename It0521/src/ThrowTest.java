
public class ThrowTest {
	public static void main(String[] args) {
		try {
		summary();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("������");
	}
	
	public static int divide(int n, int m) throws Exception {
		return n/m;
	}
	public static void summary() throws Exception {
		try {
			System.out.println("����� : "+divide(10,0));
		} catch (Exception e) {
			throw e;
			//throw new Exception("������");
		}
	}
}
			//������ ���� �ֻ��� Exception(��� ���� ��ó�� ������)��
			//throw new Exception("��� ����");
			// ���ܸ� throw �ڿ� ������ �� ���� ����!
			// ĳġ������ ���ܹ߻��ϸ� �����Ͽ��������ϴµ�
			// �� �޼ҵ嵵 throws�� ��� ������
			// ���� ���� ���� 

/* int[] intArr = new int[5];
System.out.println(intArr); //�迭�� �����ڷ���, �ε��� ���� �׳� ����ϸ� �ּҰ��� ����
System.out.println(intArr[0]); 
System.out.println(intArr[1]); 
System.out.println(intArr[2]); 
System.out.println(intArr[3]); 
System.out.println(intArr[4]); 

intArr[0] = 11;
intArr[1] = 22;
intArr[2] = 33;
intArr[3] = 44;
intArr[4] = 55; */

/* int[] intArr = new int[5];
	intArr = {11,22,33,44,55}; */ //�̷��Դ� ����

//int[] intArr = {11,22,33,44,55}; 