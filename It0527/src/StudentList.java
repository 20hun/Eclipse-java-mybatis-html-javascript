import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>(); //뒤 <>에 Student 생략가능
		//<> 안에 클래스명, int 하고 싶으면 integer
		
		studentList.add(new Student("영훈",27));
		studentList.add(new Student("영훈1",23));
		studentList.add(new Student("영훈2",20));
		
		for(int i=0 ; i< studentList.size(); i++) {
			System.out.println("이름 : "
					+studentList.get(i).getName()+
					" 점수 : "+studentList.get(i).getScore());
		}
		
		boolean check = studentList.isEmpty();
		System.out.println(check);
		//데이터가 있냐 없냐 > 있으면 empty가 아니라 false
		
		studentList.remove(1); //index1 지움
		for(int i=0 ; i< studentList.size(); i++) {
			System.out.println("이름 : "
					+studentList.get(i).getName()+
					" 점수 : "+studentList.get(i).getScore());
		}
		
		studentList.clear();
		boolean check2 = studentList.isEmpty();
		System.out.println(check2);
		}
}