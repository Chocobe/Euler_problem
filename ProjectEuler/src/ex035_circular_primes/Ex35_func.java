package ex035_circular_primes;

public class Ex35_func {
	
	/***
	 * 소수 테이블 검사하기
	 * 
	 * 매개변수 :
	 * 		int _target		: 검사 대상값
	 * 		int[] _table	: 비교할 참조 테이블 배열
	 * 
	 * 반환값 :
	 * 		boolean형	- true	: 대상값이 테이블이 있음
	 * 					- false	: 대상값이 테이블에 없음
	 * 
	 * TESTed
	 */
	private static boolean check_duplication(int _target, int[] _table) {
		// 참조 테이블 배열의 길이
		int len = _table.length;
		
		// 비교
		for(int i = 0; i < len; i++) {
			if(_target == _table[i]) { return true; }
		}
		
		return false;
	}
	
	
	/***
	 * 소수 판별
	 * 
	 * 매개변수 :
	 * 		int _target : 대상값
	 * 
	 * 반환값 :
	 * 		boolean형	- true	: 소수o
	 * 					- false	: 소수x
	 * 
	 * TESTed
	 */
	private static boolean check_prime(int _target) {
		// 검사를 위한 루프 한계값 (제곱근)
		int loop_limit = (int)Math.sqrt(_target);
		
		// 대상값이 0, 1 일 경우, 예외처리 (소수x)
		if(_target == 0 || _target == 1) { return false; }
		
		for(int i = 2; i <= loop_limit; i++) {
			if(_target % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	/***
	 * 회전소수 판별하기
	 * 
	 * 매개변수 :
	 * 		int _target	: 대상값
	 * 		int _table	: 참조 테이블
	 * 
	 * 반환값 :
	 * 		boolean형	- true	: 회전소수o
	 * 					- false	: 회전소수x
	 * 
	 * TESTed
	 */
	public static boolean check_circular_prime(int _target, int[] _table) {
		// 참조 테이블상 중복 검사
		if(check_duplication(_target, _table)) { return false; }
		
		int int_target = _target;						// 검사대상
		String str_target = String.valueOf(_target);	// 검사대상의 문자열형
		String first_str = "";							// 첫 번째 문자
		int loop_limit = str_target.length();			// 대상의 문자열 길이(검사 횟수)
		
		for(int i = 0; i < loop_limit; i++) {
			if(!check_prime(int_target)) { return false; }
			
			// 첫번째 숫자 추출
			first_str = str_target.substring(0, 1);
			// 첫번쨰 숫자 제거
			str_target = str_target.replaceFirst(first_str, "");
			// 첫번째 숫자를 가장 뒤로
			str_target = str_target.concat(first_str);
			// 변경된 문자열 -> 정수값으로 형변환
			int_target = Integer.parseInt(str_target);
		}
		
		return true;
	}
	
	
	/***
	 * 배열 추가하기
	 * 
	 * 매개변수 :
	 * 		int _target		: 대상값
	 * 		int[] _table	: 저장할 배열
	 * 
	 * 반환값 :
	 * 		대상값을 추가한 int[]
	 * 
	 * TESTed
	 */
	public static int[] add_idx(int _target, int[] _table) {
		// 입력받은 배열의 길이
		int len = _table.length;
		// 결과 배열
		int[] result_arr = new int[len + 1];
		
		// 기존값 복사
		for(int i = 0; i < len; i++) {
			result_arr[i] = _table[i];
		}
		// 마지막 인덱스에 대상값 저장
		result_arr[len] = _target;
		
		return result_arr;
	}
}