package ex027_quadratic_primes;

public class Ex27_euler {
	
	int coefficient_a;			// 계수 a
	int coefficient_b;			// 계수 b
	int mul_a_and_b;			// a * b
	int prime_cnt;				// 연속적인 소수 개수
	
	public Ex27_euler() {
		// 초기화
		this.coefficient_a = 0;
		this.coefficient_b = 0;
		this.prime_cnt = 0;
	}
	
	public Ex27_euler(int _a, int _b) {
		// 초기화
		this.coefficient_a = _a;
		this.coefficient_b = _b;
		this.mul_a_and_b = _a * _b;
		
		consecutive_prime_cnt(_a, _b);
	}
	
	
	/***
	 * 소수 판별 메서드
	 * 
	 * 매개변수 :
	 * 		int _input : 입력값
	 * 
	 * 반환값 :
	 * 		boolean형	- true  : 소수 o
	 * 					- false : 소수 x
	 */
	public boolean check_prime(int _input) {
		
		boolean is_prime = false;	// 소수 판별
		int loop_limit = _input;	// 루프 한계값
		
		// 입력값이 "0 또는 1, 음수"일 경우, 예외처리 (소수 x)
		if(_input == 0 || _input == 1 || _input < 0) {
			return is_prime;
		}
		
		// 입력값이 2일 경우, 예외처리 (소수 o)
		if(_input == 2) {
			is_prime = true;
			return is_prime;
		}
		
		// 그 외의 입력값은 연산
		for(int i = 2; i <= loop_limit; i++) {
			// 약수가 존재한다면,
			if(_input % i == 0) {
				return is_prime;
			}
			
			// 루프 한계값 갱신
			loop_limit = _input / i;
		}
		
		// 루프종료까지 약수가 없다면, 소수 o
		is_prime = true;
		
		return is_prime;
	}
	
	/***
	 * 연속되는 소수개수 구하기
	 * 
	 * 매개변수 :
	 * 		int _a : 계수 a
	 * 		int _b : 계수 b
	 * 
	 * 반환값 :
	 * 		N/A
	 */
	public void consecutive_prime_cnt(int _a, int _b) {
		
		int formula = 0;
		int cur_num = 0;
		boolean is_prime = false;
		
		while(true) {
			formula = (int)Math.pow(cur_num, 2) + (cur_num * _a) + _b;
			is_prime = check_prime(formula);
			
			if(is_prime) {
				this.prime_cnt++;
				
			} else {
				return;
				
			}
			
			cur_num++;
		}
	}
}
