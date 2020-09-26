package test.ui;

import java.util.Scanner;

import test.dao.PersonDAO;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		//회원가입기능을 만들겠다.
		//1. 회원 가입 데이터를 사용자로부터 입력받는다.
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		//2. 입력받은 데이터를 회원가입 객체에 저장한다.
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		
		
		//3. 저장된 회원가입 객체를 DB에 전달한다.
		PersonDAO dao = new PersonDAO();
		dao.joinPerson(p);
		//4. DB에서 전달받은 회원가입 객체를 insert 쿼리문을 사용해서 등록한다.
		*/
		
		//회원정보 삭제하는 기능
		//1. 사용자로부터 삭제하려는 회원의 pk(회원번호) 입력받자
		System.out.print("삭제하려는 회원번호 입력 : ");
		int num = sc.nextInt();
		PersonDAO dao = new PersonDAO();
		
		//2. 입력받은 pk를 db에 전달해서 delete 쿼리문 실행
		dao.deletePerson(num);
	}

}
