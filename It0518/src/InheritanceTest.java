
public class InheritanceTest {

	public static void main(String[] args) {
		Truck truck = new Truck(6, 3, 11.5);
		System.out.println("Truck ���� ���� : "+truck.numberOfWheel+"���̴�");
		System.out.println("Truck �ִ� ���緮 : "+truck.maxLoad+"���̴�");
		truck.start();
		
		String a = "aaa";
		System.out.println(truck.toString());
		//����� �̷����, toString �޼ҵ�� Object�� ����, ���� �Ἥ ����
		System.out.println(truck); //�����ڷ����̱� ������ �ּҰ� ���
		System.out.println(a); //�̰� �ּҰ� �ȳ����� ���ڿ� ����
		//string Ŭ�������� �޼ҵ�������̵��߱� ����
	}
}
