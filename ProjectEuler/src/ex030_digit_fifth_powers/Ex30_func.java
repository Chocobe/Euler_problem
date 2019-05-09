package ex030_digit_fifth_powers;

public class Ex30_func {
	
	int[] ref_table;	// 참조 테이블
	int exponent;		// 조건 지수값
	
	
	/***
	 * 생성자
	 * 
	 * 매개변수 :
	 * 		int _exponent : 조건 지수값
	 * 
	 * TESTed
	 */
	public Ex30_func(int _exponent) {
		this.ref_table = new int[10];	// 참조 배열
		this.exponent = _exponent;		// 조건 지수값
		
		// 참조 테이블 데이터 생성
		set_table();
	}
	
	
	/***
	 * 입력값을 배열에 추가하여 반환
	 * 
	 * 매개변수 :
	 * 		int[] _dest	: 기존 배열
	 * 		int _sour	: 저장할 값
	 * 
	 * 반환값 :
	 * 		저장할 값을 추가한 int[]
	 * 
	 * TESTed
	 */
	public int[] insert_arr(int[] _dest, int _sour) {
		int len = _dest.length + 1;
		int[] result_arr = new int[len];
		
		for(int i = 0; i < _dest.length; i++) {
			result_arr[i] = _dest[i];
		}
		result_arr[len - 1] = _sour;
		
		return result_arr;
	}
	
	
	/***
	 * 인스턴스 정보 출력
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void get_table() {
		for(int i = 0; i < 10; i++) {
			System.out.println("[" + i + "] : " + ref_table[i]);
		}
	}
	
	
	/***
	 * 참조 테이블 설정 메서드
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	private void set_table() {
		for(int i = 0; i < 10; i++) {
			this.ref_table[i] = (int)Math.pow(i, this.exponent);
		}
	}
	
	
	/***
	 * 최대 자릿수 구하기
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public int calc_max_digit() {
		int sum = 0;			// 합계
		int sum_cnt = 0;		// 연산한 항의 개수
		String string_sum;		// 합계의 문자열형
		
		while(true) {
			sum += this.ref_table[9];
			sum_cnt++;
			string_sum = String.valueOf(sum);
			
			if(string_sum.length() == sum_cnt) {
				return sum_cnt;
			}
		}
	}
	
	
	/***
	 * 총합 과 사용숫자의 비치 비교
	 * 
	 * 매개변수 :
	 * 		int[] _used_digit : 사용한 숫자의 배열
	 * 
	 * 반환값 :
	 * 		int형	: -1 : 조건에 맞지 않은 경우
	 * 				: 0보다 큰 정수 : 조건에 맞는 값
	 * 
	 * TESTed
	 */
	public int comp_digit(int[] _used_digit) {
		
		int sum = 0;				// 총합
		String string_sum;			// 총 합의 문자열형
		String temp_digit = "";	// 현재 숫자의 문자열형
		int first_zero = 0;			// 앞자리 0의 개수
		
		// 전체 합 연산
		for(int i = 0; i < _used_digit.length; i++) {
			sum += this.ref_table[_used_digit[i]];
		}
		string_sum = String.valueOf(sum);
		
		if(sum == 1 || sum == 0) {
			return -1;
		}
		
		// 앞자리 0의 개수 파악
		first_zero = _used_digit.length - string_sum.length();
		// 앞지리 0의 개수만큼 String형에 0 추가
		for(int i = 0; i < first_zero; i++) {
			temp_digit = temp_digit.concat("0");
		}
		string_sum = temp_digit.concat(string_sum);
		
		// 각 자릿수별 비교
		for(int i = 0; i < _used_digit.length; i++) {
			String used_char = String.valueOf(_used_digit[i]);
			String comp_char = string_sum.substring(i, i + 1);

			// 비교하여 다를경우(0 이외의 값),
			if(used_char.indexOf(comp_char) != 0) {
				// -1값 반환 & 메서드 종료
				return -1;
			}		
		}
		
		return sum;
	}
}