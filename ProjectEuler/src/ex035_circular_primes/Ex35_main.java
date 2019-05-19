package ex035_circular_primes;

public class Ex35_main {
	public static void main(String[] args) {
		
		// 시작시간
		long begin_time = System.nanoTime();
		
		int[] circular_prime = new int[0];
		int limit = 1000000;
		int circular_prime_cnt = 0;
		
		for(int i = 0; i <= limit; i++) {
			if(Ex35_func.check_circular_prime(i, circular_prime)) {
				circular_prime = Ex35_func.add_idx(i, circular_prime);
			}
		}
		
		// 출력
		for(int i = 0; i < circular_prime.length; i++) {
			System.out.println(circular_prime[i]);
			circular_prime_cnt++;
		}
		System.out.println("------------------");
		System.out.println("회전소수의 총 개수 : " + circular_prime_cnt);
		
		// 종료 시간
		long end_time = System.nanoTime();
		// 수행 시간
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println("수행 시간 : " + operating_time);
	}
}
