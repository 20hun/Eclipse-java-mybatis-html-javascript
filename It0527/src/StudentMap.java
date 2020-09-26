import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		/*HashMap<Integer, Student> studentMap = new HashMap<>();
		studentMap.put(1, new Student("�Ĵ�",38));
		studentMap.put(2, new Student("�ƴ�",34));
		studentMap.put(2, new Student("����",31));
		studentMap.put(4, new Student("����",32));*/
		HashMap<String, Student> studentMap = new HashMap<>();
		studentMap.put("ȫ", new Student("�Ĵ�",38));
		studentMap.put("��", new Student("�ƴ�",34));
		studentMap.put("��", new Student("����",31));
		studentMap.put("��", new Student("����",32));
		//������ ��� �ݺ������� ��� �Ұ�
		
		Set<String> keys = studentMap.keySet();
		
		//for each��
		// : �������� �������� �ݺ���Ű�� ���, �����͸� �ٵ���ִ�
		// ������ ������ ������ �ݺ������� �����Ǵ� ������(<>�ȿ� �ִ�) 1���� ���� ���ο� s ����
		for(String s : keys) {
			System.out.println("�̸� : "+studentMap.get(s).getName()+
					" ���� : "+studentMap.get(s).getScore());
		}
		
		/*System.out.println(studentMap.get(4).getName());*/ //()�ȿ� key��

	}

}
