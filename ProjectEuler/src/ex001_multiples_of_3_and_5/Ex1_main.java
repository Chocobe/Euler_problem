package ex001_multiples_of_3_and_5;

public class Ex1_main {
	public static void main(String[] args) {
		
		int sum = 0;							// �հ�
		int limit_num = 1000;					// �Ѱ谪(�̸��� ��)
		int multiple_3 = 3;						// ��� ����1
		int multiple_5 = 5;						// ��� ����2
		int overlap = multiple_3 * multiple_5;	// �ߺ���
		
		sum += sum_of_multiple_of(multiple_3, limit_num);	// 3�� ����� ����
		sum += sum_of_multiple_of(multiple_5, limit_num);	// 5�� ����� ����		
		sum -= sum_of_multiple_of(overlap, limit_num);		// �ߺ���(15) ����
		
		System.out.println("Sum of Multiples of 3 and 5 : " + sum);
	}
	
	/***
	 * �޼��� : "_val"���� ����� ���� (�Ѱ谪 ����)
	 * 
	 * Ex1_main Ŭ������ ��ü�� ���� ����ϴ°� �ƴϱ� ������,
	 * ���� �޼���� ���� (static method)
	 */
	public static int sum_of_multiple_of(int _val, int _max) {
		
		int temp = 0;	// ������ �ش簪 ����
		
		for(int i = 0; i * _val < _max; i++) {
			temp += (i * _val);
		}
		
		return temp;
	}
}
