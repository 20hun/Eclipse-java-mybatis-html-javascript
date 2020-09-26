import java.util.Scanner;

public class Test0515 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		  System.out.print("문자열 입력 : ");
		  String str = sc.nextLine();
		  char[] oldChar = new char[str.length()];
		  for (int i = 0 ; i<str.length() ; i++){
		  oldChar[i] = str.charAt(i);
		  }
		  for (int i = 0 ; i<str.length() ; i++) {
			  System.out.print(oldChar[str.length()-1-i]);
		  }

	}

}
