package ex025_1000_digit_Fibonacci_number;

import java.math.BigInteger;

public class Ex25_func {
	
	/***
	 * �Է� �ε����� �Ǻ���ġ ���������� ������ �迭 ��ȯ
	 * 
	 * �Ű����� :
	 * 		int _idx : ���ϰ��� �ϴ� �ε���
	 * 
	 * ��ȯ�� :
	 * 		���� �ε����� BigInteger�� �Ǻ���ġ �������� ������ �迭
	 */
	public static BigInteger[] fibonacci(BigInteger[] _ref, int _idx) {
		
		// �ε����� 0�� ��,
		if(_idx == 0) {
			_ref[0] = BigInteger.valueOf(0);
			return _ref;
			
		// �ε����� 1�� ��,
		} else if(_idx == 1) {
			_ref[1] = BigInteger.valueOf(1);
			return _ref;
		
		// �ε����� 2�� ��,
		} else if(_idx == 2) {
			_ref[2] = BigInteger.valueOf(1);
			return _ref;
		
		// �ε����� 2���� Ŭ ��,
		} else {
			// ���� �� ���� ���� ���� �ε���������.
			_ref[_idx] = _ref[_idx - 1].add(_ref[_idx - 2]);
			return _ref;
		}
	}
}
