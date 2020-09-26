import java.util.Scanner;

public class HumanManager {
	Scanner sc = new Scanner(System.in);
	
	Student[] arr = new Student[100];
	int count = 0;

	/*public HumanManager() {
		do {
			System.out.println("1 : 입력");
			System.out.println("2 : 출력");
			System.out.print("선택 : ");
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
				System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
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
			
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			System.out.print("나이 입력 : ");
			int age = sc.nextInt();
			System.out.print("학번 입력: ");
			int stNum = sc.nextInt();
			
			Student s = new Student(name, age, stNum);			
			
			return s;
		}*/
}