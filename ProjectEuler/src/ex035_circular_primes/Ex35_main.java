package ex035_circular_primes;

public class Ex35_main {
	public static void main(String[] args) {
		
		// ���۽ð�
		long begin_time = System.nanoTime();
		
		int[] circular_prime = new int[0];
		int limit = 1000000;
		int circular_prime_cnt = 0;
		
		for(int i = 0; i <= limit; i++) {
			if(Ex35_func.check_circular_prime(i, circular_prime)) {
				circular_prime = Ex35_func.add_idx(i, circular_prime);
			}
		}
		
		// ���
		for(int i = 0; i < circular_prime.length; i++) {
			System.out.println(circular_prime[i]);
			circular_prime_cnt++;
		}
		System.out.println("------------------");
		System.out.println("ȸ���Ҽ��� �� ���� : " + circular_prime_cnt);
		
		// ���� �ð�
		long end_time = System.nanoTime();
		// ���� �ð�
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println("���� �ð� : " + operating_time);
	}
}
