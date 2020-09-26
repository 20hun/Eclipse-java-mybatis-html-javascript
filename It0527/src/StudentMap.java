import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		/*HashMap<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student("후니",38));
		studentMap.put(2, new Student("아니",34));
		studentMap.put(2, new Student("여니",31));
		studentMap.put(4, new Student("오니",32));*/
		HashMap<String, Student> studentMap = new HashMap<>();
		studentMap.put("홍", new Student("후니",38));
		studentMap.put("김", new Student("아니",34));
		studentMap.put("김", new Student("여니",31));
		studentMap.put("이", new Student("오니",32));
		//순서가 없어서 반복문으로 출력 불가
		
		Set<String> keys = studentMap.keySet();
		
		//for each문
		// : 기준으로 오른쪽은 반복시키는 대상, 데이터를 다들고있는
		// 왼쪽은 오른쪽 데이터 반복했을때 생성되는 데이터(<>안에 있는) 1바퀴 돌면 새로운 s 생성
		for(String s : keys) {
			System.out.println("이름 : "+studentMap.get(s).getName()+
					" 나이 : "+studentMap.get(s).getScore());
		}
		
		/*System.out.println(studentMap.get(4).getName());*/ //()안에 key값

	}

}
