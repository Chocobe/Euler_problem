package ex2_Even_Fibonacci_numbers;

// 피보나치 수열의 진행과 짝수의 합을 위한 클래스
public class Ex2_fibo {
	private static int sum = 0;
	
	// 합계 반환
	public static int getSum() { return sum; }
	
	public static void fibo_sum(int _lhs, int _rhs, int _limit) {
		// 우측항이 짝수일 경우, 합산
		if(_rhs % 2 == 0) { Ex2_fibo.sum += _rhs; }
		
		// 다음 피보나치 수열이 한계값 미만이면..
		if(_lhs + _rhs < _limit) {
			_rhs += _lhs;			// 우측항을 수열의 다음 항으로 이동
			_lhs = _rhs - _lhs;		// 좌측항을 수열의 다음 항으로 이동
			
			Ex2_fibo.fibo_sum(_lhs, _rhs, _limit);
		}
	}
}
