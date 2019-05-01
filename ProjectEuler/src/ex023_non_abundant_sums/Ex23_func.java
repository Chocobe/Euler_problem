package ex023_non_abundant_sums;

public class Ex23_func {
	
	/***
	 * 약수 구하기
	 * 
	 * 매개변수 :
	 * 		int _data : 입력값
	 * 
	 * 반환값 :
	 * 		int형 약수의 합 (자기 자신은 제외)
	 */
	public static int sum_of_divisor(int _data) {
		
		int sum = 0;				// 약수의 합
		int min_quotient = _data;	// 최소 몫
		
		for(int i = 1; i < min_quotient; i++) {
			// i 가 약수라면,
			if(_data % i == 0) {
				// 최소 몫 갱신
				min_quotient = _data / i;
				
				// 제수와 몫이 같다면,
				if(i == min_quotient) {
					// 중복 배제
					sum += i;
					
				} else {
					sum = sum + i + min_quotient;
					
				}
			}
		}
		
		// 자기 자신 배제 (_data가 1인 경우 sum의 -1값 방지)
		if(sum != 0) {
			
			sum -= _data;
		}
		
		return sum;
	}
	
	
	/***
	 * 배열 인덱스 추가하기.
	 * 
	 * 매개변수 :
	 * 		int[] _arr	: 저장할 배열
	 * 		int _data	: 저장할 값
	 * 
	 * 반환값 :
	 * 		저장할 값을 추가한 배열
	 */
	public static int[] add_idx(int[] _arr, int _data) {
		
		// 입력받은 배열의 길이
		int arr_len = _arr.length;
		int[] result_arr = new int[arr_len + 1];
		
		for(int i = 0; i < arr_len; i++) {
			result_arr[i] = _arr[i];
		}
		
		// 마지막 인덱스에 입력값 저장
		result_arr[arr_len] = _data;
		
		return result_arr;
	}
}
