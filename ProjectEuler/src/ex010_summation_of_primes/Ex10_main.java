package ex010_summation_of_primes;

public class Ex10_main {
	public static void main(String[] args) {
		
		int max_num = 2000000;		// 검사할 최대 값
		int cur_target = 1;			// 현재 검사할 값
		long summation = 0L;		// 총합
		
		boolean prime_check = false;	// 소수 판별
		
		for(int i = 1; i < (max_num - 1); i++) {
			// 부분 초기화
			prime_check = false;
			cur_target++;			
			
			prime_check = Ex10_clac.check_prime(cur_target);
			
			if(prime_check) {
				summation += cur_target;
			}
		}
		
		System.out.println(max_num + "이내의 소수의 총 합 : " + summation);
		
	}
}
