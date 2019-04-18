package ex010_summation_of_primes;

public class Ex10_clac {
	
	/***
	 * 입력받은 값의 소수를 판단하는 메서드
	 * 
	 * < TEST complete >
	 */
	public static boolean check_prime(int _target) {
		
		// 검사를 위한 루프의 최대 횟수
		// 루트값의 정수부 이하까지 검사로 "소수" 판별 가능
		// (루트값 초과의 경우에는, 이전에 검사했던 값과 중복되는 부분이기 때문)
		int loop_limit = (int)Math.sqrt(_target);
		
		int prime_cnt = 0;				// 소수 갯수 카운터
		boolean checking = false;		// 소수 판단값 (반환값)
		
		// 1로 나누었을 때 까지 포함
		for(int i = 1; i <= loop_limit; i++) {
			if(_target % i == 0) {
				prime_cnt++;
			}
			
			if(prime_cnt >= 2) {	// 1이회의 약수가 있다면, 소수가 아니다.
				return checking;
			}
		}
		
		// 루프가 끝날떄 까지, 약수의 갯수가 1개 라면, 이 숫자는 소수다.
		
		checking = true;
		
		return checking;
	}
}
