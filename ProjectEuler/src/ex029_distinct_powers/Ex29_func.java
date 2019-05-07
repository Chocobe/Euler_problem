package ex029_distinct_powers;

public class Ex29_func {
	private int min_base;		// 밑수 최소값
	private int max_base;		// 밑수 최대값
	private int min_exponent;	// 지수 최소값
	private int max_exponent;	// 지수 최대값
	
	private int distinct_num;	// 중복을 제거한 개수
	
	public Ex29_func(int _min_base, int _max_base, int _min_exp, int _max_exp) {
		this.min_base = _min_base;
		this.max_base = _max_base;
		this.min_exponent = _min_exp;
		this.max_exponent = _max_exp;
		
		// 중복값 배제
		int total_cnt = (max_base - min_base + 1) * (max_exponent - min_exponent + 1);
		int duplication = 0;
		
		for(int i = min_base; i <= max_base; i++) {
			for(int j = min_exponent; j <= max_exponent; j++) {
				if(check_duplication(i, j)) {
					duplication++;
				}
			}
		}
		
		this.distinct_num = total_cnt - duplication;
	}
	
	/***
	 * 인스턴스의 정보 출력 메서드
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void get_inform() {
		System.out.print("    (base) min : " + this.min_base + ", ");
		System.out.println("max : " + this.max_base);
		System.out.print("(exponent) min : " + this.min_exponent + ", ");
		System.out.println("max : " + this.max_exponent);
		System.out.println("Distinct powers counter : " + this.distinct_num);
	}
	
	
	/***
	 * 중복값 검사
	 * 
	 * 매개변수 :
	 * 		int _base		: 밑값
	 * 		int _exponent	: 지수값
	 * 
	 * 반환값 :
	 * 		true	: 중복 있음
	 * 		false	: 중복 없음
	 * 
	 * TESTed
	 */
	private boolean check_duplication(int _base, int _exponent) {
		boolean overlap = false;	// 중복 존재 여부 (기본값 : 중복 없음)
		
		int min_power = Ex29_func.min_power(_base);
		if(min_power != -1) {
			int cur_power = min_power;
			int min_power_exp = Ex29_func.anti_log(cur_power, _base) * _exponent;
			
			if(min_power_exp <= this.max_exponent) {
				overlap = true;
				
			} else {
				int step = 1;		// 최소 거듭제곱근의 지수값
				int step_exp = 0;	// 현재 스텝상으로 입력값을 표현할 시, 지수값
				
				while(true) {
					// 다음 스텝으로
					cur_power *= min_power;
					step++;
					
					// 현재 루프의 밑값이 입력값의 밑값 이상이므로, 루프 종료 (중복 발견 못함)
					if(cur_power >= _base) {
						break;
					}
					
					// 현재 스텝상에서 입력값의 지수값을 표현 (소수점 발생 -> 현재 스텝의 오차발생 부분, 즉 거듭제곱근 판별)
					step_exp = min_power_exp / step;
					
					// 현재 스텝의 값과 입력값이 같다면(현재 스텝이 입력값의 거듭제곱근임을 검사),
					if(Math.pow(_base, _exponent) == Math.pow(cur_power, step_exp)) {
						// 현재 스텝의 지수값이 범위 이내라면,
						if(step_exp <= this.max_exponent) {
							overlap = true;
						}
					}
				}
			}
		}
		
		return overlap;
	}
	
	
	/***
	 * base를 설정할 수 있는 log 메서드
	 * 
	 * 매개변수 :
	 * 		int _base : 밑값
	 * 		int _anti : 진수값
	 * 
	 * 반환값 :
	 * 		_base 인 _anti의 로그값 (_base의 지수값)
	 * 
	 * TESTed
	 */
	private static int anti_log(int _base, int _anti) {
		// 로그 밑 변환 공식
		double anti_log_val = Math.log(_anti) / Math.log(_base);
		return (int)anti_log_val;
	}
	
	
	/***
	 * 최소 거듭제곱근 구하기
	 * 
	 * 매개변수 :
	 * 		int _val : 대상 값
	 * 
	 * 반환값 :
	 * 		-1 		: 거듭제곱근 없음
	 * 		양의 정수	: 거듭제곱근
	 * 
	 * TESTed
	 */
	private static int min_power(int _val) {
		int loop_limit = _val;
		int divisor = 1;
		
		for(int i = 2; i <= loop_limit; i++) {
			// 제수 초기화
			divisor = 1;
			
			if(_val == i) {
				return -1;
			}
			
			if(_val % i == 0) {
				
				while(true) {
					divisor *= i;
					
					// 밑수 보다 작은 경우, 약수를 한번 더 곱한다.
					if(divisor < _val) {
						continue;
						
					// 밑수 보다 큰 경우, 현재 약수에 대한 루프 종료
					} else if(divisor > _val) {
						break;
					
					// 밑수와 같을 경우, 최소 제곱근으로 반환
					} else {
						return i;
					}
				}
				
				// 루프 한계값 갱신
				loop_limit = _val / i;
			}
		}
		
		// 모든 약수가 제곱근이 아닐 경우, 제곱근 없음(-1) 반환
		return -1;
	}
}




































