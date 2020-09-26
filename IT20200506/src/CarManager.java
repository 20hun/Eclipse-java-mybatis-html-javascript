import java.util.Scanner;

public class CarManager {
	Scanner sc = new Scanner(System.in);
	
	Car[] cArray = new Car[10];
	int count = 0;
	
	public CarManager() {
	do {
		menu();
		inSert();
	}while(true);	
	}
	
	public void inSert() {
		System.out.print("���� : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 :
			cArray[count] = carIn();
			count++;
			break;			
		case 2 :
			sc.nextLine();
			System.out.print("��ȭ��ȣ �Է� : ");
			String myNum = sc.nextLine();
			for(int i = 0; i<count ; i++) {
			if(myNum.equals(cArray[i].getMyNum())) {
				cArray[i].printInfo();
			}else {
				System.out.println("�˻������ �����ϴ�.");
			}
			}
			break;
		case 3 :
			for(int i = 0 ; i<count ; i++) {
				cArray[i].printInfo();
			}
			break;
		case 4 :
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
	}
	
	public void menu() {
		System.out.println("============");
		System.out.println("1.����");
		System.out.println("2.��ȸ");
		System.out.println("3.��ü���");
		System.out.println("4.���α׷�����");
		System.out.println("============");
	}
	
	public Car carIn() {
		sc.nextLine();
		
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.print("����ȣ �Է� : ");
		String carNum = sc.nextLine();
		System.out.print("��ȭ��ȣ �Է� : ");
		String myNum = sc.nextLine();
		System.out.print("��ġ �Է� : ");
		String location = sc.nextLine();
		
		Car c = new Car();
		c.setName(name);
		c.setCarNum(carNum);
		c.setMyNum(myNum);
		c.setLocation(location);
		
		return c;
	}
}
