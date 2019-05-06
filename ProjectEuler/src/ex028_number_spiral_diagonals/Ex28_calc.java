package ex028_number_spiral_diagonals;

public class Ex28_calc {
	
	int sum;		// 합 (문제의 결과값) 
	int last_num;	// 마지막 연산값
	
	/***
	 * 나선형 대각선의 전체 계산
	 * 
	 * 매개변수 :
	 * 		int _length : 대각선의 길이값
	 * 
	 * 반환값 :
	 * 		N/A
	 */
	public void calc_diagonal(int _length) {
		// 대각선 값에 대한 루프 횟수값 산출
		int loop_val = (_length - 1) / 2;
		
		for(int i = 0; i <= loop_val; i++) {
			calc_partial(i);
		}
	}
	
	
	/***
	 * 입력n 값에 대한 가장 외곽의 모서리값 구하기
	 * 
	 * 매개변수 :
	 * 		int _sequence_num : 현재 루프 번호
	 * 
	 * 반환값 :
	 * 		N/A
	 */
	public void calc_partial(int _sequence_num) {
		// 입력값이 0일 경우,
		if(_sequence_num == 0) {
			this.sum = 1;
			this.last_num = 1;
			
			return;
		}
		
		// 입력값이 0 이외의 경우,
		for(int i = 0; i < 4; i++) {
			
			this.last_num += (_sequence_num * 2);
			this.sum += this.last_num;			
		}
	}
	
}
