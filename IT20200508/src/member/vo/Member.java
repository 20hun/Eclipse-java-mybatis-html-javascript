package member.vo; //정보 담당

public class Member {
	private int age;
	private String name;
	private String phone;
	
	public Member() {
		/*do{
			//메뉴 출력
			printMenu();
		
		//사용자로부터 메뉴번호 입력받는 코드 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호 입력 : ");
		int menuNum = sc.nextInt();
		
		//사용자가 입력한 번호에 따라 기능 분기(조건)처리 해준다
		switch(menuNum) {
		case 1 :
			sc.nextLine();
			System.out.print("이름을 입력해 주세요 : ");
			name = sc.nextLine();
			System.out.print("전화번호 입력해 주세요 : ");
			phone = sc.nextLine();
			System.out.print("나이 입력해 주세요 : ");
			age = sc.nextInt();
			break;
		case 2 :
			System.out.println("이름은 : "+name);
			System.out.println("전화번호는 : "+phone);
			System.out.println("나이는 : "+age);
			break;
		case 3:
			System.exit(0);
			break;
		default :
			//메뉴 번호 잘못 입력한 상황 > 잘못 입력 메시지 출력하고 메뉴 다시 출력
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}while(true); //이미 case3 탈출구를 가지고 있기 때문에 무한루프*/
}
	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printInfo() {
		System.out.println("저장 이름 : "+name);
		System.out.println("저장 나이 : "+age);
		System.out.println("저장 번호 : "+phone);
	}
}
