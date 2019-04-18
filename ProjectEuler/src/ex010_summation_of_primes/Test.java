package ex010_summation_of_primes;

public class Test {
	public static void main(String[] args) {
		
		int limit = 20;
		int prime_cnt = 0;
		
		int sqrt_target = 0;
		
		for(int i = 2; i < limit; i++) {
			sqrt_target = (int)Math.sqrt(i); 
			prime_cnt = 0;
			
			for(int j = 1; j <= sqrt_target; j++) {
				if(i % j == 0) {
					prime_cnt++;					
				}
			}
			
			if(prime_cnt < 2) {
				System.out.println(i);
			}
		}
	}
}
