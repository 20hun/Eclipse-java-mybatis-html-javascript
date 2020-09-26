package test.manager;

import java.util.Scanner;

import test.vo.test;

public class TestManager {

	Scanner sc = new Scanner(System.in);
	
	test[] testArray = new test[10];
	int count = 0;
	
	public TestManager ( ) {
	do {
		menu();
		info();		
		
	} while(true);
	}
	
	
	public void info() {
		System.out.print("선택 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1 :
			testArray[count] = testInsert();
			count++;
			break;
		case 2 :
			for(int i = 0 ; i<count ; i++) {
				testArray[i].printInfo();
			}
			break;
		default :
			System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
			break;
		}
	}
	
	public void menu() {
		System.out.println("==============");
		System.out.println("1. 등록");
		System.out.println("2. 출력");
		System.out.println("==============");
	}
	
	public test testInsert() {
		sc.nextLine();
		
		System.out.print("ID 입력 : ");
		String a = sc.nextLine();
		System.out.print("PW 입력 : ");
		String b = sc.nextLine();
		System.out.print("이름 입력 : ");
		String c = sc.nextLine();
		
		test t = new test();
		t.setA(a);
		t.setB(b);
		t.setC(c);
		
		return t;
	}
}

		//Scanner에 빈값을 입력해서 초기화 하는 작업
		/*
		 * Scanner의 nextInt()이후에 nextLine()을 사용하기 위해서는 Scanner를 초기화 해주어야 한다. 왜?
		 * nextLine()함수는 엔터를 인식해서 입력이 끝난것을 판단한다
		 * nextInt()함수 이후에 사용자가 값을 입력하고 엔터를 치는 경우
		 * 입력한 값은 nextInt()에 의해서 대입 되지만 그 뒤에 엔터가 아직 Scanner에 남아 있는 상태이다.
		 * 따라서 nextLine()함수를 한번더 사용하므로써 이전에 입력되었던 엔터를 처리할 수 있도록 해준다.
		 * 
		sc.nextLine();
		
		System.out.println("-----------------------------------------");
		System.out.print("회원 이름을 입력해 주세요 : ");
		String inputName = sc.nextLine();
		System.out.print("회원 전화번호를 입력해 주세요 : ");
		String inputPhone = sc.nextLine();
		System.out.print("회원 나이를 입력해 주세요 : ");
		int inputAge = sc.nextInt();	
}*/
