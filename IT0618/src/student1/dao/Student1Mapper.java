package student1.dao;

import java.util.ArrayList;

import student1.vo.Student1;

public interface Student1Mapper {
	
	public int insertStudent1(Student1 vo);
	
	public ArrayList<Student1> printAllStudent1();

	public int deleteStudent1(int id);
	
	public int updateStudent1(Student1 vo);
	
	public ArrayList<Student1> searchStudent1(String name);
}
