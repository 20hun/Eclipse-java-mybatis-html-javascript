
public class Test213 {

	public static void main(String[] args) {
		String str15 = "Hello World!";
		
		char c = str15.charAt(3);
		
		System.out.println(c);
		/*
		 * 배열 선언
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("문자열 입력 : ");
		 * String str = sc.nextLine();
		 * char[] oldChar = new char[str.length()];
		 * char[] newChar = new char[str.length()];
		 * for (int i = 0 ; i<oldChar.length ; i++){
		 * oldChar[i] = str.charAt(i);
		 * newChar[oldChar.length-i] = oldChar[i];
		 * } 
		 * 
		 */
		String str2 = "AAa";
		
		int compareNum = str2.compareTo("AAA");
		
		System.out.println(compareNum);
		
		String str3 = "Hello";
		String concatStr = str3.concat("java");
		String concatStr2 = str3+"java";
		System.out.println(concatStr2);
		System.out.println(concatStr);
		
		String str5 = "Java";
		boolean equalsCheck = str5.equals("Java");
		System.out.println(equalsCheck);
		
		String str4 = "java";
		boolean containsCheck = str4.contains("B");
		System.out.println(containsCheck);
		
		String str6 = "Hello World!";
		int indexOfNum = str6.indexOf("o");
		System.out.println(indexOfNum);
		
		String str7 = "Hello World!";
		int lastIndexofNum = str7.lastIndexOf("o");
		System.out.println(lastIndexofNum);
		// str6은 앞에서부터 검색, last는 뒤에서부터 검색
		// last를 쓰면 좋은점 : 파일 확장자명 구하기 str9 예문
		
		String str8 = "Hello World!";
		String subStr = str8.substring(2,8);
		//문자열 잘라내기, 2는 포함 but 8 직전까지라 8번째는 출력x
		System.out.println(subStr);
		//substring(2); 는 2번째부터 끝까지 출력
		
		String str9 = "star.jpg";
		//String ext = str9.substring(5);
		//파일의 확장자명을 구할때 활용, star는 5부터지만 star1은 6부터
		//일단 .을 찾자 그리고 그 뒤가 확장자다
		//그런데 st.a.r.1.jpg처럼 중간중간 점이 있을수도
		int lastIndexN = str9.lastIndexOf(".");
		String fileName = str9.substring(0, lastIndexN);
		String ext = str9.substring(lastIndexN+1);
		System.out.println(ext);
		System.out.println(fileName);
		
		String str10 = "Hello World!";
		int lengthStr = str10.length();
		//string에서의 length는 메소드다!! 반드시 ()포함
		System.out.println("문자열 길이는 "+lengthStr);
		int[] arr = new int[10];
		int lengthArr = arr.length; //length는 속성=객체의 멤버변수
		System.out.println(lengthArr);
		
		String str11 = "Hello World!";
		String replacStr = str11.replace('l', 'L');
		System.out.println("문자열 치환 : "+replacStr);
		
		String str12 = "aa1bb1cc1dd";
		String[] splitArr = str12.split("1");
		for(int i = 0 ; i<splitArr.length ; i++){
			System.out.println(splitArr[i]);
		}
		
		String str13 = "Hello World!";
		String lowerStr = str13.toLowerCase();
		String upperStr = str13.toUpperCase();
		System.out.println("소문자 변환 : "+lowerStr);
		System.out.println("대문자 변환 : "+upperStr);
		//검색 사람들이 대문자 소문자 구분없이 쓰는 경우 좋음
		
		String str14 = "       Hello World!        ";
		String trimStr = str14.trim();
		System.out.println("공백 제거 : "+trimStr);
		
		//charAt, equals***, indexOF, lastIndexOf, length**
		//split, substring***, toLowerCase, toUpperCase
		}	
	}