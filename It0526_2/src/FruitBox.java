
public class FruitBox<T> {
	
	//�ڽ��� ��� ���� (���, ����)
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
		//���� �ִ� T���� Apple�� �ٲ�
		box.set(new Apple()); //set(Apple obj = new Apple());
		//box.set(new Grape());
		System.out.println(((Apple)box.get()).getName());
		}
}
