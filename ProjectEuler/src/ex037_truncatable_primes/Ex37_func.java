package ex037_truncatable_primes;

public class Ex37_func {
	
	int[] prime_table;			// 소수 테이블
	int[] truncatable_prime;	// 절단 가능 소수 배열 (요구값)
	
	
	/***
	 * 생성자
	 * 
	 * 매개변수 :
	 * 		int _cnt : 절단 가능 소수의 개수
	 */
	public Ex37_func(int _cnt) {
		this.prime_table = new int[0];
		this.truncatable_prime = new int[0];
		
		// 대상값은 10 이상
		int target = 9;
		
		while(this.truncatable_prime.length < _cnt) {
			// 대상값++
			target++;
			
			// 좌,우 절단 가능 소수 검사
			if(left_truncatable_prime(target) && right_truncatable_prime(target)) {
				// 절단 가능 소수 배열 갱신
				add_idx(target, "TRUNCATABLE");
			}
		}
	}

	
	/***
	 * 소수 검사
	 * 
	 * 매개변수 :
	 * 		int _target : 대상값
	 * 		int[] _table : 참조 테이블
	 * 
	 * 반환값 :
	 * 		boolean - true	: 소수 o
	 * 				- false	: 소수 x
	 * 
	 * TESTed
	 */
	private boolean check_prime(int _target) {
		// 대상값이 0, 1일 경우, 예외처리 - 소수 x)
		if(_target == 0 || _target == 1) {
			return false;
		}
		
		// 소수 테이블 검사 (소수 테이블에 값이 있을 경우, 소수 o)
		for(int i = 0; i < this.prime_table.length; i++) {
			if(_target == this.prime_table[i]) {
				return true;
			}
		}
		
		// 소수 테이블에 대상값이 없을 경우,
		// 검사 한계값
		int loop_limit = (int)Math.sqrt(_target);
		
		// 대상값의 약수가 있다면, 소수 x
		for(int i = 2; i <= loop_limit; i++) {
			if(_target % i == 0) {
				return false;
			}
		}
		
		// 소수 테이블 갱신
		add_idx(_target, "PRIME");
		
		return true;
	}
	
	
	/***
	 * 배열 인덱스 추가
	 * 
	 * 매개변수 :
	 * 		int _val : 대상값
	 * 
	 * 반환값 :
	 * 		대상값이 추가된 int[]배열
	 * 
	 * TESTed
	 */
	private void add_idx(int _val, String _mode) {
		int[] origin_arr;
		int len;
		
		// 모드 적용
		if(_mode == "PRIME") {
			origin_arr = this.prime_table;
			len = this.prime_table.length;
		
		} else if(_mode == "TRUNCATABLE") {
			origin_arr = this.truncatable_prime;
			len = this.truncatable_prime.length;
		
		} else {
			return;
		}

		// 결과 배열 생성
		int[] added_table = new int[len + 1];
		
		// 기존 데이터 옮기기
		for(int i = 0; i < len; i++) {
			added_table[i] = origin_arr[i];
		}
		// 입력 데이터 추가
		added_table[len] = _val;
		
		// 갱신 (소수 테이블)
		if(_mode == "PRIME") {
			this.prime_table = added_table;
		}
		
		// 갱신 (절단 가능 소수 테이블)
		if(_mode == "TRUNCATABLE") {
			this.truncatable_prime = added_table;
		}
	}
	
	
	/***
	 * 좌->우 숫자 절단
	 * 
	 * 매개변수 :
	 * 		int _target : 대상값
	 * 
	 * 반환값 :
	 * 		절단된 int형 값
	 * 		-1 : 대상값이 0 이하인 경우,
	 * 
	 * TESTed
	 */
	private static int left_remove_digit(int _target) {
		if(_target < 10) {
			return -1;
		}
		
		String str_target = String.valueOf(_target);
		str_target = str_target.substring(1, str_target.length());
		
		int fixed_target = Integer.parseInt(str_target);
		
		return fixed_target;
	}
	
	
	/***
	 * 우->좌 숫자 절단
	 * 
	 * 매개변수 :
	 * 		int _target : 대상값
	 * 
	 * 반환값 :
	 * 		절단된 int형 값
	 * 		-1 : 대상값이 0 이하인 경우,
	 * 
	 * TESTed
	 */
	private static int right_remove_digit(int _target) {
		if(_target < 10) {
			return -1;
		}
		
		String str_target = String.valueOf(_target);
		str_target = str_target.substring(0, (str_target.length() - 1));
		
		int fixed_target = Integer.parseInt(str_target);
		
		return fixed_target;
	}
	
	
	/***
	 * 좌->우 숫자 절단 & 소수 검사 & 소수 테이블 갱신 루프
	 * 
	 * 매개변수 :
	 * 		int _target : 검사 대상
	 * 
	 * 반환값 :
	 * 		boolean - true	: 절단 가능 소수 o
	 * 				- false : 절단 가능 소수 x
	 * 
	 * TESTed
	 */
	public boolean left_truncatable_prime(int _target) {
		int fixed_target = _target;		// 좌측 숫자 절단 결과값 (대상값)
		
		while(fixed_target != -1) {
			// 소수가 아닌 경우,
			if(!check_prime(fixed_target)) {
				return false;
			}
			
			// 좌측 숫자 절단
			fixed_target = left_remove_digit(fixed_target);
		}
		
		return true;
	}
	
	
	/***
	 * 우->좌 숫자 절단 & 소수 검사 & 소수 테이블 갱신 루프
	 * 
	 * 매개변수 :
	 * 		int _target : 검사 대상
	 * 
	 * 반환값 :
	 * 		boolean - true	: 절단 가능 소수 o
	 * 				- false	: 절단 가능 소수 x
	 * 
	 * TESTed
	 */
	public boolean right_truncatable_prime(int _target) {
		int fixed_target = _target;		// 우측 숫자 절단 결과값 (대상값)
		
		while(fixed_target != -1) {
			// 소수가 아닌 경우,
			if(!check_prime(fixed_target)) {
				return false;
			}
			
			// 우측 숫자 절단
			fixed_target = right_remove_digit(fixed_target);
		}

		return true;
	}
}