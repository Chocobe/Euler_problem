package ex035_circular_primes;

public class Ex35_func {
	
	/***
	 * �Ҽ� ���̺� �˻��ϱ�
	 * 
	 * �Ű����� :
	 * 		int _target		: �˻� ���
	 * 		int[] _table	: ���� ���� ���̺� �迭
	 * 
	 * ��ȯ�� :
	 * 		boolean��	- true	: ����� ���̺��� ����
	 * 					- false	: ����� ���̺� ����
	 * 
	 * TESTed
	 */
	private static boolean check_duplication(int _target, int[] _table) {
		// ���� ���̺� �迭�� ����
		int len = _table.length;
		
		// ��
		for(int i = 0; i < len; i++) {
			if(_target == _table[i]) { return true; }
		}
		
		return false;
	}
	
	
	/***
	 * �Ҽ� �Ǻ�
	 * 
	 * �Ű����� :
	 * 		int _target : ���
	 * 
	 * ��ȯ�� :
	 * 		boolean��	- true	: �Ҽ�o
	 * 					- false	: �Ҽ�x
	 * 
	 * TESTed
	 */
	private static boolean check_prime(int _target) {
		// �˻縦 ���� ���� �Ѱ谪 (������)
		int loop_limit = (int)Math.sqrt(_target);
		
		// ����� 0, 1 �� ���, ����ó�� (�Ҽ�x)
		if(_target == 0 || _target == 1) { return false; }
		
		for(int i = 2; i <= loop_limit; i++) {
			if(_target % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	/***
	 * ȸ���Ҽ� �Ǻ��ϱ�
	 * 
	 * �Ű����� :
	 * 		int _target	: ���
	 * 		int _table	: ���� ���̺�
	 * 
	 * ��ȯ�� :
	 * 		boolean��	- true	: ȸ���Ҽ�o
	 * 					- false	: ȸ���Ҽ�x
	 * 
	 * TESTed
	 */
	public static boolean check_circular_prime(int _target, int[] _table) {
		// ���� ���̺�� �ߺ� �˻�
		if(check_duplication(_target, _table)) { return false; }
		
		int int_target = _target;						// �˻���
		String str_target = String.valueOf(_target);	// �˻����� ���ڿ���
		String first_str = "";							// ù ��° ����
		int loop_limit = str_target.length();			// ����� ���ڿ� ����(�˻� Ƚ��)
		
		for(int i = 0; i < loop_limit; i++) {
			if(!check_prime(int_target)) { return false; }
			
			// ù��° ���� ����
			first_str = str_target.substring(0, 1);
			// ù���� ���� ����
			str_target = str_target.replaceFirst(first_str, "");
			// ù��° ���ڸ� ���� �ڷ�
			str_target = str_target.concat(first_str);
			// ����� ���ڿ� -> ���������� ����ȯ
			int_target = Integer.parseInt(str_target);
		}
		
		return true;
	}
	
	
	/***
	 * �迭 �߰��ϱ�
	 * 
	 * �Ű����� :
	 * 		int _target		: ���
	 * 		int[] _table	: ������ �迭
	 * 
	 * ��ȯ�� :
	 * 		����� �߰��� int[]
	 * 
	 * TESTed
	 */
	public static int[] add_idx(int _target, int[] _table) {
		// �Է¹��� �迭�� ����
		int len = _table.length;
		// ��� �迭
		int[] result_arr = new int[len + 1];
		
		// ������ ����
		for(int i = 0; i < len; i++) {
			result_arr[i] = _table[i];
		}
		// ������ �ε����� ��� ����
		result_arr[len] = _target;
		
		return result_arr;
	}
}