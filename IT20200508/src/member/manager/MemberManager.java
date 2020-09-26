package member.manager; //기능 담당

import java.util.Scanner;

import member.vo.Member;

public class MemberManager {
	Member[] memberArray = new Member[10]; //membermanager 전체 사용 가능
	int count = 0; //지금 저장된 회원의 수, memberArray의 인덱스
	
	//생성자
	public MemberManager() {
		
		/*Member[] memberArray = new Member[10];*/ //생성자에서만 사용 가능 > membermanager 안의 메소드에서 호환x
		
		/*Member m = new Member();*/ //28번째 줄 여기로 옮김 > 그런데 배열 생성 후 여기 계속 있으면 한명의 정보 유지 > 다시 18줄로 옮김
		
		do{
			/*Member m = new Member(); > 그런데 이것도 비효율적 case1로 감*/
			
			//메뉴 출력
			printMenu();
		
		//사용자로부터 메뉴번호 입력받는 코드 작성
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호 입력 : ");
		int menuNum = sc.nextInt();
		
		/*Member m = new Member();*/ //do문 1번 실행 후 while 의해 되돌아 왔을 때 다시 실행, 새로운 객체 만들어 져서 초기값 출력
		//사용자가 입력한 번호에 따라 기능 분기(조건)처리 해준다
		switch(menuNum) {
		
		case 1 :
			if(count >10) {
				System.out.println("회원 정보를 10개 까지만 등록 할 수 있습니다.");
				break;
			}
			Member m = new Member(); //회원정보를 입력하겠다고 했을 때 객체 생성하는게 가장 합리적
			
			sc.nextLine();
			
			System.out.print("이름을 입력해 주세요 : ");
			String name = sc.nextLine();
			m.setName(name);
			System.out.print("전화번호 입력해 주세요 : ");
			String phone = sc.nextLine();
			m.setPhone(phone);
			System.out.print("나이 입력해 주세요 : ");
			int age = sc.nextInt();
			m.setAge(age);
			
			memberArray[count] = m;
			count++;
			
			break;
		case 2 :
			if (count == 0) {
				System.out.println("등록된 회원 정보가 없습니다");
				break;
			}
			for(int i = 0 ; i < count ; i++) {
				/*System.out.println("이름은 : "+memberArray[i].getName());
				System.out.println("전화번호는 : "+memberArray[i].getPhone());
				System.out.println("나이는 : "+memberArray[i].getAge());*/
				memberArray[i].printInfo();
			}
			
			break;
		case 3:
			System.exit(0);
			break;
		default :
			//메뉴 번호 잘못 입력한 상황 > 잘못 입력 메시지 출력하고 메뉴 다시 출력
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}while(true);
	}
	public void printMenu() {
		System.out.println("=============");
		System.out.println("1. 입력하기");
		System.out.println("2. 출력하기");
		System.out.println("3. 종료");
		System.out.println("=============");
	}
}
