package test.ui;

import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		//ȸ�����Ա���� ����ڴ�.
		//1. ȸ�� ���� �����͸� ����ڷκ��� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		//2. �Է¹��� �����͸� ȸ������ ��ü�� �����Ѵ�.
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		
		
		//3. ����� ȸ������ ��ü�� DB�� �����Ѵ�.
		PersonDAO dao = new PersonDAO();
		dao.joinPerson(p);
		//4. DB���� ���޹��� ȸ������ ��ü�� insert �������� ����ؼ� ����Ѵ�.
		*/
		
		//ȸ������ �����ϴ� ���
		//1. ����ڷκ��� �����Ϸ��� ȸ���� pk(ȸ����ȣ) �Է¹���
		System.out.print("�����Ϸ��� ȸ����ȣ �Է� : ");
		int num = sc.nextInt();
		PersonDAO dao = new PersonDAO();
		
		//2. �Է¹��� pk�� db�� �����ؼ� delete ������ ����
		dao.deletePerson(num);
	}

}
