
public class FinalVar {
final int i = 9;

public void go() {
	System.out.println(i);
}
public static void main(String[] args) {
	// go(); ���� Ŭ�������� main�� static �޼���� �ȵ�
	FinalVar fv = new FinalVar();
	fv.go();
}
}