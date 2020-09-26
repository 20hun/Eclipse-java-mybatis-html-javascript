
public class P1 {
	private final int defaultPrice = 10000;
	private String name;
	private int price;
	
	public P1() {
		
	}
	
	public P1(String name) {
		this.name = name;
		this.price = defaultPrice;
	}
	
	public P1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
