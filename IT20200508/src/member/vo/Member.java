package member.vo; //���� ���

public class Member {
	private int age;
	private String name;
	private String phone;
	
	public Member() {
		/*do{
			//�޴� ���
			printMenu();
		
		//����ڷκ��� �޴���ȣ �Է¹޴� �ڵ� �ۼ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴���ȣ �Է� : ");
		int menuNum = sc.nextInt();
		
		//����ڰ� �Է��� ��ȣ�� ���� ��� �б�(����)ó�� ���ش�
		switch(menuNum) {
		case 1 :
			sc.nextLine();
			System.out.print("�̸��� �Է��� �ּ��� : ");
			name = sc.nextLine();
			System.out.print("��ȭ��ȣ �Է��� �ּ��� : ");
			phone = sc.nextLine();
			System.out.print("���� �Է��� �ּ��� : ");
			age = sc.nextInt();
			break;
		case 2 :
			System.out.println("�̸��� : "+name);
			System.out.println("��ȭ��ȣ�� : "+phone);
			System.out.println("���̴� : "+age);
			break;
		case 3:
			System.exit(0);
			break;
		default :
			//�޴� ��ȣ �߸� �Է��� ��Ȳ > �߸� �Է� �޽��� ����ϰ� �޴� �ٽ� ���
			System.out.println("�߸� �Է��ϼ̽��ϴ�");
			break;
		}
	}while(true); //�̹� case3 Ż�ⱸ�� ������ �ֱ� ������ ���ѷ���*/
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
		System.out.println("���� �̸� : "+name);
		System.out.println("���� ���� : "+age);
		System.out.println("���� ��ȣ : "+phone);
	}
}
