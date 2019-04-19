package ex013_large_sum;

public class Ex13_func {

	/***
	 * ���ڿ��� long�� �迭�� ��ȯ
	 * 
	 * �Ű����� :
	 * 		String _origin	: �Է� ���ڿ�
	 * 		int _arr_size	: �迭�� ũ��
	 * 		int _data_len	: ���ҵ� �������� ����
	 * 
	 * ��ȯ��
	 * 		ũ�Ⱑ _arr_size �� long�� �迭
	 */
	public static long[] decomposition(String _origin, int _arr_size, int _data_len) {
		
		long[] result_arr = new long[_arr_size];	// ��ȯ�� �迭
		String temp_arr = "";						// ���ڿ��� ���� ����
		
		int begin_idx = 0;	// ���� �ε���
		int end_idx = 0;	// �� �ε���
		
		for(int i = 0; i < _arr_size; i++) {
			
			begin_idx = _data_len * i;			// ���� �ε��� ����
			end_idx = begin_idx + _data_len;	// �� �ε��� ����
			
			temp_arr = _origin.substring(begin_idx, end_idx);	// ���ڿ��� ����
			result_arr[i] = Long.parseLong(temp_arr);			// long������ ����
		}
		
		return result_arr;
	}
	
	
	/***
	 * sour�迭�� ���� dest�迭�� �ջ� (�� �ε��� ���� �ջ�)
	 * 
	 * �Ű����� :
	 * 		long[] _dest : ������ (������ �κ�)
	 * 		long[] _sour : �ҽ�(���� �κ�)
	 */
	public static void idx_summation(long[] _dest, long[] _sour) {
		int arr_dest = _dest.length;	// ���� �迭�� ũ��
		int arr_sour = _sour.length;	// �ҽ� �迭�� ũ��
		
		// �� �迭�� ũ�Ⱑ �ٸ� ���, �������� & ����
		if(arr_dest != arr_sour) {
			System.out.println("Error] : �� �迭�� ũ�Ⱑ �ٸ�");
			return;
		}
		
		// ��Ī�Ǵ� �ε����� �� ���ϱ�
		for(int i = 0; i < arr_dest; i++) {
			_dest[i] += _sour[i];
		}
	}
	
	
	/***
	 * �ø���(carry) ���ϱ�
	 * 
	 * �Ű����� :
	 * 		long _data : �ø����� ������ ��
	 * 		int _digit_num : ���� �ڸ���
	 * 
	 * ��ȯ�� :
	 * 		�߻��� �ø��� ��
	 */
	public static long calc_carry(long _data, int _digit_num) {
		long carry = 0;
		
		carry = (long)(_data / Math.pow(10, _digit_num));
		
		return carry;
	}
}
