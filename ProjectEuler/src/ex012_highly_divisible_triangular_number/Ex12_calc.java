package ex012_highly_divisible_triangular_number;

public class Ex12_calc {

	/***
	 * "�ﰢ��" ���ϴ� �޼���
	 * 
	 * �Ű����� :
	 * 		int _size : �ﰢ���� �ִ� �μ���
	 * 
	 * ��ȯ�� :
	 * 		�ﰢ��
	 */
	public static long triangular_num(int _size) {
		
		long tri_num = 0;	// �ﰢ��
		
		for(int i = 1; i <= _size; i++) {
			
			tri_num += i;
		}
	
		return tri_num;
	}
	
	/***
	 * �Ű������� "�μ� ����"�� ���ϴ� �޼���
	 * 
	 * �Ű����� :
	 * 		int _target : �μ� ������ ���ϰ��� �ϴ� �Է°�
	 * 
	 * ��ȯ�� :
	 * 		�Է¹��� ���� "�μ� ����"
	 */
	public static int factor_cnt(long _target) {
		
		int factor_cnt = 0;		// �μ� ����
		
		for(long i = 1; i <= _target; i++) {
			
			if(_target % i == 0) {
				factor_cnt++;
			}
		}
		
		return factor_cnt;		
	}
}
