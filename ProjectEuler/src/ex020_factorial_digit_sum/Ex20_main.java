package ex020_factorial_digit_sum;

import java.math.BigInteger;

public class Ex20_main {
	public static void main(String[] args) {
		
		// ���ϰ��� �ϴ� ��
		int target_num = 100;
		
		// ���丮���� ������ ����
		BigInteger factorial_val = new BigInteger("0");
		// ���丮���� �� ���� ��
		int total_sum = 0;
		
		// ���丮�� ���
		factorial_val = Ex20_func.factorial(target_num);
		
		// ���丮���� �� ���� �� ���
		total_sum = Ex20_func.each_sum(factorial_val);
		
		System.out.println(target_num + "! �� ���� ���� : " + total_sum);		
	}
}
