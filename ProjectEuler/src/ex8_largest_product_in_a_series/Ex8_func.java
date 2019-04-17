package ex8_largest_product_in_a_series;

/***
 * 문자열에 대한 정적 메서드 제공 클래스
 */
public class Ex8_func {
	
	/***
	 * 메서드 : 입력받은 문자열의 각 항을 정수형으로 곱한 값 도출
	 * 
	 * < TESTed >
	 */
	public static long partial_mul(String _target) {
		
		int target_len = _target.length();	// 입력받은 문자열의 길이
		String temp_string = "";			// 도출한 값의 문자열형
		int temp_digit = 0;					// 도출한 값의 정수형
		
		long result_val = 1L;				// 결과값
		
		for(int i = 0; i < target_len; i++) {
			temp_string = _target.substring(i, i + 1);
			temp_digit = Integer.parseInt(temp_string);
			
			result_val *= temp_digit;
		}
		
		return result_val;
	}
}






















