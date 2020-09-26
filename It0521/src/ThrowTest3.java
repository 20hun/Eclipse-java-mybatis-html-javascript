
public class ThrowTest3 {

	public static void main(String[] args) {
		summary();
	}
	public static int divide(int n, int m) throws Exception {
		return n/m;
	}
	public static void summary() {
		try {
			System.out.println("계산결과 : "+divide(10,0));
		} catch (Exception e) {
			System.out.println("계산오류");
			e.printStackTrace();
		}
	}
}
