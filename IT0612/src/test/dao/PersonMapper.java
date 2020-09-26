package test.dao;

import test.vo.Person;

public interface PersonMapper {
	
	public void joinPerson(Person vo);
	public void deletePerson(int num);
}
