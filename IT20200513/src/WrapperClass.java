
public class WrapperClass {

	public static void main(String[] args) {
		byte b = 3;
		int i = 257;
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		System.out.println(b2);
		System.out.println(i2); // 257 > "257"
		//참조 자료형은 출력하면 주소값이 나온다, 스트링만 자주쓰여서 값 나옴
		//기본 자료형은 출려하면 값 나옴
		//웨퍼클래스는 가지고 있는 값을 문자열로 변환해서 출력해줌
		
		byte b3 = b2.byteValue(); //byte 타입으로 b2의 값을 반환
		int i3 = i2.intValue(); //int "
		System.out.println("b3 = "+b3);
		System.out.println("i3 = "+i3);
		
		String strNum = "1991";
		int i4 = Integer.parseInt(strNum);
		//문자열 10을 static int로 변환
		//int a = (int)strNum; 이게 불가능하기 때문
		System.out.println(i4);
		/*
		public static int parseInt(String s){
		return parseInt(--);
		}
		왜 static 붙냐면 Integer가 객체명이 아니라 class명이라서!!
		*/
		long l4 = Long.parseLong(strNum);
		double d4 = Double.parseDouble(strNum);
		
		String birth = "1991-02-11";
		String subStr = birth.substring(0,4);
		int age = 2020-Integer.parseInt(subStr)+1;
		System.out.println(age);

	}

}
