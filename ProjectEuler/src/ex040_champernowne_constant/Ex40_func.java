package ex040_champernowne_constant;

public class Ex40_func {
	
	/***
	 * chapernowne 수 구하기
	 * 
	 * 매개변수 :
	 * 		int _target : 대상 champernown의 번호값 (소수점 자리수 번호)
	 * 
	 * 반환값 :
	 * 		int형 champernown 숫자 
	 */
	public static int get_champernowne(int _target) {
		
		// 대상값이 0값일 경우, 예외처리
		if(_target == 0) { return -1; }
		
		int digit_cnt = 0;			// 현재 루프까지의 소수점 총 개수
		int loop_num = 0;			// 현재 루프의 값 (int형)
		
		String str_num = "";		// 현재 루프의 값 (String형)
		int cur_str_len = 0;		// str_num의 문자열 길이값
		
		int diff_cnt = 0;			// digit_cnt 와 _target의 차이값
		int target_idx = 0;			// 대상값의 인덱스
		int champernowne_digit = 0;	// 반환값
		
		// 누적된 소수점 개수가 매개변수 보다 작으면, 반복
		while(_target > digit_cnt) {
			// 루프값 증가
			loop_num++;
			// 현재 루프값을 문자열로
			str_num = String.valueOf(loop_num);
			// 문자열의 길이값 도출
			cur_str_len = str_num.length();
			
			// 누적 소수점 개수에 누적
			digit_cnt += cur_str_len;
		}
		
		// 누적 소수점 개수와 매개변수의 차이값 계산
		diff_cnt = digit_cnt - _target;
		// 대상 인덱스 도출
		target_idx = (cur_str_len - 1) - diff_cnt;
		
		// 대상 인덱스의 문자
		String str_digit = str_num.substring(target_idx, target_idx + 1);
		champernowne_digit = Integer.parseInt(str_digit);
		
		return champernowne_digit;
	}
}
