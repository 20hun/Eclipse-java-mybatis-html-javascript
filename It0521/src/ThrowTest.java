
public class ThrowTest {
	public static void main(String[] args) {
		try {
		summary();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("나오나");
	}
	
	public static int divide(int n, int m) throws Exception {
		return n/m;
	}
	public static void summary() throws Exception {
		try {
			System.out.println("계산결과 : "+divide(10,0));
		} catch (Exception e) {
			throw e;
			//throw new Exception("계산오류");
		}
	}
}
			//던져라 가장 최상위 Exception(모든 예외 다처리 가능한)로
			//throw new Exception("계산 오류");
			// 예외를 throw 뒤에 나오는 걸 강제 생성!
			// 캐치에서도 예외발생하면 컴파일에러나야하는데
			// 이 메소드도 throws를 썼기 때문에
			// 에러 없이 실행 

/* int[] intArr = new int[5];
System.out.println(intArr); //배열은 참조자료형, 인덱스 없이 그냥 출력하면 주소값이 나옴
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
	intArr = {11,22,33,44,55}; */ //이렇게는 못씀

//int[] intArr = {11,22,33,44,55}; 