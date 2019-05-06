package ex028_number_spiral_diagonals;

public class Ex28_calc {
	
	int sum;		// �� (������ �����) 
	int last_num;	// ������ ���갪
	
	/***
	 * ������ �밢���� ��ü ���
	 * 
	 * �Ű����� :
	 * 		int _length : �밢���� ���̰�
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 */
	public void calc_diagonal(int _length) {
		// �밢�� ���� ���� ���� Ƚ���� ����
		int loop_val = (_length - 1) / 2;
		
		for(int i = 0; i <= loop_val; i++) {
			calc_partial(i);
		}
	}
	
	
	/***
	 * �Է�n ���� ���� ���� �ܰ��� �𼭸��� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _sequence_num : ���� ���� ��ȣ
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 */
	public void calc_partial(int _sequence_num) {
		// �Է°��� 0�� ���,
		if(_sequence_num == 0) {
			this.sum = 1;
			this.last_num = 1;
			
			return;
		}
		
		// �Է°��� 0 �̿��� ���,
		for(int i = 0; i < 4; i++) {
			
			this.last_num += (_sequence_num * 2);
			this.sum += this.last_num;			
		}
	}
	
}
