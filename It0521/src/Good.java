
public class Good {
	private String name, number;
	private int age;
	
	public Good () {
		
	}

	public Good (String name, String number, int age) {
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
	//+게터세터
	
	//생성자 오버로딩 보편적으로 이 두개를 같이 제공
	//위에꺼 쓰면 세터 이용해서 속성값 넣어야함
	//불편하지만 일단 값 넣을 상황 아닐 경우 유용 
}
