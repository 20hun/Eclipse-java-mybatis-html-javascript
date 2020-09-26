
public class Truck extends Vehicle {
	
	double maxLoad; //최대 적재량
	
	public Truck (int w, int s, double max) {
		numberOfWheel = w;
		numberOfSeat = s;
		maxLoad = max;
	}

	public void load() {}
	
	//@ 붙여주는 걸 어노테이션 annotation : 오버라이드 어노테이션
	@Override
	public void start() {
		System.out.println("Truck 출발 기능");
	}
	
	public String toString() {
		return "트럭의 ToString";
		//return "maxLoad : "+maxLoad
		//이렇게도 가능
	}
}
