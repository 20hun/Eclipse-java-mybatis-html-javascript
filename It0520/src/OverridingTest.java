/*public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String printAll() {
		return "Name : "+name +", Age : "+age;
	}
}

public class Student extends Person {
	private String no;
	
	public Student (String name, int age, String no) {
		super(name, age);
		
		this.no = no;
		
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	
	public String printAll() {
		return super.printAll()+", NO = "+no;
	}
	

}
*/
public class OverridingTest {

	public static void main(String[] args) {
	
		Person person = new Student("����", 20, "0123");
		Student student = new Student("ö��", 21, "1423");
		//String number = person.getNo(); �Ұ���
		System.out.println(student.printAll());
		System.out.println(person.printAll());
		//�������̵��� �޼ҵ�� �ڽ����·� ���
		}

}
