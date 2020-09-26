
public class ThrowTest4 {

	public static void main(String[] args) {
		try {
			onAction();
		}catch(Exception e) {
			System.out.println("onAction에서 6 발견했나봄");
		}finally {
			System.out.println("trycatch 종료후 파이널 처리");
		}
	}
	
	public static void onAction() throws Exception {
		for(int i = 0 ; i<10 ; i++) {
			try {
				if(i!=6) {
					System.out.println(i+"는 6 아녀");
				}else {
					throw new Exception();
				}
			}catch(Exception e) {
				System.out.println(i+"는 6 맞네");
				throw e;
			}
		}
	}
}
