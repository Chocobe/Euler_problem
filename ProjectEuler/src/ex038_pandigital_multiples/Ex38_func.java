package ex038_pandigital_multiples;

public class Ex38_func {
	
	// pandigital number class
	public class digit_9_number {
		int target_number;		// 대상값
		int multiplier;			// 승수 
		String concat_number;	// 연결된 pandigital number
		
		// 생성자
		public digit_9_number(int _target, int _multiplier, String _concat) {
			this.target_number = _target;
			this.multiplier = _multiplier;
			this.concat_number = _concat;
		}
	}
	
	
	// pandigital numbers 배열
	public digit_9_number[] pandigital_numbers;
	
	
	/***
	 * 생성자
	 * 
	 * 		생성함으로 pandigital numbers를 갖는 객체가 만들어 진다.
	 */
	public Ex38_func() {
		this.pandigital_numbers = new digit_9_number[0];
		
		digit_9_number cur_obj;		// 현재 루프의 객체값
		int target = 0;				// 대상값
		
		// 9자리가 넘지 않는 값인 10000까지 반복
		while(target < 10000) {
			// 대상값 증가
			target++;
			// 9자리 생성
			cur_obj = make_9_digit(target);
			
			// 9자리가 아니면, 다음 루프
			if(cur_obj == null) {
				continue;
				
			// 9자리일 경우,
			} else {
				// pandigital number 검사
				if(check_pandigital(cur_obj)) {
					// pandigital number일 경우, 저장
					add_idx(cur_obj);
				}
			}
		}
	}
	
	
	/***
	 * digit_9_number[]의 인덱스 추가하기
	 * 
	 * 매개변수 :
	 * 		digit_9_number _obj : 추가할 객체
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	private void add_idx(digit_9_number _obj) {
		int len = this.pandigital_numbers.length;
		digit_9_number[] result_arr = new digit_9_number[len + 1];
		
		for(int i = 0; i < len; i++) {
			result_arr[i] = this.pandigital_numbers[i];
		}
		result_arr[len] = _obj;
		
		this.pandigital_numbers = result_arr;
		
		return;
	}
	
	
	/***
	 * 9자리 수 만들기
	 * 
	 * 매개변수 :
	 * 		int _target : 대상값
	 * 
	 * 반환값 :
	 * 		9자리일 경우 : digit_9_number형 값
	 * 		그 이외 : null
	 * 
	 * TESTed
	 */
	public digit_9_number make_9_digit(int _target) {
		String str_concat = "";		// 연결된 문자열
		String str_cur_val = "";	// 현재 값의 문자열
		int multiplier = 0;			// 승수
		int cur_product = 0;		// 현재 곱의 값
		
		// 연결된 문자열의 길이를 9로 만드는 부분
		while(str_concat.length() < 9) {
			// 승수 증가
			multiplier++;
			// 현재 곱 연산
			cur_product = _target * multiplier;
			
			// 현재 곱의 문자열
			str_cur_val = String.valueOf(cur_product);
			// 연결된 문자열 갱신
			str_concat = str_concat.concat(str_cur_val);
		}
		
		// 문자열 길이 == 9 라면, digit_9_number객체 반환
		if(str_concat.length() == 9) {
			digit_9_number result_obj = new digit_9_number(_target, multiplier, str_concat);
		
			return result_obj;
			
		// 그 외, null 반환
		} else {
			return null;
		}
	}
	
	
	/***
	 * pandigital number 검사
	 * 
	 * 매개변수 :
	 * 		digit_9_number _target : 9자리 숫자 객체
	 * 
	 * 반환값 :
	 * 		boolean - true	: pandigital number o
	 * 				- false	: pandigital number x
	 * 
	 * TESTed
	 */
	public boolean check_pandigital(digit_9_number _target) {

		String concat_str = _target.concat_number;		// 검사 문자열
		String cur_string = "";
		for(int i = 1; i < 10; i++) {
			
			// 루프값이 검색되지 않는다면, false
			cur_string = String.valueOf(i);
			if(concat_str.indexOf(cur_string) == -1) {
				return false;
			}
		}
		
		// 모두 검색 되었다면, true
		return true;
	}
}