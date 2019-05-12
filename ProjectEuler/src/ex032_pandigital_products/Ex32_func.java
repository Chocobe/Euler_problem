package ex032_pandigital_products;

public class Ex32_func {

	/***
	 * �¼�, �ǽ¼�, ������� String������ ������ ��, String�� ���� == 9 ��
	 * 
	 * �Ű����� :
	 * 		int _lhs	: ������
	 * 		int _rhs	: ������
	 * 		int _result	: �����
	 * 
	 * ��ȯ�� :
	 * 		String������ _lhs + _rhs + _result
	 * 		(��ȯ���� ""�� ���� String�� ���̰� 9�� �ƴ� ���) 
	 * 
	 * TESTed
	 */
	public static String len_check(int _lhs, int _rhs, int _result) {
		
		String lhs = String.valueOf(_lhs);			// ������ ���ڿ�
		String rhs = String.valueOf(_rhs);			// ������ ���ڿ�
		String result = String.valueOf(_result);	// ���� ����� ���ڿ�
		
		String united_string = lhs + rhs + result;	// �� ���ڿ��� ��
		
		// ���ڿ��� ���� ���̰� == 9,
		if(united_string.length() == 9) {
			// ���� ���ڿ� ��ȯ
			return united_string;
			
		// ���ڿ��� ���� ���̰� != 9
		} else {
			// ���� ��ȯ
			return "";
		}
	}
	
	
	/***
	 * �Է� ���ڿ��� 1~9������ �� ���� Ȯ��
	 * 
	 * �Ű����� :
	 * 		String _united_string	: ���յ� ���ڿ�
	 * 
	 * ��ȯ�� :
	 * 		true	: 1 ~ 9���� ���ڰ� �� ����
	 * 		false	: ���� x
	 * 
	 * TESTed
	 */
	public static boolean check_pandigital(String _united_string) {
		// ���� ���� ���ڿ� (������)
		String cur_loop = "";
		
		for(int i = 1; i < 10; i++) {			
			cur_loop = String.valueOf(i);
			// �������� ������,
			if(_united_string.indexOf(cur_loop) == -1) {
				// false ��ȯ
				return false;
			}
		}
		
		// �������� ��� �����Ѵٸ�,
		return true;		
	}
	
	
	/***
	 * �Է°��� �Է¹迭�� ���� ���, ����
	 * 
	 * �Ű����� :
	 * 		int _val	: �Է°�
	 * 		int[] _repo	: �Է¹迭
	 * 
	 * ��ȯ�� :
	 * 		int[] _repo	: ��� �迭
	 */
	public static int[] check_duplication(int _val, int[] _repo) {
		int len = _repo.length;
		int[] result_arr;
		
		// �ߺ��� ���, �Է¹迭 �״�� ��ȯ
		for(int i = 0; i < len; i++) {
			if(_val == _repo[i]) {
				return _repo;
			}
		}
		
		result_arr = new int[len + 1];
		for(int i = 0; i < len; i++) {
			result_arr[i] = _repo[i];
		}
		result_arr[len] = _val;
		
		return result_arr;
	}
}