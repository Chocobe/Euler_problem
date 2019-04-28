package ex020_factorial_digit_sum;

import java.math.BigInteger;

public class Ex20_func {
	
	/***
	 * ���丮�� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _val : ���丮���� ���ϰ��� �ϴ� ��
	 * 
	 * ��ȯ�� :
	 * 		BigInteger�� ���丮��
	 */
	public static BigInteger factorial(int _val) {
		BigInteger factorial = new BigInteger("1");
		
		for(int i = 1; i <= _val; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		return factorial;
	}
	
	/***
	 * �� ������ �� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		BigInteger _val : ���丮���� �����
	 * 
	 * ��ȯ�� :
	 * 		���丮���� �� ������ �� (BigInteger��)
	 */
	public static int each_sum(BigInteger _val) {
		int sum = 0;
		
		// �Ű������� String������ ����ȯ
		String temp = _val.toString();
		// ����ȯ�� ���ڿ��� ����
		int temp_len = temp.length();
		
		// �� ���� ���Ѵ�.
		for(int i = 0; i < temp_len; i++) {
			int cur_val = Integer.parseInt(temp.substring(i, i + 1));
			
			sum += cur_val;
		}
		
		return sum;
	}
}