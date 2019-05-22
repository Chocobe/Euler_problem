package ex038_pandigital_multiples;

public class Ex38_func {
	
	// pandigital number class
	public class digit_9_number {
		int target_number;		// ���
		int multiplier;			// �¼� 
		String concat_number;	// ����� pandigital number
		
		// ������
		public digit_9_number(int _target, int _multiplier, String _concat) {
			this.target_number = _target;
			this.multiplier = _multiplier;
			this.concat_number = _concat;
		}
	}
	
	
	// pandigital numbers �迭
	public digit_9_number[] pandigital_numbers;
	
	
	/***
	 * ������
	 * 
	 * 		���������� pandigital numbers�� ���� ��ü�� ����� ����.
	 */
	public Ex38_func() {
		this.pandigital_numbers = new digit_9_number[0];
		
		digit_9_number cur_obj;		// ���� ������ ��ü��
		int target = 0;				// ���
		
		// 9�ڸ��� ���� �ʴ� ���� 10000���� �ݺ�
		while(target < 10000) {
			// ��� ����
			target++;
			// 9�ڸ� ����
			cur_obj = make_9_digit(target);
			
			// 9�ڸ��� �ƴϸ�, ���� ����
			if(cur_obj == null) {
				continue;
				
			// 9�ڸ��� ���,
			} else {
				// pandigital number �˻�
				if(check_pandigital(cur_obj)) {
					// pandigital number�� ���, ����
					add_idx(cur_obj);
				}
			}
		}
	}
	
	
	/***
	 * digit_9_number[]�� �ε��� �߰��ϱ�
	 * 
	 * �Ű����� :
	 * 		digit_9_number _obj : �߰��� ��ü
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	private void add_idx(digit_9_number _obj) {
		int len = this.pandigital_numbers.length;
		digit_9_number[] result_arr = new digit_9_number[len + 1];
		
		for(int i = 0; i < len; i++) {
			result_arr[i] = this.pandigital_numbers[i];
		}
		result_arr[len] = _obj;
		
		this.pandigital_numbers = result_arr;
		
		return;
	}
	
	
	/***
	 * 9�ڸ� �� �����
	 * 
	 * �Ű����� :
	 * 		int _target : ���
	 * 
	 * ��ȯ�� :
	 * 		9�ڸ��� ��� : digit_9_number�� ��
	 * 		�� �̿� : null
	 * 
	 * TESTed
	 */
	public digit_9_number make_9_digit(int _target) {
		String str_concat = "";		// ����� ���ڿ�
		String str_cur_val = "";	// ���� ���� ���ڿ�
		int multiplier = 0;			// �¼�
		int cur_product = 0;		// ���� ���� ��
		
		// ����� ���ڿ��� ���̸� 9�� ����� �κ�
		while(str_concat.length() < 9) {
			// �¼� ����
			multiplier++;
			// ���� �� ����
			cur_product = _target * multiplier;
			
			// ���� ���� ���ڿ�
			str_cur_val = String.valueOf(cur_product);
			// ����� ���ڿ� ����
			str_concat = str_concat.concat(str_cur_val);
		}
		
		// ���ڿ� ���� == 9 ���, digit_9_number��ü ��ȯ
		if(str_concat.length() == 9) {
			digit_9_number result_obj = new digit_9_number(_target, multiplier, str_concat);
		
			return result_obj;
			
		// �� ��, null ��ȯ
		} else {
			return null;
		}
	}
	
	
	/***
	 * pandigital number �˻�
	 * 
	 * �Ű����� :
	 * 		digit_9_number _target : 9�ڸ� ���� ��ü
	 * 
	 * ��ȯ�� :
	 * 		boolean - true	: pandigital number o
	 * 				- false	: pandigital number x
	 * 
	 * TESTed
	 */
	public boolean check_pandigital(digit_9_number _target) {

		String concat_str = _target.concat_number;		// �˻� ���ڿ�
		String cur_string = "";
		for(int i = 1; i < 10; i++) {
			
			// �������� �˻����� �ʴ´ٸ�, false
			cur_string = String.valueOf(i);
			if(concat_str.indexOf(cur_string) == -1) {
				return false;
			}
		}
		
		// ��� �˻� �Ǿ��ٸ�, true
		return true;
	}
}