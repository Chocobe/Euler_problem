package ex014_longest_collatz_sequence;

public class Ex14_func {
	
	/*
	 * 입력값(매개변수 _origin)에 collatz 적용 및 결과 반환
	 * 
	 * 매개변수 :
	 * 		long _origin : 입력 데이터
	 * 
	 * 반환값 :
	 * 		입력 데이터에 collatz 적용한 결과값
	 */
	public static long collatz_sequence(long _origin) {
		
		long cur_data = _origin;		// 원본 데이터값
		
		// 원본 데이터가 짝수일 경우
		if(cur_data % 2 == 0) {
			cur_data /= 2;
			
		// 원본 데이터가 홀수일 경우 (1이 아님)
		} else if(cur_data % 2 != 0 && cur_data != 1) {
			cur_data = cur_data * 3 + 1;
			
		// 원본 데이터가 1일 경우
		} else {
			cur_data = 0;
			
		}
		
		return cur_data;
	}
}
