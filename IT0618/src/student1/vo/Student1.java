package student1.vo;

public class Student1 {
	private int id;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private String indate;
	private double gps_x;
	
	public Student1() {
		super();
	}

	public Student1(int id, String name, int kor, int eng, int mat, String indate, double gps_x) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.indate = indate;
		this.gps_x = gps_x;
	}
	
	public Student1(int id, String name, int kor, int eng, int mat, double gps_x) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.gps_x = gps_x;
	}
	
	public Student1(String name, int kor, int eng, int mat, double gps_x) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.gps_x = gps_x;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public double getGps_x() {
		return gps_x;
	}

	public void setGps_x(double gps_x) {
		this.gps_x = gps_x;
	}

	@Override
	public String toString() {
		return id+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+indate+"\t"+gps_x;
	}

}
