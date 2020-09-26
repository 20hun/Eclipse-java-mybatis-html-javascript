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
		System.out.print("선택 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 :
			cArray[count] = carIn();
			count++;
			break;			
		case 2 :
			sc.nextLine();
			System.out.print("전화번호 입력 : ");
			String myNum = sc.nextLine();
			for(int i = 0; i<count ; i++) {
			if(myNum.equals(cArray[i].getMyNum())) {
				cArray[i].printInfo();
			}else {
				System.out.println("검색결과가 없습니다.");
			}
			}
			break;
		case 3 :
			for(int i = 0 ; i<count ; i++) {
				cArray[i].printInfo();
			}
			break;
		case 4 :
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}
	}
	
	public void menu() {
		System.out.println("============");
		System.out.println("1.예약");
		System.out.println("2.조회");
		System.out.println("3.전체출력");
		System.out.println("4.프로그램종료");
		System.out.println("============");
	}
	
	public Car carIn() {
		sc.nextLine();
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("차번호 입력 : ");
		String carNum = sc.nextLine();
		System.out.print("전화번호 입력 : ");
		String myNum = sc.nextLine();
		System.out.print("위치 입력 : ");
		String location = sc.nextLine();
		
		Car c = new Car();
		c.setName(name);
		c.setCarNum(carNum);
		c.setMyNum(myNum);
		c.setLocation(location);
		
		return c;
	}
}
