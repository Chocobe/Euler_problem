package ex012_highly_divisible_triangular_number_2;

public class Ex12_calc {
	
	/***
	 * 삼각수 구하기
	 * 
	 * 매개변수 : 
	 * 		int _size : 삼각수의 최대 인수값
	 * 
	 * 반환값 :
	 * 		삼각수
	 */
	public static int triangular_num(int _size) {
		
		// 삼각수 == (최대인수값 * (최대인수값 + 1)) / 2 
		return (_size + 1) * _size / 2;
	}
	
	/***
	 * 매개변수의 구성 인수 갯수 구하기
	 * 
	 * 매개변수 :
	 * 		int _target : 인수 갯수를 구할 타겟
	 * 
	 * 반환값 :
	 * 		인수 갯수
	 */
	public static int factor_cnt(int _target) {
		
		int factor_cnt = 1;								// 인수 갯수(반환할 값)
		int temp_target = _target;						// 입력받은 값의 임시저장
		int loop_limit = (int)Math.sqrt(_target) + 2;	// 최대 루프 횟수 (제곱근값 + 2)
		int exponent = 0;								// 지수
		
		for(int i = 2; i <= loop_limit; i++) {
			
			exponent = 0;
			
			// 루프값(i) 에 대한 지수가 얼마인지 도출하는 부분
			while(temp_target % i == 0) {	// 루프값이 타겟(임시)의 약수일 경우에만 수행
				exponent++;					// 현재 루프값(i)에 대한 지수 1개 증가
				temp_target /= i;			// 연산의 중복 제거
			}
			
			//수정 필요
			// if(exponent 가 0일 때, exponent = 1;)
			// else(
			if(exponent != 0) {
				factor_cnt *= (exponent + 1); 	// "지수"를 이용한 "인수 구하기 공식"
												// a^m * b^n 의 인수 갯수는... (m + 1) * (n + 1) 이다.
			}
		}		
		
		return factor_cnt;
	}	
}
