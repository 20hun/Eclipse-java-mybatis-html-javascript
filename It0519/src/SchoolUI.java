import java.util.Scanner;

public class SchoolUI {
	SchoolManager o = new SchoolManager();
	Scanner sc = new Scanner(System.in);

	public void printMainMenu () {
		System.out.println("========");
		System.out.println("���� ���� �ý���");
		System.out.println("========");
		System.out.println("1. ���");
		System.out.println("2. �ֹι�ȣ ã��");
		System.out.println("3. �ֹι�ȣ ����");
		System.out.println("4. ��ü���");
		System.out.println("0. ����");
		System.out.println("========");
		System.out.print("�޴� ���� => ");
	}
	
	public void printInsertHumanMenu () {
		System.out.println("========");
		System.out.println("��� �޴�");
		System.out.println("========");
		System.out.println("1. �л�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("0. �����޴�");
		System.out.println("========");
		System.out.print("�޴� ���� => ");
	}
	
	public void printAll () {
		o.printAll();
	}
	
	public boolean insertStudent ( ) {
		System.out.println("========");
		System.out.println("�л� ���");
		System.out.println("========");
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		try{
			int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ֹι�ȣ : ");
		String sn = sc.nextLine();
		System.out.print("�й� : ");
		String ssn = sc.nextLine();
		
		Student s = new Student(name, sn, age, ssn);
		
		if(o.insertHuman(s)) {
			System.out.println("������ �Ϸ�");
		} else {
			System.out.println("��� ����(�̹� ���� �ֹι�ȣ)");
		}
		
		return o.insertHuman(s);
		}catch (Exception e) {
			System.out.println("�߸��� �Է�"+"\n"+"��� ����");
			sc.nextLine();
			return false;
		}
	}
	
	public boolean insertStaff ( ) {
		System.out.println("========");
		System.out.println("���� ���");
		System.out.println("========");
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		try {
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ֹι�ȣ : ");
		String sn = sc.nextLine();
		System.out.print("�μ� : ");
		String field = sc.nextLine();
		
		Staff s = new Staff(name, sn, age, field);
		
		if(o.insertHuman(s)) {
			System.out.println("������ �Ϸ�");
		} else {
			System.out.println("��� ����(�̹� ���� �ֹι�ȣ)");
		}
		
		return o.insertHuman(s);
		}catch (Exception e) {
			System.out.println("�߸��� �Է�"+"\n"+"��� ����");
			sc.nextLine();
			return false;
		}
	}
	
	public boolean insertProfessor ( ) {
		System.out.println("========");
		System.out.println("���� ���");
		System.out.println("========");
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		try {
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("�ֹι�ȣ : ");
		String sn = sc.nextLine();
		System.out.print("���� : ");
		String major = sc.nextLine();
		
		Professor s = new Professor(name, sn, age, major);
		
		if(o.insertHuman(s)) {
			System.out.println("������ �Ϸ�");
		} else {
			System.out.println("��� ����(�̹� ���� �ֹι�ȣ)");
		}
		
		return o.insertHuman(s);
		}catch (Exception e) {
			System.out.println("�߸��� �Է�"+"\n"+"��� ����");
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
				System.out.println("�߸��� �Է�");
				break;
			} 
			if(m ==0) {
				break;
			}
			} catch (Exception e){
				sc.nextLine();
				System.out.println("���� �Է����ּ���");
			}
		}
	}
	
	public boolean deleteHuman () {
		sc.nextLine();
		System.out.print("�ֹι�ȣ �Է� : ");
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
		System.out.print("�ֹι�ȣ �Է� : ");
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
				System.out.println("��ġ���� ����");	
				} else {
					a.print();
				}
			break;
		case 3 :
			if(this.deleteHuman()) {
				System.out.println("��������");
			} else {
				System.out.println("��������");
			}
			break;
		case 4 :
			this.printAll();
			break;
		case 0 :
			System.exit(0);
		default :
			System.out.println("�߸��� �Է�");
			break;
		}}		
		catch(Exception e) {
			sc.nextLine();
			System.out.println("���� �Է����ּ���");
			} 
	}
	}
}
