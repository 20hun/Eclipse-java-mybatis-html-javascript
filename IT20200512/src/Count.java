
public class Count {
	public int serialNumber;
	public static int counter = 0;
	
	public Count() {
		counter++;
		serialNumber = counter;
	}

	//특정 기능을 하는 메소드 a() 굉장히 많이 사용되는 메소드 (횟수)
}
