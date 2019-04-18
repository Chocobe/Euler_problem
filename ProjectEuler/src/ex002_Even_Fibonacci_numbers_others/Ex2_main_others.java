package ex002_Even_Fibonacci_numbers_others;

/***
 * 피보나치 수열을 살펴보자.
 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
 *(a, b, c, a, b, c,  a,  b,  c,  a,  b,   c...) 
 *
 * 수열에 a, b, c, 를 순서대로 매겨보면...
 * c의 값은 짝수라는 것을 알 수 있다.
 * 
 * 이를 이용한 루프문으로 해결한 방법이다.
 */

public class Ex2_main_others {
	public static void main(String[] args) {
		
		int lhs = 1;				// a값
		int rhs = 1;				// b값
		int target = 0;				// c값
		int sum = 0;				// 합계
		int limit_num = 4000000;	// 범위값
		
		target = lhs + rhs;
		
		while(target < limit_num) {
			
			sum += target;		// target값(c값) 을 "합계"에 더한다.
			
			lhs = rhs + target;
			rhs = lhs + target;
			target = lhs + rhs;
		}
		
		System.out.println("Total = " + sum);
	}
}
