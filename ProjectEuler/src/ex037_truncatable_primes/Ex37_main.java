package ex037_truncatable_primes;

public class Ex37_main {
	public static void main(String[] args) {
		
		// ���� �ð�
		long begin_time = System.nanoTime();
		
		int limit_cnt = 11;		// ���� ����
		int total_sum = 0;		// �� ��
		
		// ��ü ����
		Ex37_func truncatable_obj = new Ex37_func(limit_cnt);

		// ���� ���� �Ҽ� ��ü ���
		for(int i = 0; i < truncatable_obj.truncatable_prime.length; i++) {
			System.out.println("truncatable table : " + truncatable_obj.truncatable_prime[i]);
		}
		
		// ���� ���� �Ҽ��� �� ��
		for(int i = 0; i < truncatable_obj.truncatable_prime.length; i++) {
			total_sum += truncatable_obj.truncatable_prime[i];
		}
		System.out.println("--------------------------");
		System.out.println("���� ���� �Ҽ��� �� �� : " + total_sum);
		
		// ���� �ð�
		long end_time = System.nanoTime();
		double operating_time = (double)(end_time - begin_time) / Math.pow(10, 9);
		System.out.println("���� �ð� : " + operating_time);
	}
}
