package ex037_truncatable_primes;

public class Ex37_main {
	public static void main(String[] args) {
		
		// 시작 시간
		long begin_time = System.nanoTime();
		
		int limit_cnt = 11;		// 구할 개수
		int total_sum = 0;		// 총 합
		
		// 객체 생성
		Ex37_func truncatable_obj = new Ex37_func(limit_cnt);

		// 절단 가능 소수 전체 출력
		for(int i = 0; i < truncatable_obj.truncatable_prime.length; i++) {
			System.out.println("truncatable table : " + truncatable_obj.truncatable_prime[i]);
		}
		
		// 절단 가능 소수의 총 합
		for(int i = 0; i < truncatable_obj.truncatable_prime.length; i++) {
			total_sum += truncatable_obj.truncatable_prime[i];
		}
		System.out.println("--------------------------");
		System.out.println("절단 가능 소수의 총 합 : " + total_sum);
		
		// 종료 시간
		long end_time = System.nanoTime();
		double operating_time = (double)(end_time - begin_time) / Math.pow(10, 9);
		System.out.println("수행 시간 : " + operating_time);
	}
}
