package ex033_digit_cancelling_fractions;

public class Ex33_main {
	public static void main(String[] args) {
		
		int numerator = 0;					// 분자
		int denominator = 0;				// 분모
		int[] checked_fraction = {0, 0};	// curious fraction 적용값 [분자][분모]
		
		int[][] result_arr = new int[0][2];	// curious fraction 집합
		
		float origin_val = 0f;			// 원본값
		float fixed_val = 0f;			// 변형값
		
		int mul_numerator = 1;			// 분자들의 곱
		int mul_denominator = 1;		// 분모들의 곱
		int max_common_division = 0;	// 최대 공약수
		
		int result_denominator = 0;		// 최대공약수로 나눈 분모값 (문제 요구값)
		
		// curious fraction을 구하는 루프
		for(denominator = 11; denominator < 100; denominator++) {
			for(numerator = 10; numerator < denominator; numerator++) {
				checked_fraction = Ex33_func.check_curious_fraction(numerator, denominator);
				
				// 반환된 값이 0일 경우, 공통 숫자가 없다. (다음 루프로 이동)
				if(checked_fraction[0] == 0 || checked_fraction[1] == 0) {
					continue;
				}
				
				// 원본값
				origin_val = (float)numerator / (float)denominator;
				// 조정된 값
				fixed_val = (float)checked_fraction[0] / (float)checked_fraction[1];
				
				// 원본값 == 조정된 값
				if(origin_val == fixed_val) {
					int[][] temp_arr = new int[result_arr.length + 1][2];
					
					// 배열의 크기 증가 및 결과값 저장
					for(int i = 0; i < result_arr.length; i++) {
						temp_arr[i] = result_arr[i];
					}
					temp_arr[temp_arr.length - 1][0] = numerator;
					temp_arr[temp_arr.length - 1][1] = denominator;
					result_arr = temp_arr;
				}
			}
		}
		
		// 분자, 분모의 개별 곱
		for(int i = 0; i < result_arr.length; i++) {
			mul_numerator *= result_arr[i][0];
			mul_denominator *= result_arr[i][1];
		}
		
		// 분자, 분모의 최대공약수 구하기
		max_common_division = Ex33_func.max_common_division(mul_numerator, mul_denominator);
		
		// 최대 공약수로 나눈 분모값
		result_denominator = mul_denominator / max_common_division;
		
		System.out.println("<-   TESTing    ->");
		for(int i = 0; i < result_arr.length; i++) {
			System.out.println("lhs : " + result_arr[i][0] + ", rhs : " + result_arr[i][1]);
		}
		
		System.out.println("------------- result -------------");
		System.out.println("분자의 곱 : " + mul_numerator + ", 분모의 곱 : " + mul_denominator);
		System.out.println("최대 공약수 : " + max_common_division);
		System.out.println("최대 공약수로 나눈 분모값 : " + result_denominator);
	}
}
