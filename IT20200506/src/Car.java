
public class Car {
	private String name;
	private String carNum;
	private String myNum;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCarNum() {
		return carNum;
	}
	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}
	public String getMyNum() {
		return myNum;
	}
	public void setMyNum(String myNum) {
		this.myNum = myNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void printInfo() {
		System.out.println("�̸� : "+name);
		System.out.println("����ȣ : "+carNum);
		System.out.println("��ȭ��ȣ : "+myNum);
		System.out.println("��ġ : "+location);
	}	
}
