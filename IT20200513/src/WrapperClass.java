
public class WrapperClass {

	public static void main(String[] args) {
		byte b = 3;
		int i = 257;
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		System.out.println(b2);
		System.out.println(i2); // 257 > "257"
		//���� �ڷ����� ����ϸ� �ּҰ��� ���´�, ��Ʈ���� ���־����� �� ����
		//�⺻ �ڷ����� ����ϸ� �� ����
		//����Ŭ������ ������ �ִ� ���� ���ڿ��� ��ȯ�ؼ� �������
		
		byte b3 = b2.byteValue(); //byte Ÿ������ b2�� ���� ��ȯ
		int i3 = i2.intValue(); //int "
		System.out.println("b3 = "+b3);
		System.out.println("i3 = "+i3);
		
		String strNum = "1991";
		int i4 = Integer.parseInt(strNum);
		//���ڿ� 10�� static int�� ��ȯ
		//int a = (int)strNum; �̰� �Ұ����ϱ� ����
		System.out.println(i4);
		/*
		public static int parseInt(String s){
		return parseInt(--);
		}
		�� static �ٳĸ� Integer�� ��ü���� �ƴ϶� class���̶�!!
		*/
		long l4 = Long.parseLong(strNum);
		double d4 = Double.parseDouble(strNum);
		
		String birth = "1991-02-11";
		String subStr = birth.substring(0,4);
		int age = 2020-Integer.parseInt(subStr)+1;
		System.out.println(age);

	}

}
