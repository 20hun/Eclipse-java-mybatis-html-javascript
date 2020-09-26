
public class MathTest {

	public static void main(String[] args) {
		int abs = Math.abs(-1);
		
		System.out.println(abs);
		
		int max = Math.max(2, 3);
		System.out.println(max);
		
		int min = Math.min(Math.min(2, 3), 4);
		System.out.println(min);
		
		double ceil = Math.ceil(2.49);
		System.out.println(ceil);
		double floor = Math.floor(3.123123);
		System.out.println(floor);
		
		long round = Math.round(3.912);
		System.out.println(round);
		
		long round2 = Math.round(45.123213213213132132132);
		System.out.println(round2);
		
		//static 만들어지지 않았으면 객체 만들어야함
	}

}
