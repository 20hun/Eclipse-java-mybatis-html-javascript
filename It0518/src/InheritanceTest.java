
public class InheritanceTest {

	public static void main(String[] args) {
		Truck truck = new Truck(6, 3, 11.5);
		System.out.println("Truck 바퀴 수는 : "+truck.numberOfWheel+"개이다");
		System.out.println("Truck 최대 적재량 : "+truck.maxLoad+"톤이다");
		truck.start();
		
		String a = "aaa";
		System.out.println(truck.toString());
		//사실은 이런모양, toString 메소드는 Object에 있음, 자주 써서 생략
		System.out.println(truck); //참조자료형이기 때문에 주소값 출력
		System.out.println(a); //이건 주소값 안나오고 문자열 나옴
		//string 클래스에서 메소드오버라이딩했기 때문
	}
}
