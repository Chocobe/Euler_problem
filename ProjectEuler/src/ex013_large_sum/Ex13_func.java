package ex013_large_sum;

public class Ex13_func {

	/***
	 * 문자열을 long형 배열로 변환
	 * 
	 * 매개변수 :
	 * 		String _origin	: 입력 문자열
	 * 		int _arr_size	: 배열의 크기
	 * 		int _data_len	: 분할된 데이터의 길이
	 * 
	 * 반환값
	 * 		크기가 _arr_size 인 long형 배열
	 */
	public static long[] decomposition(String _origin, int _arr_size, int _data_len) {
		
		long[] result_arr = new long[_arr_size];	// 반환할 배열
		String temp_arr = "";						// 문자열을 분할 저장
		
		int begin_idx = 0;	// 시작 인덱스
		int end_idx = 0;	// 끝 인덱스
		
		for(int i = 0; i < _arr_size; i++) {
			
			begin_idx = _data_len * i;			// 시작 인덱스 갱신
			end_idx = begin_idx + _data_len;	// 끝 인덱스 갱신
			
			temp_arr = _origin.substring(begin_idx, end_idx);	// 문자열로 분할
			result_arr[i] = Long.parseLong(temp_arr);			// long형으로 저장
		}
		
		return result_arr;
	}
	
	
	/***
	 * sour배열의 값을 dest배열에 합산 (각 인덱스 개별 합산)
	 * 
	 * 매개변수 :
	 * 		long[] _dest : 목적지 (더해질 부분)
	 * 		long[] _sour : 소스(더할 부분)
	 */
	public static void idx_summation(long[] _dest, long[] _sour) {
		int arr_dest = _dest.length;	// 목적 배열의 크기
		int arr_sour = _sour.length;	// 소스 배열의 크기
		
		// 두 배열의 크기가 다를 경우, 예외조건 & 종료
		if(arr_dest != arr_sour) {
			System.out.println("Error] : 두 배열의 크기가 다름");
			return;
		}
		
		// 매칭되는 인덱스에 값 더하기
		for(int i = 0; i < arr_dest; i++) {
			_dest[i] += _sour[i];
		}
	}
	
	
	/***
	 * 올림수(carry) 구하기
	 * 
	 * 매개변수 :
	 * 		long _data : 올림수를 추출할 값
	 * 		int _digit_num : 원래 자리수
	 * 
	 * 반환값 :
	 * 		발생한 올림수 값
	 */
	public static long calc_carry(long _data, int _digit_num) {
		long carry = 0;
		
		carry = (long)(_data / Math.pow(10, _digit_num));
		
		return carry;
	}
}
