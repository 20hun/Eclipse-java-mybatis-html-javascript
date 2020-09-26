
public class FinalVar {
final int i = 9;

public void go() {
	System.out.println(i);
}
public static void main(String[] args) {
	// go(); 같은 클래스여도 main이 static 메서드라 안됨
	FinalVar fv = new FinalVar();
	fv.go();
}
}