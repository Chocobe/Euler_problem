package ex026_reciprocal_cycles;

public class Ex26_func {
	
	int denominator = 0;		// 분모
	String decimal = "";		// 소수점
	int recurring_len = 0;		// 반복 소수점의 길이
	
	public Ex26_func(int _val) {
		calc_decimal(_val);
	}
	
	private void calc_decimal(int _denominator) {
		this.denominator = _denominator;	// 분모
		
		int numerator = 1;	// 분자
		int exponent = 0;	// 지수(10의 -지수값)
		
		int quotient = 0;			// 몫
		int rest = 0;				// 나머지
		int match_cnt = 0;			// 연속적 동일한 값이 나온 횟수
		int match_idx = 0;			// 연속적 동일한 값이 나온 인덱스 번호
		String comp_decimal = "";	// 비교할 문자열
		
		// 분자가 분모보다 작으면, 분자 정규화 실행
		while(numerator < denominator) {
			numerator *= 10;
			exponent++;
			this.decimal += "0";
		}
		// 정수부 "0" 삭제
		this.decimal = this.decimal.substring(1, this.decimal.length());
		
		// 소수점 연산 루프
		while(true) {
			quotient = numerator / denominator;	// 몫 계산
			rest = numerator % denominator;		// 나머지 계산
			
			comp_decimal += String.valueOf(quotient);
			
			// 동일한 소수점값이 없을 경우,
			if(this.decimal.indexOf(comp_decimal) < 0) {
				this.decimal += String.valueOf(quotient);
				comp_decimal = "";
				match_cnt = 0;

			// 동일한 소수점이 있을 경우,
			} else {
				
				match_cnt++;
				this.decimal += String.valueOf(quotient); 
				
				// 처음 동일한 소수점이 있는 인덱스 번호 저장
				if(match_cnt == 1) {
					match_idx = exponent - 1;
				}
				
				// 중복 개수가 5개 이상일 경우, 소수점 반복값의 길이 도출 & 종료
				if(match_cnt > 5) {
					int first_match_idx = this.decimal.indexOf(comp_decimal);
					String recurring = this.decimal.substring(first_match_idx, match_idx);

					// TEST
					this.decimal = 
							"0." + this.decimal.substring(0, first_match_idx) +
							"("  + recurring + ")";					
					
					this.recurring_len = recurring.length();
					
					return;
				}
			}
			
			// 현재 나머지 != 0 일 경우,
			if(rest != 0) {
				numerator = rest * 10;
				exponent++;
			
			// 현재 나머지 == 0 일 경우, 메서드 종료
			} else {
				// 반복 소수점 개수 0
				this.recurring_len = 0;
				// decimal값을 소수점으로 표현
				this.decimal = "0." + this.decimal;
				// 메서드 종료
				return;
			}
		}
	}	
}