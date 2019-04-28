package ex021_amicable_numbers;

public class Ex21_func {
	
	/***
	 * 본인을 제외한 약수의 합 구하기
	 * 
	 * 매개변수 :
	 * 		int _val : 구하고자 하는 대상
	 * 
	 * 반환값 :
	 * 		int형인 본인을 제외한 약수의 합
	 * 
	 *  TEST Completion.
	 */
	public static int sum_of_divisor(int _val) {
		int sum = 0;				// 총 합
		int cur_quotient = 0;		// 현재 몫
		int min_quotient = _val;	// 몫의 최소값
		
		// 가장 작은 몫보다 작을떄 까지 루프
		for(int i = 1; i < min_quotient; i++) {
			// 약수일 경우,
			if(_val % i == 0) {
				// 현재 몫
				cur_quotient = _val / i;
				// 현재 몫과 제수를 더한다.
				sum = sum + cur_quotient + i;
				// 최소 몫 갱신
				min_quotient = cur_quotient;
			}
		}
		
		if(sum != 0) {
			sum -= _val;
		}
		
		return sum;
	}
	
	/***
	 * 배열에 해당 값이 있는지 검사
	 * 
	 * 매개변수 :
	 * 		int[] _arr	: 검사할 배열
	 * 		int _val	: 해당 값
	 * 
	 * 반환값 :
	 * 		boolean - 있을 경우 : true
	 * 				- 없을 경우 : false
	 * 
	 * TEST Completion.
	 */
	public static boolean check_overlap(int[] _arr, int _val) {
		boolean check = false;		// 비교 결과
		int arr_len = _arr.length;	// 배열의 길이
		
		for(int i = 0; i < arr_len; i++) {
			// 같은 값이 있다면,
			if(_arr[i] == _val) {
				check = true;
			}
		}
		
		return check;
	}
	
	/***
	 * 배열에 index 추가하여, 입력값 저장
	 * 
	 * 매개변수 :
	 * 		int[] _arr	: 대상 배열
	 * 		int _val_1	: 저장할 값 1
	 * 		int _val_2	: 저장할 값 2
	 * 
	 * 반환값 :
	 * 		없음
	 */
	public static int[] add_idx(int[] _arr, int _val_1) {
		// 매개변수 배열의 길이
		int arr_len = _arr.length;
		// 저장할 배열 생성
		int[] arr = new int[arr_len + 1];
		
		// 매개변수의 배열 복사
		for(int i = 0; i < arr_len; i++) {
			arr[i] = _arr[i];
		}
		
		// 매개변수값 저장
		arr[arr_len] = _val_1;
		
		return arr;
	}
}