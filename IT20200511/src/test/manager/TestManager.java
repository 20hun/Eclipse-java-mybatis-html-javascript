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
		System.out.print("���� : ");
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
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
			break;
		}
	}
	
	public void menu() {
		System.out.println("==============");
		System.out.println("1. ���");
		System.out.println("2. ���");
		System.out.println("==============");
	}
	
	public test testInsert() {
		sc.nextLine();
		
		System.out.print("ID �Է� : ");
		String a = sc.nextLine();
		System.out.print("PW �Է� : ");
		String b = sc.nextLine();
		System.out.print("�̸� �Է� : ");
		String c = sc.nextLine();
		
		test t = new test();
		t.setA(a);
		t.setB(b);
		t.setC(c);
		
		return t;
	}
}

		//Scanner�� ���� �Է��ؼ� �ʱ�ȭ �ϴ� �۾�
		/*
		 * Scanner�� nextInt()���Ŀ� nextLine()�� ����ϱ� ���ؼ��� Scanner�� �ʱ�ȭ ���־�� �Ѵ�. ��?
		 * nextLine()�Լ��� ���͸� �ν��ؼ� �Է��� �������� �Ǵ��Ѵ�
		 * nextInt()�Լ� ���Ŀ� ����ڰ� ���� �Է��ϰ� ���͸� ġ�� ���
		 * �Է��� ���� nextInt()�� ���ؼ� ���� ������ �� �ڿ� ���Ͱ� ���� Scanner�� ���� �ִ� �����̴�.
		 * ���� nextLine()�Լ��� �ѹ��� ����ϹǷν� ������ �ԷµǾ��� ���͸� ó���� �� �ֵ��� ���ش�.
		 * 
		sc.nextLine();
		
		System.out.println("-----------------------------------------");
		System.out.print("ȸ�� �̸��� �Է��� �ּ��� : ");
		String inputName = sc.nextLine();
		System.out.print("ȸ�� ��ȭ��ȣ�� �Է��� �ּ��� : ");
		String inputPhone = sc.nextLine();
		System.out.print("ȸ�� ���̸� �Է��� �ּ��� : ");
		int inputAge = sc.nextInt();	
}*/
