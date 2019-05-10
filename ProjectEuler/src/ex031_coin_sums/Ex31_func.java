package ex031_coin_sums;

public class Ex31_func {
	private int[] coin_table;	// 코인값 테이블
	private int combine_way;	// 조합 방법 개수
	
	/***
	 * 생성자 (인스턴스 초기화)
	 * 
	 * 매개변수 :
	 * 		int[] _table : 코인값에 대한 참조 테이블 배열
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public Ex31_func(int[] _table) {
		this.coin_table = _table;
		combine_way = 0;
	}
	
	
	/***
	 * 조합 방법 개수값 얻기
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		int형 조합 방법 수
	 */
	public int get_combine() {
		return this.combine_way;
	}
	
	
	/***
	 * 테이블 출력
	 * 
	 * 매개변수 :
	 * 		N/A
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void print_coin_table() {
		for(int i = 0; i < this.coin_table.length; i++) {
			System.out.println(this.coin_table[i]);
		}
	}
	
	
	/***
	 * 조합 방법 수를 계산하기 위한 메인에서 호출용 메서드
	 * 
	 * 매개변수 :
	 * 		int _target : 연산할 대상값
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void combine_ways(int _target) {
		this.combine_way = 0;
		
		int table_len = this.coin_table.length;
		int idx = 0;
		int limit = 0;
		
		// coin_table상의 값 중, 연산가능한 가장 큰 수 도출
		for(idx = 0; idx < table_len; idx++) {
			limit = _target / this.coin_table[idx];
			
			// 몫이 있을 경우, 현재 idx, limit로 초기값 사용
			if(limit > 0) {
				break;
			}
		}
		
		// 조합 방법 연산
		calc_way(_target, idx, limit);
		
		// _target == 0일 경우, 예외처리
		if(_target == 0) {
			this.combine_way = 0;
		}
		
		// 결과 출력
		System.out.println("대상값 : " + _target);
		System.out.println("조합 방법 수 : " + this.combine_way);
	}
	
	
	/***
	 * 조합 방법의 경우의 수 연산 (클래스 내부용
	 * 
	 * 매개변수 :
	 * 		int _target	: 연산할 대상값
	 * 		int _idx	: coin table의 인덱스 번호
	 * 		int _limit	: 현재 루프의 한계값
	 * 
	 * 반환값 :
	 * 		N/A
	 * 
	 * TESTed
	 */
	private void calc_way(int _target, int _idx, int _limit) {
		// 현재 루프가 p5값 이상일 경우, 재귀 호출을 위한 연산
		if(_idx < this.coin_table.length - 1) {
			for(int cur_coin = _limit; cur_coin >= 0; cur_coin--) {
				
				// 현재 루프상의 값을 대상값에서 뺀 나머지값 도출
				int next_target = _target - (this.coin_table[_idx] * cur_coin);
				
				// 다음 루프의 한계값 도출
				int next_limit = next_target / this.coin_table[_idx + 1];
				
				// 재귀 호출
				calc_way(next_target, (_idx + 1), next_limit);
			}
			
		// 현재 루프가 p2값일 경우,
		} else {
			// 조합방법 1개 증가
			this.combine_way++;
		}
	}
}
