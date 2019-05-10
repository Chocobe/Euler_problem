package ex031_coin_sums;

public class Ex31_func {
	private int[] coin_table;	// ���ΰ� ���̺�
	private int combine_way;	// ���� ��� ����
	
	/***
	 * ������ (�ν��Ͻ� �ʱ�ȭ)
	 * 
	 * �Ű����� :
	 * 		int[] _table : ���ΰ��� ���� ���� ���̺� �迭
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public Ex31_func(int[] _table) {
		this.coin_table = _table;
		combine_way = 0;
	}
	
	
	/***
	 * ���� ��� ������ ���
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		int�� ���� ��� ��
	 */
	public int get_combine() {
		return this.combine_way;
	}
	
	
	/***
	 * ���̺� ���
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void print_coin_table() {
		for(int i = 0; i < this.coin_table.length; i++) {
			System.out.println(this.coin_table[i]);
		}
	}
	
	
	/***
	 * ���� ��� ���� ����ϱ� ���� ���ο��� ȣ��� �޼���
	 * 
	 * �Ű����� :
	 * 		int _target : ������ ���
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void combine_ways(int _target) {
		this.combine_way = 0;
		
		int table_len = this.coin_table.length;
		int idx = 0;
		int limit = 0;
		
		// coin_table���� �� ��, ���갡���� ���� ū �� ����
		for(idx = 0; idx < table_len; idx++) {
			limit = _target / this.coin_table[idx];
			
			// ���� ���� ���, ���� idx, limit�� �ʱⰪ ���
			if(limit > 0) {
				break;
			}
		}
		
		// ���� ��� ����
		calc_way(_target, idx, limit);
		
		// _target == 0�� ���, ����ó��
		if(_target == 0) {
			this.combine_way = 0;
		}
		
		// ��� ���
		System.out.println("��� : " + _target);
		System.out.println("���� ��� �� : " + this.combine_way);
	}
	
	
	/***
	 * ���� ����� ����� �� ���� (Ŭ���� ���ο�
	 * 
	 * �Ű����� :
	 * 		int _target	: ������ ���
	 * 		int _idx	: coin table�� �ε��� ��ȣ
	 * 		int _limit	: ���� ������ �Ѱ谪
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	private void calc_way(int _target, int _idx, int _limit) {
		// ���� ������ p5�� �̻��� ���, ��� ȣ���� ���� ����
		if(_idx < this.coin_table.length - 1) {
			for(int cur_coin = _limit; cur_coin >= 0; cur_coin--) {
				
				// ���� �������� ���� ��󰪿��� �� �������� ����
				int next_target = _target - (this.coin_table[_idx] * cur_coin);
				
				// ���� ������ �Ѱ谪 ����
				int next_limit = next_target / this.coin_table[_idx + 1];
				
				// ��� ȣ��
				calc_way(next_target, (_idx + 1), next_limit);
			}
			
		// ���� ������ p2���� ���,
		} else {
			// ���չ�� 1�� ����
			this.combine_way++;
		}
	}
}
