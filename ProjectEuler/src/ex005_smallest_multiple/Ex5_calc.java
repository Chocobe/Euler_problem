package ex005_smallest_multiple;

public class Ex5_calc {
	
	/***
	 * gcd : Greatest Common Divisor (�ִ� �����)
	 * 
	 * �ڹٿ��� �ִ������� ���� �޼��尡 ���� ���� �ʴ´�.
	 * �����Ͽ� �������.
	 */
	public static int gcd(int _lhs, int _rhs) {
		
		if(_lhs == 0 || _rhs == 0) { return 0; }
		
		int gcd = 1;			// �ִ�����
		int temp_quotient = 0;	// ���� �����ϱ� ���� �ӽú���
		int target_num = _lhs;	// ������ (�������� ���� ������ ��)
		int comp_num = _rhs;	// ������	(�������� ���� ������ ��)
		
		// �������� ũ�⸸ŭ �ݺ� ����
		for(int i = 1; i < _lhs - 1; i++) {
			
			// �������� ���������� ������ ������ ��,
			if(target_num % i == 0) {
				
				// �������� ���������� ���� �� ���� (���� ū ������� ���ϴ� ���)
				temp_quotient = target_num / i;
				
				// �������� ����� �������� ������ �������� ���,
				if(comp_num % temp_quotient == 0) {
					
					// ������� �ȴ�. (�������� ��� ��, ū�������� ���� �߱� ������, ���� �Ҽ� �� ���� ū ����� �ȴ�.)
					gcd *= temp_quotient;
					
					// ����� ��, �Ҽ��� ����ū ���̹Ƿ�, �ߺ��� �����ϱ� ���� ���� ��ο� �����ش�.
					target_num /= temp_quotient;
					comp_num /= temp_quotient;
				}
			}
		}
		
		return gcd;
	}
}
