package ex2_Even_Fibonacci_numbers;

// �Ǻ���ġ ������ ����� ¦���� ���� ���� Ŭ����
public class Ex2_fibo {
	private static int sum = 0;
	
	// �հ� ��ȯ
	public static int getSum() { return sum; }
	
	public static void fibo_sum(int _lhs, int _rhs, int _limit) {
		// �������� ¦���� ���, �ջ�
		if(_rhs % 2 == 0) { Ex2_fibo.sum += _rhs; }
		
		// ���� �Ǻ���ġ ������ �Ѱ谪 �̸��̸�..
		if(_lhs + _rhs < _limit) {
			_rhs += _lhs;			// �������� ������ ���� ������ �̵�
			_lhs = _rhs - _lhs;		// �������� ������ ���� ������ �̵�
			
			Ex2_fibo.fibo_sum(_lhs, _rhs, _limit);
		}
	}
}
