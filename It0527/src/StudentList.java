import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>(); //�� <>�� Student ��������
		//<> �ȿ� Ŭ������, int �ϰ� ������ integer
		
		studentList.add(new Student("����",27));
		studentList.add(new Student("����1",23));
		studentList.add(new Student("����2",20));
		
		for(int i=0 ; i< studentList.size(); i++) {
			System.out.println("�̸� : "
					+studentList.get(i).getName()+
					" ���� : "+studentList.get(i).getScore());
		}
		
		boolean check = studentList.isEmpty();
		System.out.println(check);
		//�����Ͱ� �ֳ� ���� > ������ empty�� �ƴ϶� false
		
		studentList.remove(1); //index1 ����
		for(int i=0 ; i< studentList.size(); i++) {
			System.out.println("�̸� : "
					+studentList.get(i).getName()+
					" ���� : "+studentList.get(i).getScore());
		}
		
		studentList.clear();
		boolean check2 = studentList.isEmpty();
		System.out.println(check2);
		}
}