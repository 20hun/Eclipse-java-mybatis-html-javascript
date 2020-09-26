package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDAO {
	//����� sqlSessionFactory ��ü�� �ҷ��;� �Ѵ�
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//ȸ������ �� ������ dao �޼ҵ�
	public void joinPerson(Person vo) {
		//sqlSessionFactory ��ü ����ؼ� sqlSession ��ü ����
		//���� �߱޹��� Ű(factory)�� ����ؼ� �ǹ�(session)�� ����
		SqlSession session = null;
		//datebase�� ����� ������ �����ϴٰ� ����ġ ���� ���� ������ �� ����ó�� ���ֱ� ���ؼ�
		try {
			//1. db�� ������ session ����
			session = factory.openSession(); //���� > session ����ϱ� ���ؼ��� open �޼ҵ�
			//2. mapperinterface�� class ���·� ���� �޼ҵ� ȣ���� �� �ְ� �ؾ��Ѵ�.
			PersonMapper mapper = session.getMapper(PersonMapper.class); //�̰͵� ����
			//3. class ���·� ������� mapperinterface�� ����ؼ� �޼ҵ� ȣ��
			//ȸ������ �����ض�
			mapper.joinPerson(vo); //���⼭ insert �������� ����
			//4. insert ������ ���� �Ŀ��� �����ϱ� ���� commit
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//session �ٸ� ����� �� �� �ְ� �ݾ����
			//���� �߸� session�� null�� �Ŷ� �ݾ��� �ʿ䵵 ����
			if(session != null) {
				session.close();
			}
		}
	}
	
	//ȸ������ ���
	public void deletePerson(int num) {
		SqlSession session = null;
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			//mapper�������̽��� ������ �ִ� �޼ҵ� �߿� ȸ������ �޼ҵ� ���� > ���� �ȸ�������� �������̽�����
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