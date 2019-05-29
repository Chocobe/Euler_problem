package ex040_champernowne_constant;

public class Ex40_func {
	
	/***
	 * chapernowne �� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _target : ��� champernown�� ��ȣ�� (�Ҽ��� �ڸ��� ��ȣ)
	 * 
	 * ��ȯ�� :
	 * 		int�� champernown ���� 
	 */
	public static int get_champernowne(int _target) {
		
		// ����� 0���� ���, ����ó��
		if(_target == 0) { return -1; }
		
		int digit_cnt = 0;			// ���� ���������� �Ҽ��� �� ����
		int loop_num = 0;			// ���� ������ �� (int��)
		
		String str_num = "";		// ���� ������ �� (String��)
		int cur_str_len = 0;		// str_num�� ���ڿ� ���̰�
		
		int diff_cnt = 0;			// digit_cnt �� _target�� ���̰�
		int target_idx = 0;			// ����� �ε���
		int champernowne_digit = 0;	// ��ȯ��
		
		// ������ �Ҽ��� ������ �Ű����� ���� ������, �ݺ�
		while(_target > digit_cnt) {
			// ������ ����
			loop_num++;
			// ���� �������� ���ڿ���
			str_num = String.valueOf(loop_num);
			// ���ڿ��� ���̰� ����
			cur_str_len = str_num.length();
			
			// ���� �Ҽ��� ������ ����
			digit_cnt += cur_str_len;
		}
		
		// ���� �Ҽ��� ������ �Ű������� ���̰� ���
		diff_cnt = digit_cnt - _target;
		// ��� �ε��� ����
		target_idx = (cur_str_len - 1) - diff_cnt;
		
		// ��� �ε����� ����
		String str_digit = str_num.substring(target_idx, target_idx + 1);
		champernowne_digit = Integer.parseInt(str_digit);
		
		return champernowne_digit;
	}
}
