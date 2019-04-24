package ex017_number_letter_counts;

public class Ex17_main {	
	public static void main(String[] args) {
		
		int[] letter_table = new int[1001];	// 문자 참조 테이블
		
		final int letter_and = 3;			// "and"의 글자 개수
		
		// 기본 데이터 저장
		letter_table[1]  = 3;
		letter_table[2]  = 3;
		letter_table[3]  = 5;
		letter_table[4]  = 4;
		letter_table[5]  = 4;
		letter_table[6]  = 3;
		letter_table[7]  = 5;
		letter_table[8]  = 5;
		letter_table[9]  = 4;
		letter_table[10] = 3;
		
		letter_table[11] = 6;
		letter_table[12] = 6;
		letter_table[13] = 8;
		letter_table[14] = 8;
		letter_table[15] = 7;
		letter_table[16] = 7;
		letter_table[17] = 9;
		letter_table[18] = 8;
		letter_table[19] = 8;
		
		letter_table[20] = 6;
		letter_table[30] = 6;
		letter_table[40] = 5;
		letter_table[50] = 5;
		letter_table[60] = 5;
		letter_table[70] = 7;
		letter_table[80] = 6;
		letter_table[90] = 6;
		
		letter_table[100] = 10;
		letter_table[200] = 10;
		letter_table[300] = 12;
		letter_table[400] = 11;
		letter_table[500] = 11;
		letter_table[600] = 10;
		letter_table[700] = 12;
		letter_table[800] = 12;
		letter_table[900] = 11;
		
		letter_table[1000] = 11;
		

		
		// 연산용 변수
		int cur_digit_num = 0;			// 현재 숫자
		int cur_temp = 0;				// 현재 숫자의 변형을 위한 변수
		int total_letter_num = 0;		// 총 문자 개수		

		
		// 연산부
		for(int i = 1; i <= 1000; i++) {
			
			// 루프마다 초기화
			cur_digit_num = 0;
			cur_temp = 0;
			
			// 참조 테이블에 값이 없다면, 연산
			if(letter_table[i] == 0) {
				
				if(i >= 100) {
					
					// cur_temp = (100단위 값 추출 * 100)
					cur_temp = (divide_digit(i, 2) * 100);
					//  현재 숫자의 문자 수 = letter_table[cur_temp]
					cur_digit_num = letter_table[cur_temp];					
					
					// 10의 자리 & 1의 자리 숫 = i - cur_temp
					cur_temp = i - cur_temp;
					
					if(cur_temp != 0) {
					// total_letter_num += letter_table[cur_temp] + letter_and;
						cur_digit_num += letter_table[cur_temp] + letter_and;
					}
					
				} else {
					if(i >= 20) {
						
						// cur_temp = (10단위 값 추출 * 10)
						cur_temp = (divide_digit(i, 1) * 10);
						
						// total_letter_num += letter_table[cur_temp];
						cur_digit_num = letter_table[cur_temp];
										
						// 1의 자리 숫자 추출 = i - cur_temp
						cur_temp = i - cur_temp;
						//total_letter_num += letter_table[cur_temp]
						if(cur_temp != 0) {
							cur_digit_num += letter_table[cur_temp];
						}
						
					} else {
						
						// total_letter_num += letter_table[i]
						total_letter_num += letter_table[i];
						continue;
						
					}
				}
				
				// 테이블 갱신
				// 총 문자수 변수에 현재의 문자수 더하기
				total_letter_num += cur_digit_num;
				// 테이블에 현재값 갱신
				letter_table[i] = cur_digit_num;
				
			// 참조 테이블에 값이 존재한다면, 값 참조
			} else {
				total_letter_num += letter_table[i];
				
			}
		}
		
		System.out.println("1부터 1000까지의 총 문자 개수 : " + total_letter_num);	
	}
	
	
	/***
	 * 매개변수의 자리수 값을 추출 (123의 100자리 숫자 추출 -> 반환값 : 1)
	 * 
	 * 매개변수 :
	 * 		int _target : 대상 숫자
	 * 		int _exponent : 10의 지수값
	 * 
	 * 반환값 :
	 * 		해당 자리수의 숫자. (321을 100자리 숫자 추출 시 -> 반환값 : 3)
	 */
	public static int divide_digit(int _target, int _exponent) {
		
		int result_digit = 0;		// 해당 자릿수의 값
		
		result_digit = _target / (int)(Math.pow(10,_exponent));
		
		return result_digit;
		
	}
}
