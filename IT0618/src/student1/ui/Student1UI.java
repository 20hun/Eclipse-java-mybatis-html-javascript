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
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default :
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void search() {
		ArrayList<Student1> list;
		
		System.out.println("[ 검색 ]");
		
		sc.nextLine();
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		list = dao.searchStudent1(name);
		
		if(list == null || list.size() == 0) {
			System.out.println("* 저장된 데이터가 없습니다.");
		}else {
			System.out.println("학번\t이름\t국어\t영어\t수학\t시간\t좌표");
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
		
		System.out.println("[ 수정 ]");
		System.out.print("수정할 학번 : ");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		System.out.print("좌표 입력 : ");
		gps_x = sc.nextDouble();
		
		Student1 s = new Student1(id, name, kor, eng, mat, gps_x);
		n = dao.updateStudent1(s);
		
		if(n == 0) {
			System.out.println("* 수정 실패");
		}else {
			System.out.println("* 수정되었습니다.");
		}
	}
	
	public void delete() {
		int n;
		System.out.println("[ 삭제 ]");
		System.out.print("삭제할 학번 : ");
		int id = sc.nextInt();
		
		n = dao.deleteStudent1(id);
		
		if(n == 0) {
			System.out.println("* 해당되는 학번이 없습니다.");
		} else {
			System.out.println("* "+n+"건이 삭제되었습니다.");
		}
	}
	
	public void input() {
		String name;
		int kor, eng, mat;
		double gps_x;
		int n;
		
		System.out.println("[ 성적 입력 ]");
		sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		System.out.print("좌표 입력 : ");
		gps_x = sc.nextDouble();
		
		Student1 s = new Student1(name, kor, eng, mat, gps_x);
		n = dao.insertStudent1(s);
		
		if(n == 0) {
			System.out.println("저장 실패");
		}else {
			System.out.println("* 저장되었습니다.");
		}
		
	}
	
	public void printAll() {
		ArrayList<Student1> list;
		
		System.out.println("[ 전체 학생 정보 ]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t시간\t좌표");
		
		list = dao.printAllStudent1();
		
		if(list == null || list.size() == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		} else {
			for(int i = 0 ; i<list.size(); i++) {
				Student1 s = list.get(i);
				System.out.println(s);
			}
		}
	}
	
	public void menu() {
		System.out.println("[ 학생 성적 관리 ]");
		System.out.println("1. 입력");
		System.out.println("2. 전체  출력");
		System.out.println("3. 삭제");
		System.out.println("4. 수정");
		System.out.println("5. 검색");
		System.out.println("0. 종료");
		System.out.print("선택 > ");
	}
}
