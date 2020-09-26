
public class ThrowTest2 {

	public static void main(String[] args) {
		try{
			summary();
		} catch (Exception e){
			//System.out.println(e.getMessage());
			System.out.println("계산오류");
			e.printStackTrace();
			//System.out.println(e.toString());
			
		}
	}
	public static int divide(int n, int m) throws Exception {
		return n/m;
	}
	public static void summary() throws Exception {
		//try {
			System.out.println("계산결과 : "+divide(10,0));
		//} catch (Exception e) {
			//System.out.println("계산오류");
		//}
	//}

	}

}
