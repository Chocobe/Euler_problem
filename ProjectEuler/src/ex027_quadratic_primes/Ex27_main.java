package ex027_quadratic_primes;

public class Ex27_main {
	public static void main(String[] args) {
		
		// 시작 시간
		long begin_time = System.nanoTime();
		
		Ex27_euler max_consecutive_prime = new Ex27_euler();
		Ex27_euler cur_consecutive_prime;
		
		System.out.println("a : " + max_consecutive_prime.coefficient_a);
		System.out.println("b : " + max_consecutive_prime.coefficient_b);
		System.out.println("prime counter : " + max_consecutive_prime.prime_cnt);
		System.out.println("a * b : " + max_consecutive_prime.mul_a_and_b);

		for(int i = -999; i < 999; i++) {
			for(int j = -1000; j <= 1000; j++) {
				cur_consecutive_prime = new Ex27_euler(i, j);
				
				if(max_consecutive_prime.prime_cnt < cur_consecutive_prime.prime_cnt) {
					max_consecutive_prime = cur_consecutive_prime;

				}
			}
		}
		
		System.out.println("---result---");
		System.out.print("a : " + max_consecutive_prime.coefficient_a);
		System.out.print(", b : " + max_consecutive_prime.coefficient_b);
		System.out.print(", prime counter : " + max_consecutive_prime.prime_cnt);
		System.out.println(", a * b = " + max_consecutive_prime.mul_a_and_b);
		
		// 종료 시간
		long end_time = System.nanoTime();
		double process_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("수행시간 : " + process_time);
	}
}
