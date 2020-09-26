package student1.ui;

import java.util.ArrayList;
import java.util.Scanner;

import student1.dao.Student1DAO;
import student1.vo.Student1;

public class Student1UI {
	Scanner sc = new Scanner(System.in);
	Student1DAO dao = new Student1DAO();
	
	
	public Student1UI() {
		while(true) {
			this.menu();
			int m = sc.nextInt();
			
			switch(m) {
			case 1 :
				this.input();
				break;
			case 2 :
				this.printAll();
				break;
			case 3 :
				this.delete();
				break;
			case 4 :
				this.update();
				break;
			case 5 :
				this.search();
				break;
			case 0 :
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		}
	}
	
	public void search() {
		ArrayList<Student1> list;
		
		System.out.println("[ �˻� ]");
		
		sc.nextLine();
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		list = dao.searchStudent1(name);
		
		if(list == null || list.size() == 0) {
			System.out.println("* ����� �����Ͱ� �����ϴ�.");
		}else {
			System.out.println("�й�\t�̸�\t����\t����\t����\t�ð�\t��ǥ");
			for(int i = 0 ; i<list.size() ; i++) {
				Student1 s = list.get(i);
				System.out.println(s);
			}
		}
	}
	
	public void update() {
		int n;
		String name;
		int kor, eng, mat;
		double gps_x;
		
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� : ");
		mat = sc.nextInt();
		System.out.print("��ǥ �Է� : ");
		gps_x = sc.nextDouble();
		
		Student1 s = new Student1(id, name, kor, eng, mat, gps_x);
		n = dao.updateStudent1(s);
		
		if(n == 0) {
			System.out.println("* ���� ����");
		}else {
			System.out.println("* �����Ǿ����ϴ�.");
		}
	}
	
	public void delete() {
		int n;
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		int id = sc.nextInt();
		
		n = dao.deleteStudent1(id);
		
		if(n == 0) {
			System.out.println("* �ش�Ǵ� �й��� �����ϴ�.");
		} else {
			System.out.println("* "+n+"���� �����Ǿ����ϴ�.");
		}
	}
	
	public void input() {
		String name;
		int kor, eng, mat;
		double gps_x;
		int n;
		
		System.out.println("[ ���� �Է� ]");
		sc.nextLine();
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("���� ���� : ");
		kor = sc.nextInt();
		System.out.print("���� ���� : ");
		eng = sc.nextInt();
		System.out.print("���� ���� : ");
		mat = sc.nextInt();
		System.out.print("��ǥ �Է� : ");
		gps_x = sc.nextDouble();
		
		Student1 s = new Student1(name, kor, eng, mat, gps_x);
		n = dao.insertStudent1(s);
		
		if(n == 0) {
			System.out.println("���� ����");
		}else {
			System.out.println("* ����Ǿ����ϴ�.");
		}
		
	}
	
	public void printAll() {
		ArrayList<Student1> list;
		
		System.out.println("[ ��ü �л� ���� ]");
		System.out.println("�й�\t�̸�\t����\t����\t����\t�ð�\t��ǥ");
		
		list = dao.printAllStudent1();
		
		if(list == null || list.size() == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		} else {
			for(int i = 0 ; i<list.size(); i++) {
				Student1 s = list.get(i);
				System.out.println(s);
			}
		}
	}
	
	public void menu() {
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1. �Է�");
		System.out.println("2. ��ü  ���");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. �˻�");
		System.out.println("0. ����");
		System.out.print("���� > ");
	}
}
