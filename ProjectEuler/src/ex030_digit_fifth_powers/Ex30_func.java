package ex030_digit_fifth_powers;

public class Ex30_func {
	
	int[] ref_table;	// ���� ���̺�
	int exponent;		// ���� ������
	
	
	/***
	 * ������
	 * 
	 * �Ű����� :
	 * 		int _exponent : ���� ������
	 * 
	 * TESTed
	 */
	public Ex30_func(int _exponent) {
		this.ref_table = new int[10];	// ���� �迭
		this.exponent = _exponent;		// ���� ������
		
		// ���� ���̺� ������ ����
		set_table();
	}
	
	
	/***
	 * �Է°��� �迭�� �߰��Ͽ� ��ȯ
	 * 
	 * �Ű����� :
	 * 		int[] _dest	: ���� �迭
	 * 		int _sour	: ������ ��
	 * 
	 * ��ȯ�� :
	 * 		������ ���� �߰��� int[]
	 * 
	 * TESTed
	 */
	public int[] insert_arr(int[] _dest, int _sour) {
		int len = _dest.length + 1;
		int[] result_arr = new int[len];
		
		for(int i = 0; i < _dest.length; i++) {
			result_arr[i] = _dest[i];
		}
		result_arr[len - 1] = _sour;
		
		return result_arr;
	}
	
	
	/***
	 * �ν��Ͻ� ���� ���
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void get_table() {
		for(int i = 0; i < 10; i++) {
			System.out.println("[" + i + "] : " + ref_table[i]);
		}
	}
	
	
	/***
	 * ���� ���̺� ���� �޼���
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	private void set_table() {
		for(int i = 0; i < 10; i++) {
			this.ref_table[i] = (int)Math.pow(i, this.exponent);
		}
	}
	
	
	/***
	 * �ִ� �ڸ��� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public int calc_max_digit() {
		int sum = 0;			// �հ�
		int sum_cnt = 0;		// ������ ���� ����
		String string_sum;		// �հ��� ���ڿ���
		
		while(true) {
			sum += this.ref_table[9];
			sum_cnt++;
			string_sum = String.valueOf(sum);
			
			if(string_sum.length() == sum_cnt) {
				return sum_cnt;
			}
		}
	}
	
	
	/***
	 * ���� �� �������� ��ġ ��
	 * 
	 * �Ű����� :
	 * 		int[] _used_digit : ����� ������ �迭
	 * 
	 * ��ȯ�� :
	 * 		int��	: -1 : ���ǿ� ���� ���� ���
	 * 				: 0���� ū ���� : ���ǿ� �´� ��
	 * 
	 * TESTed
	 */
	public int comp_digit(int[] _used_digit) {
		
		int sum = 0;				// ����
		String string_sum;			// �� ���� ���ڿ���
		String temp_digit = "";	// ���� ������ ���ڿ���
		int first_zero = 0;			// ���ڸ� 0�� ����
		
		// ��ü �� ����
		for(int i = 0; i < _used_digit.length; i++) {
			sum += this.ref_table[_used_digit[i]];
		}
		string_sum = String.valueOf(sum);
		
		if(sum == 1 || sum == 0) {
			return -1;
		}
		
		// ���ڸ� 0�� ���� �ľ�
		first_zero = _used_digit.length - string_sum.length();
		// ������ 0�� ������ŭ String���� 0 �߰�
		for(int i = 0; i < first_zero; i++) {
			temp_digit = temp_digit.concat("0");
		}
		string_sum = temp_digit.concat(string_sum);
		
		// �� �ڸ����� ��
		for(int i = 0; i < _used_digit.length; i++) {
			String used_char = String.valueOf(_used_digit[i]);
			String comp_char = string_sum.substring(i, i + 1);

			// ���Ͽ� �ٸ����(0 �̿��� ��),
			if(used_char.indexOf(comp_char) != 0) {
				// -1�� ��ȯ & �޼��� ����
				return -1;
			}		
		}
		
		return sum;
	}
}