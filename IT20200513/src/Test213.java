
public class Test213 {

	public static void main(String[] args) {
		String str15 = "Hello World!";
		
		char c = str15.charAt(3);
		
		System.out.println(c);
		/*
		 * �迭 ����
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("���ڿ� �Է� : ");
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
		// str6�� �տ������� �˻�, last�� �ڿ������� �˻�
		// last�� ���� ������ : ���� Ȯ���ڸ� ���ϱ� str9 ����
		
		String str8 = "Hello World!";
		String subStr = str8.substring(2,8);
		//���ڿ� �߶󳻱�, 2�� ���� but 8 ���������� 8��°�� ���x
		System.out.println(subStr);
		//substring(2); �� 2��°���� ������ ���
		
		String str9 = "star.jpg";
		//String ext = str9.substring(5);
		//������ Ȯ���ڸ��� ���Ҷ� Ȱ��, star�� 5�������� star1�� 6����
		//�ϴ� .�� ã�� �׸��� �� �ڰ� Ȯ���ڴ�
		//�׷��� st.a.r.1.jpgó�� �߰��߰� ���� ��������
		int lastIndexN = str9.lastIndexOf(".");
		String fileName = str9.substring(0, lastIndexN);
		String ext = str9.substring(lastIndexN+1);
		System.out.println(ext);
		System.out.println(fileName);
		
		String str10 = "Hello World!";
		int lengthStr = str10.length();
		//string������ length�� �޼ҵ��!! �ݵ�� ()����
		System.out.println("���ڿ� ���̴� "+lengthStr);
		int[] arr = new int[10];
		int lengthArr = arr.length; //length�� �Ӽ�=��ü�� �������
		System.out.println(lengthArr);
		
		String str11 = "Hello World!";
		String replacStr = str11.replace('l', 'L');
		System.out.println("���ڿ� ġȯ : "+replacStr);
		
		String str12 = "aa1bb1cc1dd";
		String[] splitArr = str12.split("1");
		for(int i = 0 ; i<splitArr.length ; i++){
			System.out.println(splitArr[i]);
		}
		
		String str13 = "Hello World!";
		String lowerStr = str13.toLowerCase();
		String upperStr = str13.toUpperCase();
		System.out.println("�ҹ��� ��ȯ : "+lowerStr);
		System.out.println("�빮�� ��ȯ : "+upperStr);
		//�˻� ������� �빮�� �ҹ��� ���о��� ���� ��� ����
		
		String str14 = "       Hello World!        ";
		String trimStr = str14.trim();
		System.out.println("���� ���� : "+trimStr);
		
		//charAt, equals***, indexOF, lastIndexOf, length**
		//split, substring***, toLowerCase, toUpperCase
		}	
	}