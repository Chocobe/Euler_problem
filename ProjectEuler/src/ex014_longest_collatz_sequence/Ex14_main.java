package ex014_longest_collatz_sequence;

public class Ex14_main {
	public static void main(String[] args) {
		
		int limit_num = 1000000;	// 한계값
		
		long cur_data = 0;			// 현재값
		int cur_chain = 0;			// 현재 체인수
		
		int most_chain = 0;			// 가장 많은 체인 개수
		long most_chain_num = 0;	// 가장 많은 체인의 원본값
		
		// 체인값 참조 테이블의 인덱스 한계값
		int table_idx_limit = 10000;
		// 체인값 참조 테이블
		int chain_table[] = new int[table_idx_limit];
		
		// i를 사용하여 설정된 한계값까지 루프
		for(int i = 1; i < limit_num; i++) {
			
			cur_data = i;	// collatz를 적용할 대상값
			cur_chain = 0;	// 현재값에 대한 체인 개수
			
			while(cur_data != 0) {	// 현재값이 0이면, collatz 적용 루프 종료
				
				// 체인 테이블을 참조하기위한 인덱스 조건
				if(cur_data < table_idx_limit) {
					// 현재 참조중인 체인 테이블에 데이터가 있다면,
					if(chain_table[(int)cur_data] != 0) {
						
						// 참조하여 현재 체인값에 가산
						cur_chain += chain_table[(int)cur_data];
						
						// 테이블 참조를 통해 이후의 모든 과정은 이미 적용되었음
						// -> 현재값 루프 종료
						break;
					}
				}
				
				// 현재값에 collatz 한번 실행
				cur_data = Ex14_func.collatz_sequence(cur_data);
				// 체인 개수 하나 증가
				cur_chain++;				
			}
			
			//
			// 체인 테이블을 갱신하기 위한 부분
			//
			// 현재값이 체인테이블의 인덱스 조건에 만족하고,
			if(i < table_idx_limit) {
				// 체인테이블이 아직 갱신되지 않았다면,
				if(chain_table[i] == 0) {
					
					// 현재값에 해당하는 체인테이블 갱신
					chain_table[i] = cur_chain;
				}
			}
			
			// 현재 체인 개수가 최대 체인 개수 보다 많다면,
			if(cur_chain > most_chain) {
				most_chain = cur_chain;		// 최고 체인수 갱신
				most_chain_num = i;			// 이 떄의 원본값 저장
			}
		}
		
		System.out.println("최고 체인 개수 : " + most_chain);
		System.out.println("최고 체인수의 원본값 : " + most_chain_num);
	}
}
