package member.manager; //��� ���

import java.util.Scanner;

import member.vo.Member;

public class MemberManager {
	Member[] memberArray = new Member[10]; //membermanager ��ü ��� ����
	int count = 0; //���� ����� ȸ���� ��, memberArray�� �ε���
	
	//������
	public MemberManager() {
		
		/*Member[] memberArray = new Member[10];*/ //�����ڿ����� ��� ���� > membermanager ���� �޼ҵ忡�� ȣȯx
		
		/*Member m = new Member();*/ //28��° �� ����� �ű� > �׷��� �迭 ���� �� ���� ��� ������ �Ѹ��� ���� ���� > �ٽ� 18�ٷ� �ű�
		
		do{
			/*Member m = new Member(); > �׷��� �̰͵� ��ȿ���� case1�� ��*/
			
			//�޴� ���
			printMenu();
		
		//����ڷκ��� �޴���ȣ �Է¹޴� �ڵ� �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴���ȣ �Է� : ");
		int menuNum = sc.nextInt();
		
		/*Member m = new Member();*/ //do�� 1�� ���� �� while ���� �ǵ��� ���� �� �ٽ� ����, ���ο� ��ü ����� ���� �ʱⰪ ���
		//����ڰ� �Է��� ��ȣ�� ���� ��� �б�(����)ó�� ���ش�
		switch(menuNum) {
		
		case 1 :
			if(count >10) {
				System.out.println("ȸ�� ������ 10�� ������ ��� �� �� �ֽ��ϴ�.");
				break;
			}
			Member m = new Member(); //ȸ�������� �Է��ϰڴٰ� ���� �� ��ü �����ϴ°� ���� �ո���
			
			sc.nextLine();
			
			System.out.print("�̸��� �Է��� �ּ��� : ");
			String name = sc.nextLine();
			m.setName(name);
			System.out.print("��ȭ��ȣ �Է��� �ּ��� : ");
			String phone = sc.nextLine();
			m.setPhone(phone);
			System.out.print("���� �Է��� �ּ��� : ");
			int age = sc.nextInt();
			m.setAge(age);
			
			memberArray[count] = m;
			count++;
			
			break;
		case 2 :
			if (count == 0) {
				System.out.println("��ϵ� ȸ�� ������ �����ϴ�");
				break;
			}
			for(int i = 0 ; i < count ; i++) {
				/*System.out.println("�̸��� : "+memberArray[i].getName());
				System.out.println("��ȭ��ȣ�� : "+memberArray[i].getPhone());
				System.out.println("���̴� : "+memberArray[i].getAge());*/
				memberArray[i].printInfo();
			}
			
			break;
		case 3:
			System.exit(0);
			break;
		default :
			//�޴� ��ȣ �߸� �Է��� ��Ȳ > �߸� �Է� �޽��� ����ϰ� �޴� �ٽ� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}while(true);
	}
	public void printMenu() {
		System.out.println("=============");
		System.out.println("1. �Է��ϱ�");
		System.out.println("2. ����ϱ�");
		System.out.println("3. ����");
		System.out.println("=============");
	}
}
