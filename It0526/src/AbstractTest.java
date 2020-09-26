
public class AbstractTest {
	public static void doPrint(Person p) {
		if(p instanceof Student) {
			p.printInfo();
			Student s = (Student)p;
			s.printInfo();
		}
	}

	public static void main(String[] args) {
		Person p = new Student("¿µÈÆ", 27, "ÇÑ¾ç", 100);
		doPrint(p);

	}

}
