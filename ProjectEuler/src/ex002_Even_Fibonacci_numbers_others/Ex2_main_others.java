package ex002_Even_Fibonacci_numbers_others;

/***
 * �Ǻ���ġ ������ ���캸��.
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 *(a, b, c, a, b, c,  a,  b,  c,  a,  b,   c...) 
 *
 * ������ a, b, c, �� ������� �Űܺ���...
 * c�� ���� ¦����� ���� �� �� �ִ�.
 * 
 * �̸� �̿��� ���������� �ذ��� ����̴�.
 */

public class Ex2_main_others {
	public static void main(String[] args) {
		
		int lhs = 1;				// a��
		int rhs = 1;				// b��
		int target = 0;				// c��
		int sum = 0;				// �հ�
		int limit_num = 4000000;	// ������
		
		target = lhs + rhs;
		
		while(target < limit_num) {
			
			sum += target;		// target��(c��) �� "�հ�"�� ���Ѵ�.
			
			lhs = rhs + target;
			rhs = lhs + target;
			target = lhs + rhs;
		}
		
		System.out.println("Total = " + sum);
	}
}
