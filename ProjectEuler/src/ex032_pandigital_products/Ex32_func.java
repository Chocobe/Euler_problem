package ex032_pandigital_products;

public class Ex32_func {

	/***
	 * 승수, 피승수, 결과값을 String형으로 합했을 때, String의 길이 == 9 비교
	 * 
	 * 매개변수 :
	 * 		int _lhs	: 좌측항
	 * 		int _rhs	: 우측항
	 * 		int _result	: 결과값
	 * 
	 * 반환값 :
	 * 		String형으로 _lhs + _rhs + _result
	 * 		(반환값이 ""일 경우는 String의 길이가 9가 아닐 경우) 
	 * 
	 * TESTed
	 */
	public static String len_check(int _lhs, int _rhs, int _result) {
		
		String lhs = String.valueOf(_lhs);			// 좌측값 문자열
		String rhs = String.valueOf(_rhs);			// 우측값 문자열
		String result = String.valueOf(_result);	// 곱의 결과값 문자열
		
		String united_string = lhs + rhs + result;	// 각 문자열의 합
		
		// 문자열의 합의 길이가 == 9,
		if(united_string.length() == 9) {
			// 현재 문자열 반환
			return united_string;
			
		// 문자열의 합의 길이가 != 9
		} else {
			// 공백 반환
			return "";
		}
	}
	
	
	/***
	 * 입력 문자열에 1~9까지의 값 유무 확인
	 * 
	 * 매개변수 :
	 * 		String _united_string	: 통합된 문자열
	 * 
	 * 반환값 :
	 * 		true	: 1 ~ 9까지 숫자가 다 있음
	 * 		false	: 조건 x
	 * 
	 * TESTed
	 */
	public static boolean check_pandigital(String _united_string) {
		// 비교할 값의 문자열 (루프값)
		String cur_loop = "";
		
		for(int i = 1; i < 10; i++) {			
			cur_loop = String.valueOf(i);
			// 루프값이 없으면,
			if(_united_string.indexOf(cur_loop) == -1) {
				// false 반환
				return false;
			}
		}
		
		// 루프값이 모두 존재한다면,
		return true;		
	}
	
	
	/***
	 * 입력값이 입력배열에 없을 경우, 저장
	 * 
	 * 매개변수 :
	 * 		int _val	: 입력값
	 * 		int[] _repo	: 입력배열
	 * 
	 * 반환값 :
	 * 		int[] _repo	: 결과 배열
	 */
	public static int[] check_duplication(int _val, int[] _repo) {
		int len = _repo.length;
		int[] result_arr;
		
		// 중복일 경우, 입력배열 그대로 반환
		for(int i = 0; i < len; i++) {
			if(_val == _repo[i]) {
				return _repo;
			}
		}
		
		result_arr = new int[len + 1];
		for(int i = 0; i < len; i++) {
			result_arr[i] = _repo[i];
		}
		result_arr[len] = _val;
		
		return result_arr;
	}
}