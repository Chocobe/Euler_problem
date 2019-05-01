package ex023_non_abundant_sums;

public class Ex23_func {
	
	/***
	 * ��� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _data : �Է°�
	 * 
	 * ��ȯ�� :
	 * 		int�� ����� �� (�ڱ� �ڽ��� ����)
	 */
	public static int sum_of_divisor(int _data) {
		
		int sum = 0;				// ����� ��
		int min_quotient = _data;	// �ּ� ��
		
		for(int i = 1; i < min_quotient; i++) {
			// i �� ������,
			if(_data % i == 0) {
				// �ּ� �� ����
				min_quotient = _data / i;
				
				// ������ ���� ���ٸ�,
				if(i == min_quotient) {
					// �ߺ� ����
					sum += i;
					
				} else {
					sum = sum + i + min_quotient;
					
				}
			}
		}
		
		// �ڱ� �ڽ� ���� (_data�� 1�� ��� sum�� -1�� ����)
		if(sum != 0) {
			
			sum -= _data;
		}
		
		return sum;
	}
	
	
	/***
	 * �迭 �ε��� �߰��ϱ�.
	 * 
	 * �Ű����� :
	 * 		int[] _arr	: ������ �迭
	 * 		int _data	: ������ ��
	 * 
	 * ��ȯ�� :
	 * 		������ ���� �߰��� �迭
	 */
	public static int[] add_idx(int[] _arr, int _data) {
		
		// �Է¹��� �迭�� ����
		int arr_len = _arr.length;
		int[] result_arr = new int[arr_len + 1];
		
		for(int i = 0; i < arr_len; i++) {
			result_arr[i] = _arr[i];
		}
		
		// ������ �ε����� �Է°� ����
		result_arr[arr_len] = _data;
		
		return result_arr;
	}
}
