package ex033_digit_cancelling_fractions;

public class Ex33_func {
	
	/***
	 * 두개의 정수에서 공통된 숫자를 소거한 값을 배열로 반환
	 * 
	 * 매개변수 :
	 * 		int _numerator		: 분자
	 * 		int _denominator	: 분모
	 * 
	 * 반환값 :
	 * 		int[2]형의 값 == {분자, 분모}
	 * 		값이 0인 경우 : 소거 가능한 동일 숫자가 없음
	 * 
	 * TESTed
	 */
	public static int[] check_curious_fraction(int _numerator, int _denominator) {
		int[] result_arr = {0, 0};
		
		String str_numerator = String.valueOf(_numerator);		// 분자의 문자열형
		String str_denominator = String.valueOf(_denominator);	// 분모의 문자열형
		String str_common = "";		// 공통된 숫자의 문자열형
		
		for(int i = 0; i < 2; i++) {
			// 분모의 숫자 하나 추출
			str_common = str_denominator.substring(i, i + 1);
			
			// 추출된 숫자가 0일 경우는 제외
			if(str_common.compareTo("0") == 0) {
				continue;
			}
			
			for(int j = 0; j < 2; j++) {
				// 동일한 값일 경우,
				if(str_common.compareTo(str_numerator.substring(j, j + 1)) == 0) {
					str_numerator = str_numerator.replaceFirst(str_common, "");
					str_denominator = str_denominator.replaceFirst(str_common, "");
					
					result_arr[0] = Integer.parseInt(str_numerator);
					result_arr[1] = Integer.parseInt(str_denominator);
					
					// 결과값 반환 & 메서드 종료
					return result_arr;					
				}
			}
		}
		
		return result_arr;
	}
	
	
	/***
	 * 약수 구하기
	 * 
	 * 매개변수 :
	 * 		int _target : 대상값
	 * 
	 * 반환값 :
	 * 		int[] division : 대상값의 약수의 배열
	 * 
	 * TESTed
	 */
	private static int[] division(int _target) {
		int division[] = new int[0];	// 대상값의 약수 배열
		
		for(int i = 2; i <= _target; i++) {
			// 대상값의 약수라면,
			if(_target % i == 0) {
				int[] temp_arr = new int[division.length + 1];
				// 현재값을 0번 인덱스에 저장 (큰값의 약수 순서로 저장하기 위함)
				temp_arr[0] = i;
				
				for(int j = 0; j < division.length; j++) {
					temp_arr[1 + j] = division[j];
				}
				
				division = temp_arr;
			}
		}
		
		return division;
	}
	
	
	/***
	 * 최대공약수 구하기
	 * 
	 * 매개변수 :
	 * 		int _numerator	: 좌측값
	 * 		int denominator	: 우측값
	 * 
	 * 반환값 :
	 * 		int형 최대공약수
	 * 
	 * TESTed
	 */
	public static int max_common_division(int _numerator, int _denominator) {
		int common_division = 0;	// 공통약수
		int[] division;				// 약수
		
		// 분자의 약수 구하기
		division = Ex33_func.division(_numerator);
		
		for(int i = 0; i < division.length; i++) {
			// 분모의 약수라면,
			if(_denominator % division[i] == 0) {
				common_division = division[i];
				break;
			}
		}
		
		return common_division;
	}
}