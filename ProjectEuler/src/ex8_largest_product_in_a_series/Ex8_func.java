package ex8_largest_product_in_a_series;

/***
 * ���ڿ��� ���� ���� �޼��� ���� Ŭ����
 */
public class Ex8_func {
	
	/***
	 * �޼��� : �Է¹��� ���ڿ��� �� ���� ���������� ���� �� ����
	 * 
	 * < TESTed >
	 */
	public static long partial_mul(String _target) {
		
		int target_len = _target.length();	// �Է¹��� ���ڿ��� ����
		String temp_string = "";			// ������ ���� ���ڿ���
		int temp_digit = 0;					// ������ ���� ������
		
		long result_val = 1L;				// �����
		
		for(int i = 0; i < target_len; i++) {
			temp_string = _target.substring(i, i + 1);
			temp_digit = Integer.parseInt(temp_string);
			
			result_val *= temp_digit;
		}
		
		return result_val;
	}
}






















