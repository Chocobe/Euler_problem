package ex005_smallest_multiple;

public class Ex5_calc {
	
	/***
	 * gcd : Greatest Common Divisor (최대 공약수)
	 * 
	 * 자바에는 최대공약수에 대한 메서드가 제공 되지 않는다.
	 * 구현하여 사용하자.
	 */
	public static int gcd(int _lhs, int _rhs) {
		
		if(_lhs == 0 || _rhs == 0) { return 0; }
		
		int gcd = 1;			// 최대공약수
		int temp_quotient = 0;	// 몫을 저장하기 위한 임시변수
		int target_num = _lhs;	// 좌측값 (연산으로 인해 수정될 값)
		int comp_num = _rhs;	// 우측값	(연산으로 인해 수정될 값)
		
		// 좌측항의 크기만큼 반복 수행
		for(int i = 1; i < _lhs - 1; i++) {
			
			// 좌측값을 루프값으로 나누어 떨어질 때,
			if(target_num % i == 0) {
				
				// 좌측값을 루프값으로 나눈 몫 도출 (가장 큰 약수부터 구하는 방식)
				temp_quotient = target_num / i;
				
				// 좌측값의 약수로 우측값을 나누어 떨어지는 경우,
				if(comp_num % temp_quotient == 0) {
					
					// 공약수가 된다. (좌측값의 약수 중, 큰값순으로 도출 했기 때문에, 공통 소수 중 가장 큰 약수가 된다.)
					gcd *= temp_quotient;
					
					// 공약수 중, 소수의 가장큰 값이므로, 중복을 배제하기 위해 양쪽 모두에 나눠준다.
					target_num /= temp_quotient;
					comp_num /= temp_quotient;
				}
			}
		}
		
		return gcd;
	}
}
