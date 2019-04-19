package ex012_highly_divisible_triangular_number_2;

public class Ex12_calc {
	
	/***
	 * �ﰢ�� ���ϱ�
	 * 
	 * �Ű����� : 
	 * 		int _size : �ﰢ���� �ִ� �μ���
	 * 
	 * ��ȯ�� :
	 * 		�ﰢ��
	 */
	public static int triangular_num(int _size) {
		
		// �ﰢ�� == (�ִ��μ��� * (�ִ��μ��� + 1)) / 2 
		return (_size + 1) * _size / 2;
	}
	
	/***
	 * �Ű������� ���� �μ� ���� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _target : �μ� ������ ���� Ÿ��
	 * 
	 * ��ȯ�� :
	 * 		�μ� ����
	 */
	public static int factor_cnt(int _target) {
		
		int factor_cnt = 1;								// �μ� ����(��ȯ�� ��)
		int temp_target = _target;						// �Է¹��� ���� �ӽ�����
		int loop_limit = (int)Math.sqrt(_target) + 2;	// �ִ� ���� Ƚ�� (�����ٰ� + 2)
		int exponent = 0;								// ����
		
		for(int i = 2; i <= loop_limit; i++) {
			
			exponent = 0;
			
			// ������(i) �� ���� ������ ������ �����ϴ� �κ�
			while(temp_target % i == 0) {	// �������� Ÿ��(�ӽ�)�� ����� ��쿡�� ����
				exponent++;					// ���� ������(i)�� ���� ���� 1�� ����
				temp_target /= i;			// ������ �ߺ� ����
			}
			
			//���� �ʿ�
			// if(exponent �� 0�� ��, exponent = 1;)
			// else(
			if(exponent != 0) {
				factor_cnt *= (exponent + 1); 	// "����"�� �̿��� "�μ� ���ϱ� ����"
												// a^m * b^n �� �μ� ������... (m + 1) * (n + 1) �̴�.
			}
		}		
		
		return factor_cnt;
	}	
}
