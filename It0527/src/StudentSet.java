import java.util.HashSet;

public class StudentSet {

	public static void main(String[] args) {
		HashSet<String> studentSet = new HashSet<>();
		studentSet.add("e");
		studentSet.add("d");
		studentSet.add("e");
		studentSet.add("e");
		
		for(String a : studentSet) {
			System.out.println(a);
		}
	}

}
