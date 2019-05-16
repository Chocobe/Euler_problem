package ex034_digit_factorials;

public class Ex34_func {

	/***
	 * 펙토리얼 연산
	 * 
	 * 매개변수 :
	 * 		int _val : 대상값
	 * 
	 * 반환값 :
	 * 		int형의 대상값 펙토리얼
	 * 
	 * TESTed
	 */
	private static int factorial(int _val) {
		int factorial = 1;
		
		for(int i = 1; i <= _val; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	
	/***
	 * 각 숫자의 펙토리얼의 합
	 * 
	 * 매개변수 :
	 * 		int _val : 대상값
	 * 
	 * 반환값 :
	 * 		int형 각 숫자들의 펙토리얼 합
	 * 
	 * TESTed
	 */
	public static int digit_factorial(int _val) {
		// 대상값의 문자열형
		String str_val = String.valueOf(_val);
		int total_sum = 0;		// 숫자들의 펙토리얼 총 합
		int cur_digit = 0;		// 현제 숫자
		
		
		
		for(int i = 0; i < str_val.length(); i++) {
			// 현재 숫자의 펙토리얼 계산
			cur_digit = Integer.parseInt(str_val.substring(i, i + 1));
			// 펙토리얼값 누적
			total_sum += factorial(cur_digit);
		}
		
		return total_sum;
	}
	
	
	/***
	 * 배열에 인덱스 추가
	 * 
	 * 매개변수 :
	 * 		int _val : 대상값
	 * 		int[] _arr : 대상배열
	 * 
	 * 반환값 :
	 * 		대상값이 추가된 int[]형
	 * 
	 * TESTed
	 */
	public static int[] add_idx(int _val, int[] _arr) {
		int len = _arr.length;				// 입력받은 배열의 길이
		int[] temp_arr = new int[len + 1];	// 임시배열
		
		// 입력받은 배열을 그대로 저장
		for(int i = 0; i < len; i++) {
			temp_arr[i] = _arr[i];
		}
		// 마지막 인덱스에 대상값 추가
		temp_arr[len] = _val;
		
		return temp_arr;
	}
	
	
	/***
	 * 루프 한계값 연산
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		int형 한계값
	 * 
	 * TESTed
	 */
	public static int loop_limit() {
		int max_digit = 0;		// 최대값
		int sum_factorial = 0;	// 각 숫자들의 펙토리얼 값의 합
		String str_digit = "9";	// 최대값 연산을 위한 단위 문자열
		
		while(true) {
			max_digit = Integer.valueOf(str_digit);		// 단위 문자열을 int형으로
			sum_factorial = digit_factorial(max_digit);	// 펙토리얼의 합 연산
			
			// 단위값이 펙토리얼의 합 보다 크다면, 종료
			if(max_digit > sum_factorial) {
				break;
			}
			
			// 단위값 증가
			str_digit = str_digit.concat("9");
		}
		
		return max_digit;
	}
}