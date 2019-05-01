package ex024_lexicographic_permutations;

public class Ex24_func {
	
	/***
	 * 팩토리얼 구하기
	 * 
	 * 매개변수 :
	 * 		int _digit : 구하고자 하는 펙토리얼
	 * 
	 * 반환값 :
	 * 		int형 펙토리얼값
	 */
	public static int pactorial(int _digit) {
		int pactorial = 1;
		
		for(int i = 1; i <= _digit; i++) {
			pactorial *= i;
		}
		
		return pactorial;
	}
	
	
	/***
	 * 매개변수 번쨰의 순열 반환
	 * 
	 * 매개변수 :
	 * 		int _order_num : 순열상 정렬 번호
	 * 
	 * 반환값 :
	 * 		long형 순열값
	 */
	public static long permutation(int _order_num) {
		
		// 순열값
		long permutation = 0;
		String str_permutation = "";
		
		// 사용한 숫자의 확인을 위한 플래그 배열
		int[] digit_arr = new int[10];
		for(int i = 0; i < digit_arr.length; i++) {
			digit_arr[i] = 1;
		}
		
		int quotient = 0;		// 몫
		int rest = _order_num;	// 나머지
		int cur_pactorial = 0;	// 현재 루프의 펙토리얼 값
		int idx_cnt = 0;		// 인덱스 참조한 개수
		
		for(int i = 9; i >= 0; i--) {
			// 현재 루프의 펙토리얼 계산
			cur_pactorial = pactorial(i);
			// 몫 (매개변수 / 펙토리얼)
			quotient = rest / cur_pactorial;
			// 나머지 (매개변수 / 펙토리얼)
			rest %= cur_pactorial;
			// 참조 인덱스 개수 초기화
			idx_cnt = 0;
			
			switch(rest) {
			// 나머지 == 0
			case 0:
				for(int j = 0; j < 10; j++) {
					if(digit_arr[j] == 1) {
						idx_cnt++;
					}
					
					if(idx_cnt == quotient) {
						str_permutation += String.valueOf(j);
						// 참조여부 갱신
						digit_arr[j] = 0;
						break;
					}
				}
				
				for(int j = 9; j >= 0; j--) {
					if(digit_arr[j] == 1) {
						str_permutation += String.valueOf(j);
					}
				}
				// 전체 루프 종료
				i = 0;
				break;
				
			// 나머지 == 1
			case 1:
				for(int j = 0; j < 10; j++) {
					if(digit_arr[j] == 1) {
						idx_cnt++;
					}
					
					if(idx_cnt == quotient + 1) {
						str_permutation += String.valueOf(j);
						// 참조여부 갱신
						digit_arr[j] = 0;
						break;
					}
				}
				
				for(int j = 0; j < 10; j++) {
					if(digit_arr[j] == 1) {
						str_permutation += String.valueOf(j);
					}
				}
				i = 0;				
				break;
				
			// 나머지 == 그 외
			default:
				for(int j = 0; j < 10; j++) {
					// 참조여부 확인
					if(digit_arr[j] == 1) {
						idx_cnt++;
					}
					
					// "몫 + 1" 번째 (아직 참조한적 없는) 값 추출
					if(idx_cnt == quotient + 1) {
						str_permutation += String.valueOf(j);
						// 참조여부 갱신
						digit_arr[j] = 0;
						break;
					}
				}
				break;					
			}
		}
		permutation = Long.parseLong(str_permutation);
				
		return permutation;
	}
}
