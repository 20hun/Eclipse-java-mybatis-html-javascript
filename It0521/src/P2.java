
public class P2 {

	public static void main(String[] args) {
		P1[] pArr = new P1[3];
		P1 p1 = new P1();
		p1.setName("»ç°ú");
		p1.setPrice(7000);
		
		P1 p2 = new P1("¹è");
		P1 p3 = new P1("±Ö", 5000);
		
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]);

	}
	}
}
