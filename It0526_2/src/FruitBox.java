
public class FruitBox<T> {
	
	//박스에 담긴 과일 (사과, 포도)
	private T object;
	
	public T get() {
		return object;
	}
	
	public void set(T obj){
		this.object = obj;
	}
	
	public static void main(String[] args){
		//FruitBox<Apple> box = new FruitBox<Apple>();
		FruitBox box = new FruitBox();
		//위에 있는 T들이 Apple로 바뀜
		box.set(new Apple()); //set(Apple obj = new Apple());
		//box.set(new Grape());
		System.out.println(((Apple)box.get()).getName());
		}
}
