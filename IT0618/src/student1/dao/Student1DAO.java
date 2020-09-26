package student1.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import student1.vo.Student1;

public class Student1DAO {
		private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();

		public int insertStudent1(Student1 vo) {
			SqlSession session = null;
			int cnt = 0;
			
			try {
				session = factory.openSession();
				Student1Mapper mapper = session.getMapper(Student1Mapper.class);
				cnt = mapper.insertStudent1(vo);
				session.commit();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(session != null) {
					session.close();
				}
			}
			return cnt;
		}
		
		public ArrayList<Student1> printAllStudent1(){
			SqlSession session = null;
			ArrayList<Student1> list = null;
			
			try {
				session = factory.openSession();
				Student1Mapper mapper = session.getMapper(Student1Mapper.class);
				list = mapper.printAllStudent1();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(session != null) {
					session.close();
				}
			}
			return list;
		}
		
		public int deleteStudent1(int id) {
			SqlSession session = null;
			int cnt = 0;
			
			try {
				session = factory.openSession();
				Student1Mapper mapper = session.getMapper(Student1Mapper.class);
				cnt = mapper.deleteStudent1(id);
				session.commit();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(session != null) {
					session.close();
				}
			}
			return cnt;
		}
		
		public int updateStudent1(Student1 vo) {
			SqlSession session = null;
			int cnt = 0;
			
			try {
				session = factory.openSession();
				Student1Mapper mapper = session.getMapper(Student1Mapper.class);
				cnt = mapper.updateStudent1(vo);
				session.commit();
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				if(session != null) {
					session.close();
				}
			}
			
			return cnt;
		}
		
		public ArrayList<Student1> searchStudent1(String name){
			SqlSession session = null;
			ArrayList<Student1> list = null;
			
			try {
				session = factory.openSession();
				Student1Mapper mapper = session.getMapper(Student1Mapper.class);
				list = mapper.searchStudent1(name);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(session != null) {
					session.close();
				}
			}
			return list;
		}

}
