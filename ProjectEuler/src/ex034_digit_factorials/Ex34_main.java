package ex034_digit_factorials;

public class Ex34_main {
	public static void main(String[] args) {
		
		// ���� ����
		long begin_time = System.nanoTime();
		
		int target = 0;			// ���
		int sum_factorial = 0;	// ����� ���ڵ��� ���丮�� ��
		int[] digit_factorials = new int[0];		// ���ǿ� �´� ���� �迭
		int loop_limit = Ex34_func.loop_limit();	// ������ �Ѱ谪
		
		int total_sum = 0;	// ���ǿ� �´� ������ �� ��
		
		for(target = 10; target < loop_limit; target++) {
			// ����� ���ڵ��� ���丮�� �� ����
			sum_factorial = Ex34_func.digit_factorial(target);
			
			// ��� == ���丮���� �� �̶��,
			if(target == sum_factorial) {
				// ����
				digit_factorials = Ex34_func.add_idx(target, digit_factorials);
			}
		}
		
		// ����� �� ��� �� �ջ�
		for(int i = 0; i < digit_factorials.length; i++) {
			System.out.println("value : " + digit_factorials[i]);
			total_sum += digit_factorials[i];
		}
		
		System.out.println("-----------------------------");
		System.out.println("digit factorials�� �� �� : " + total_sum);
		System.out.println("-----------------------------");
		
		// ���� �ð�
		long end_time = System.nanoTime();
		// ���� �ð�
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("���� �ð� : " + operating_time);
	}
}
