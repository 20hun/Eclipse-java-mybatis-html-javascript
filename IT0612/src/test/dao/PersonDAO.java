package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDAO {
	//사용할 sqlSessionFactory 객체를 불러와야 한다
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//회원가입 시 실행할 dao 메소드
	public void joinPerson(Person vo) {
		//sqlSessionFactory 객체 사용해서 sqlSession 객체 생성
		//내가 발급받은 키(factory)를 사용해서 건물(session)에 진입
		SqlSession session = null;
		//datebase에 연결된 쿼리문 실행하다가 예상치 못한 오류 만났을 때 예외처리 해주기 위해서
		try {
			//1. db에 연결할 session 생성
			session = factory.openSession(); //문법 > session 사용하기 위해서는 open 메소드
			//2. mapperinterface를 class 형태로 만들어서 메소드 호출할 수 있게 해야한다.
			PersonMapper mapper = session.getMapper(PersonMapper.class); //이것도 문법
			//3. class 형태로 만들어진 mapperinterface를 사용해서 메소드 호출
			//회원가입 실행해라
			mapper.joinPerson(vo); //여기서 insert 쿼리문이 실행
			//4. insert 쿼리를 실행 후에는 적용하기 위해 commit
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//session 다른 사람도 쓸 수 있게 닫아줘야
			//에러 뜨면 session은 null일 거라 닫아줄 필요도 없음
			if(session != null) {
				session.close();
			}
		}
	}
	
	//회원삭제 기능
	public void deletePerson(int num) {
		SqlSession session = null;
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			//mapper인터페이스가 가지고 있는 메소드 중에 회원삭제 메소드 실행 > 아직 안만들었으니 인터페이스가자
			mapper.deletePerson(num);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session != null) {
				session.close();
			}
		}
	}
}