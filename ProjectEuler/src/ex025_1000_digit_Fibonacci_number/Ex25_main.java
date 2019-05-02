package ex025_1000_digit_Fibonacci_number;

import java.math.BigInteger;

public class Ex25_main {
	public static void main(String[] args) {
		
		long start_time = System.nanoTime();
		
		// ���ϰ��� �ϴ� ���� ������
		BigInteger target_digits = BigInteger.valueOf(10);
		target_digits = target_digits.pow(999);
		
		// �Ǻ���ġ ������ ���� ������ �迭
		BigInteger[] fibo_arr = new BigInteger[10000];
		// ���� �ε����� �Ǻ���ġ ���� ��
		BigInteger cur_fibo = BigInteger.valueOf(0);
		// ������(�ε�����ȣ)
		int loop = -1;
		
		// ���� �ε����� ������ < ��ǥ��
		while(cur_fibo.compareTo(target_digits) == -1) {
			loop++;
			// ���� ���̺� ����
			fibo_arr = Ex25_func.fibonacci(fibo_arr, loop);
			cur_fibo = fibo_arr[loop];
		}
		
		System.out.println(loop + "��° �� : " + fibo_arr[loop]);
		
		// ���μ��� ���� �ð�
		long end_time = System.nanoTime();
		float process_time = (float)((end_time - start_time) / Math.pow(10, 9));
		System.out.println("����ð� : " + process_time + "��");
		
	}
}
