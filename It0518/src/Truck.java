
public class Truck extends Vehicle {
	
	double maxLoad; //�ִ� ���緮
	
	public Truck (int w, int s, double max) {
		numberOfWheel = w;
		numberOfSeat = s;
		maxLoad = max;
	}

	public void load() {}
	
	//@ �ٿ��ִ� �� ������̼� annotation : �������̵� ������̼�
	@Override
	public void start() {
		System.out.println("Truck ��� ���");
	}
	
	public String toString() {
		return "Ʈ���� ToString";
		//return "maxLoad : "+maxLoad
		//�̷��Ե� ����
	}
}
