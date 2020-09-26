import java.util.Scanner;

public class SchoolUI {
	SchoolManager o = new SchoolManager();
	Scanner sc = new Scanner(System.in);

	public void printMainMenu () {
		System.out.println("========");
		System.out.println("직원 관리 시스템");
		System.out.println("========");
		System.out.println("1. 등록");
		System.out.println("2. 주민번호 찾기");
		System.out.println("3. 주민번호 삭제");
		System.out.println("4. 전체출력");
		System.out.println("0. 종료");
		System.out.println("========");
		System.out.print("메뉴 선택 => ");
	}
	
	public void printInsertHumanMenu () {
		System.out.println("========");
		System.out.println("등록 메뉴");
		System.out.println("========");
		System.out.println("1. 학생");
		System.out.println("2. 직원");
		System.out.println("3. 교수");
		System.out.println("0. 상위메뉴");
		System.out.println("========");
		System.out.print("메뉴 선택 => ");
	}
	
	public void printAll () {
		o.printAll();
	}
	
	public boolean insertStudent ( ) {
		System.out.println("========");
		System.out.println("학생 등록");
		System.out.println("========");
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		try{
			int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주민번호 : ");
		String sn = sc.nextLine();
		System.out.print("학번 : ");
		String ssn = sc.nextLine();
		
		Student s = new Student(name, sn, age, ssn);
		
		if(o.insertHuman(s)) {
			System.out.println("정상등록 완료");
		} else {
			System.out.println("등록 오류(이미 존재 주민번호)");
		}
		
		return o.insertHuman(s);
		}catch (Exception e) {
			System.out.println("잘못된 입력"+"\n"+"등록 오류");
			sc.nextLine();
			return false;
		}
	}
	
	public boolean insertStaff ( ) {
		System.out.println("========");
		System.out.println("직원 등록");
		System.out.println("========");
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		try {
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주민번호 : ");
		String sn = sc.nextLine();
		System.out.print("부서 : ");
		String field = sc.nextLine();
		
		Staff s = new Staff(name, sn, age, field);
		
		if(o.insertHuman(s)) {
			System.out.println("정상등록 완료");
		} else {
			System.out.println("등록 오류(이미 존재 주민번호)");
		}
		
		return o.insertHuman(s);
		}catch (Exception e) {
			System.out.println("잘못된 입력"+"\n"+"등록 오류");
			sc.nextLine();
			return false;
		}
	}
	
	public boolean insertProfessor ( ) {
		System.out.println("========");
		System.out.println("교수 등록");
		System.out.println("========");
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		try {
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("주민번호 : ");
		String sn = sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		
		Professor s = new Professor(name, sn, age, major);
		
		if(o.insertHuman(s)) {
			System.out.println("정상등록 완료");
		} else {
			System.out.println("등록 오류(이미 존재 주민번호)");
		}
		
		return o.insertHuman(s);
		}catch (Exception e) {
			System.out.println("잘못된 입력"+"\n"+"등록 오류");
			sc.nextLine();
			return false;
		}
	}
	
	public void insertHuman() {
		while(true) {
			this.printInsertHumanMenu();
			try {
			int m = sc.nextInt();
			
			switch(m) {
			case 1 :
				this.insertStudent();
				break;
			case 2 :
				this.insertStaff();
				break;
			case 3 :
				this.insertProfessor();
				break;
			case 0 :
				break;
			default :
				System.out.println("잘못된 입력");
				break;
			} 
			if(m ==0) {
				break;
			}
			} catch (Exception e){
				sc.nextLine();
				System.out.println("숫자 입력해주세요");
			}
		}
	}
	
	public boolean deleteHuman () {
		sc.nextLine();
		System.out.print("주민번호 입력 : ");
		String ssn = sc.nextLine();
		Human a = o.findHuman(ssn);
		if(a==null) {
			return false;
		} else {
			return o.deleteHuman(a);
		}	
	}
	
	public Human findHuman () {
		sc.nextLine();
		System.out.print("주민번호 입력 : ");
		String ssn = sc.nextLine();
		return o.findHuman(ssn);
	}
	
	public void exec ( ) {
		while(true) {
		this.printMainMenu();
		try{
		int m = sc.nextInt();
		switch(m) {
		case 1 :
			this.insertHuman();
			break;
		case 2 :
			Human a = this.findHuman();
			if(a==null) {
				System.out.println("일치정보 없음");	
				} else {
					a.print();
				}
			break;
		case 3 :
			if(this.deleteHuman()) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
			break;
		case 4 :
			this.printAll();
			break;
		case 0 :
			System.exit(0);
		default :
			System.out.println("잘못된 입력");
			break;
		}}		
		catch(Exception e) {
			sc.nextLine();
			System.out.println("숫자 입력해주세요");
			} 
	}
	}
}
