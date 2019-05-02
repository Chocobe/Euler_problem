package ex025_1000_digit_Fibonacci_number;

import java.math.BigInteger;

public class Ex25_func {
	
	/***
	 * 입력 인덱스의 피보나치 수열값까지 가지는 배열 반환
	 * 
	 * 매개변수 :
	 * 		int _idx : 구하고자 하는 인덱스
	 * 
	 * 반환값 :
	 * 		현재 인덱스의 BigInteger형 피보나치 수열값을 가지는 배열
	 */
	public static BigInteger[] fibonacci(BigInteger[] _ref, int _idx) {
		
		// 인덱스가 0일 떄,
		if(_idx == 0) {
			_ref[0] = BigInteger.valueOf(0);
			return _ref;
			
		// 인덱스가 1일 때,
		} else if(_idx == 1) {
			_ref[1] = BigInteger.valueOf(1);
			return _ref;
		
		// 인덱스가 2일 때,
		} else if(_idx == 2) {
			_ref[2] = BigInteger.valueOf(1);
			return _ref;
		
		// 인덱스가 2보다 클 떄,
		} else {
			// 이전 두 항의 합을 현재 인덱스값으로.
			_ref[_idx] = _ref[_idx - 1].add(_ref[_idx - 2]);
			return _ref;
		}
	}
}
