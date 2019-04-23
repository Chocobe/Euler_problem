package ex011_largest_product_in_a_grid;

public class Ex11_calc {

	/***
	 * �� -> �� ������ �ִ밪 ���� �޼��� (�������)
	 */	
	public static int horizen_mul(String[] _table, int _out_num) {
		
		int table_cnt = _table.length;					// ���̺� �迭�� ����
		int element_cnt = (_table[0].length() + 1) / 3;	// ���̺�� ������ ����
		int access_limit = element_cnt - _out_num;		// ���ٰ����� �ִ� ������ ����
		
		int max_mul = 1;			// �ִ� �����
		int cur_mul = 1;			// ���� �����
		String cur_string = "";		// ������ ���ڿ�
		int cur_num = 0;			// ������ ������
		int start_idx = 0;			// �������� �ε���
		
		for(int i = 0; i < table_cnt; i++) {			// ���̺�� ����
			for(int j = 0; j <= access_limit; j++) {	// ���� �ε��� ������ ����
				
				cur_mul = 1;	// ���� ����� �ʱ�ȭ
				
				for(int k = 0; k < _out_num; k++) {		// ���������� ���� ���ⰹ����ŭ ����
					
					start_idx = (j * 3) + (k * 3);		// ���ڿ� ���� �ε��� �ľ�
					
					cur_string = _table[i].substring(start_idx, start_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {		// �ִ� ������� ���� ������� �� �� ����
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;		
	}
	
	/***
	 * �� -> �� ������ �ִ밪 ���� �޼��� (��������)
	 */
	public static int vertical_mul(String[] _table, int _out_num) {
		
		int element_cnt = (_table[0].length() + 1) / 3;		// ���̺�� ������ ����
		int access_limit = element_cnt - _out_num;			// ���� ������ �ִ� �ε���
		
		int max_mul = 1;			// �ִ� �����
		int cur_mul = 1;			// ���� �����
		String cur_string = "";		// ������ ���ڿ�
		int cur_num = 0;			// ������ ������
		int start_idx = 0;			// �������� �ε���
		
		for(int i = 0; i <= access_limit; i++) {		// ������ �迭�� �ε��� ��
			for(int j = 0; j < element_cnt; j++) {		// ���� �����̱� ������ ������ ������ŭ ����
				
				cur_mul = 1;
				
				for(int k = 0; k < _out_num; k++) {		// �������� ���� ���� ��ŭ ����
					
					start_idx = j * 3;
					
					cur_string = _table[i + k].substring(start_idx, start_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;		
	}
	
	/***
	 * ���� ��� -> ���� �ϴ� ������ �ִ밪 ���� �޼��� (�밢��)
	 */
	public static int right_diagonal(String[] _table, int _out_num) {
		
		int element_cnt = (_table[0].length() + 1) / 3;		// ���̺�� ������ ����
		int access_limit = element_cnt - _out_num;			// ���� ������ �ִ� �ε���
		
		int max_mul = 1;			// �ִ� �����
		int cur_mul = 1;			// ���� �����
		String cur_string = "";		// ���� ���ڿ�
		int cur_num = 0;			// ���� ������
		
		int start_row_idx = 0;		// �������� �ε���
		int start_col_idx = 0;		// ���ڿ��� ���� �ε���
		
		for(int i = 0; i <= access_limit; i++) {
			for(int j = 0; j <= access_limit; j++) {
				
				cur_mul = 1;
				
				for(int k = 0; k < _out_num; k++) {
					
					start_row_idx = i + k;
					start_col_idx = ((j + k) * 3);
					
					cur_string = _table[start_row_idx].substring(start_col_idx, start_col_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;
	}
	
	/***
	 * ���� ��� -> ���� �ϴ� ������ �ִ밪 ���� �޼��� (���밢��)
	 */
	public static int left_diagonal(String[] _table, int _out_num) {
		
		int element_cnt = (_table[0].length() + 1) / 3;		// ���̺�� ������ ����
		
		int max_mul = 1;			// �ִ� �����
		int cur_mul = 1;			// ���� �����
		String cur_string = "";		// ���� ���ڿ�
		int cur_num = 0;			// ���� ������
		
		int start_row_idx = 0;		// �������� �ε���
		int start_col_idx = 0;		// ���ڿ��� ���� �ε���
		
		int access_limit = element_cnt - _out_num;		// ���� ������ �ִ� �ε���
		
		for(int i = 0; i <= access_limit; i++) {
			for(int j = 0; j <= access_limit; j++) {
				
				cur_mul = 1;
				
				for(int k = 0; k < _out_num; k++) {
					
					start_row_idx = (i + k);
					start_col_idx = ((element_cnt - 1) - (j + k)) * 3;
					
					cur_string = _table[start_row_idx].substring(start_col_idx, start_col_idx + 2);
					cur_num = Integer.parseInt(cur_string);
					
					cur_mul *= cur_num;
				}
				
				if(cur_mul > max_mul) {
					max_mul = cur_mul;
				}				
			}
		}
		
		return max_mul;
	}
}
