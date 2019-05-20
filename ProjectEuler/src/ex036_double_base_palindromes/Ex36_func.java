package ex036_double_base_palindromes;

public class Ex36_func {
	
	/***
	 * ȸ�� �˻�
	 * 
	 * �Ű����� :
	 * 		String _target : �˻� ���
	 * 
	 * ��ȯ�� :
	 * 		boolean	- true	: ȸ�� o
	 * 				- false	: ȸ�� x
	 * TESTed
	 */
	public static boolean is_palindrome(String _target) {
		int len = _target.length();
		int loop_limit = len / 2;
		String str_lhs = "";
		String str_rhs = "";
		
		for(int i = 0; i <= loop_limit; i++) {
			// ���� ���� ����
			str_lhs = _target.substring(i, (i + 1));
			// ���� ���� ����
			str_rhs = _target.substring((len - 1) - i, (len - i));
			
			// ���� != ���� �̶��, false
			if(str_lhs.compareTo(str_rhs) != 0) { return false; }
		}
		
		return true;
	}
	
	
	/***
	 * �迭�� �ε��� �߰�
	 * 
	 * �Ű����� :
	 * 		int _val	: ������ ��
	 * 		int[] _arr	: �߰��� �迭
	 * 
	 * ��ȯ�� :
	 * 		int[] �迭
	 * 
	 * TESTed
	 */
	public static int[] add_idx(int _val, int[] _arr) {
		int len = _arr.length;
		int[] result_arr = new int[len + 1];
		
		for(int i = 0; i < len; i++) {
			result_arr[i] = _arr[i];
		}
		result_arr[len] = _val;
		
		return result_arr;
		
	}
}