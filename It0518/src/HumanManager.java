import java.util.Scanner;

public class HumanManager {
	Scanner sc = new Scanner(System.in);
	
	Student[] arr = new Student[100];
	int count = 0;

	/*public HumanManager() {
		do {
			System.out.println("1 : �Է�");
			System.out.println("2 : ���");
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			switch (num) {
			case 1 :
				arr[count] = insertS();
				count++;
				break;
			case 2 :
				showAll();
				break;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���.");
				break;
			}
		} while(true);*/
		public void insertStudent (String name, int age, int stNum) {
		
		Student r = new Student(name, age, stNum);
		
			arr[count] = r;
			count++;
		}
		
		public void showAll() {
			for(int i = 0 ; i<count ; i++) {
				arr[i].showInfo();
			}
		}
		
		/*public Student insertS() {
			sc.nextLine();
			
			System.out.print("�̸� �Է� : ");
			String name = sc.nextLine();
			System.out.print("���� �Է� : ");
			int age = sc.nextInt();
			System.out.print("�й� �Է�: ");
			int stNum = sc.nextInt();
			
			Student s = new Student(name, age, stNum);			
			
			return s;
		}*/
}