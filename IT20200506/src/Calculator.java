//계산을 할 수 있는 클래스
public class Calculator {
	
	//생성자는 클래스 안에서 1개라도 직접 작성하지 않으면 기본 생성자 자동 생성
	//생성자 작성하면 기본 생성자 안생김
	/*기본생성자
	public Calculator() {
		max = 10000.0;
	}*/
	
	int sum;
	double max;
	
	public Calculator(double m) {
		max = m;
	}
	
	//접근지정자 리턴타입 메소드명(매개변수들)
	//2개의 정수형 매개변수 입력받아 값을 더한 후 결과값 반환해주는 메소드
	public int plus(int num1, int num2) {
		sum = num1 + num2;
		return sum;
	}
}
