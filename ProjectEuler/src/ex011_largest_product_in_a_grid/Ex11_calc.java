package ex011_largest_product_in_a_grid;

public class Ex11_calc {

	/***
	 * 좌 -> 우 방향의 최대값 산출 메서드 (수평방향)
	 */	
	public static int horizen_mul(String[] _table, int _out_num) {
		
		int table_cnt = _table.length;					// 테이블 배열의 갯수
		int element_cnt = (_table[0].length() + 1) / 3;	// 테이블당 데이터 갯수
		int access_limit = element_cnt - _out_num;		// 접근가능한 최대 데이터 갯수
		
		int max_mul = 1;			// 최대 결과값
		int cur_mul = 1;			// 현재 결과값
		String cur_string = "";		// 추출한 문자열
		int cur_num = 0;			// 추출한 정수값
		int start_idx = 0;			// 시작지점 인덱스
		
		for(int i = 0; i < table_cnt; i++) {			// 테이블용 루프
			for(int j = 0; j <= access_limit; j++) {	// 시작 인덱스 설정용 루프
				
				cur_mul = 1;	// 현재 결과값 초기화
				
				for(int k = 0; k < _out_num; k++) {		// 시작점으로 부터 추출갯수만큼 루프
					
					start_idx = (j * 3) + (k * 3);		// 문자열 접근 인덱스 파악
					
					cur_string = _table[i].substring(start_idx, start_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {		// 최대 결과값과 현재 결과값의 비교 및 대입
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;		
	}
	
	/***
	 * 상 -> 하 방향의 최대값 산출 메서드 (수직방향)
	 */
	public static int vertical_mul(String[] _table, int _out_num) {
		
		int element_cnt = (_table[0].length() + 1) / 3;		// 테이블당 데이터 갯수
		int access_limit = element_cnt - _out_num;			// 접근 가능한 최대 인덱스
		
		int max_mul = 1;			// 최대 결과값
		int cur_mul = 1;			// 현재 결과값
		String cur_string = "";		// 추출한 문자열
		int cur_num = 0;			// 추출한 정수값
		int start_idx = 0;			// 시작지점 인덱스
		
		for(int i = 0; i <= access_limit; i++) {		// 시작점 배열의 인덱스 값
			for(int j = 0; j < element_cnt; j++) {		// 수직 접근이기 때문에 데이터 갯수만큼 접근
				
				cur_mul = 1;
				
				for(int k = 0; k < _out_num; k++) {		// 시작점당 추출 갯수 만큼 접근
					
					start_idx = j * 3;
					
					cur_string = _table[i + k].substring(start_idx, start_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;		
	}
	
	/***
	 * 좌측 상단 -> 우측 하단 방향의 최대값 산출 메서드 (대각선)
	 */
	public static int right_diagonal(String[] _table, int _out_num) {
		
		int element_cnt = (_table[0].length() + 1) / 3;		// 테이블당 데이터 갯수
		int access_limit = element_cnt - _out_num;			// 접근 가능한 최대 인덱스
		
		int max_mul = 1;			// 최대 결과값
		int cur_mul = 1;			// 현재 결과값
		String cur_string = "";		// 추출 문자열
		int cur_num = 0;			// 추출 정수값
		
		int start_row_idx = 0;		// 시작행의 인덱스
		int start_col_idx = 0;		// 문자열의 시작 인덱스
		
		for(int i = 0; i <= access_limit; i++) {
			for(int j = 0; j <= access_limit; j++) {
				
				cur_mul = 1;
				
				for(int k = 0; k < _out_num; k++) {
					
					start_row_idx = i + k;
					start_col_idx = ((j + k) * 3);
					
					cur_string = _table[start_row_idx].substring(start_col_idx, start_col_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;
	}
	
	/***
	 * 우측 상단 -> 좌측 하단 방향의 최대값 산출 메서드 (역대각선)
	 */
	public static int left_diagonal(String[] _table, int _out_num) {
		
		int element_cnt = (_table[0].length() + 1) / 3;		// 테이블당 데이터 갯수
		
		int max_mul = 1;			// 최대 결과값
		int cur_mul = 1;			// 현재 결과값
		String cur_string = "";		// 추출 문자열
		int cur_num = 0;			// 추출 정수값
		
		int start_row_idx = 0;		// 시작행의 인덱스
		int start_col_idx = 0;		// 문자열의 시작 인덱스
		
		int access_limit = element_cnt - _out_num;		// 접근 가능한 최대 인덱스
		
		for(int i = 0; i <= access_limit; i++) {
			for(int j = 0; j <= access_limit; j++) {
				
				cur_mul = 1;
				
				for(int k = 0; k < _out_num; k++) {
					
					start_row_idx = (i + k);
					start_col_idx = ((element_cnt - 1) - (j + k)) * 3;
					
					cur_string = _table[start_row_idx].substring(start_col_idx, start_col_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;
	}
}
