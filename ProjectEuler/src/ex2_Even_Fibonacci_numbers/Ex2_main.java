package ex2_Even_Fibonacci_numbers;

public class Ex2_main {
	public static void main(String[] args) {
				
		int lhs = 1;				// ������
		int rhs = 1;				// ������
		int limit_num = 4000000;	// �Ѱ谪
		int sum = 0;				// �����
		
		// ���� �ذ�� �޼��� ȣ��
		Ex2_fibo.fibo_sum(lhs, rhs, limit_num);
		
		// ����� ��������
		sum = Ex2_fibo.getSum();
		
		// ���
		System.out.println("Totla : " + sum);
	}
}
