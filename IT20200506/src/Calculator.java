//����� �� �� �ִ� Ŭ����
public class Calculator {
	
	//�����ڴ� Ŭ���� �ȿ��� 1���� ���� �ۼ����� ������ �⺻ ������ �ڵ� ����
	//������ �ۼ��ϸ� �⺻ ������ �Ȼ���
	/*�⺻������
	public Calculator() {
		max = 10000.0;
	}*/
	
	int sum;
	double max;
	
	public Calculator(double m) {
		max = m;
	}
	
	//���������� ����Ÿ�� �޼ҵ��(�Ű�������)
	//2���� ������ �Ű����� �Է¹޾� ���� ���� �� ����� ��ȯ���ִ� �޼ҵ�
	public int plus(int num1, int num2) {
		sum = num1 + num2;
		return sum;
	}
}
