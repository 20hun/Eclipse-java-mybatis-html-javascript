import java.util.ArrayList;

public class SchoolManager {
	ArrayList<Human> aList = new ArrayList<>();
	//Human[] arr = new Human[100];
	//int count = 0;
	
	public boolean insertHuman (Human a) {
		for(int i = 0 ; i<aList.size() ; i++) {
			if(a.getSn().equals(aList.get(i).getSn())) { 
				return false;
			}
			}
		//boolean check == findHuman(a.getSn()) == null ? false : true;
		//이렇게 하는게 더 효율적
		//코드 재사용 > 나중에 검색 조건 주민번호가 아닌거 다른거 하면
		//findHuman만 수정하면 됨!
		
			if(a instanceof Student) {
				Student s = (Student) a;
				ArrayList<Student> aList2 = new ArrayList<>();
				//Student[] arr2 = new Student[100];
				for(int j = 0; j<aList.size();j++) {
					aList2.add((Student) aList.get(j));
					if(s.getSsn().equals(aList2.get(j).getSsn())){
						return false;
					}
				}
			}
			aList.add(a);
		//arr[count++] = a;
		//count++;
		//배열에 객체 하나씩 넣는 메소드 있으면 count++로 인해
		//메소드 실행 후 arr[count]는 null 상태
		return true;
		}

	public Human findHuman (String a) {
		for(int i = 0 ; i<aList.size() ; i++) {
		if(a.equals(aList.get(i).getSn())) {
			return aList.get(i);
		}
		}
		return null;
	}
	
	public boolean deleteHuman (Human a) {
		for(int i = 0 ; i<aList.size() ; i++) {
			if(aList.get(i)==a) {
				aList.remove(i);
				return true;
			}
		}
				/*for(int j = i ; j<count-1; j++) {
				arr[j] = arr[j+1];
				}
				count--;
				return true;
			}
		}*/
		return false;
	}

	public void printAll() {
		for(int i = 0 ; i<aList.size() ; i++) {
			aList.get(i).print();
		}
}
}