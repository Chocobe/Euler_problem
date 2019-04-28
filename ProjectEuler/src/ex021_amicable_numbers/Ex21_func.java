package ex021_amicable_numbers;

public class Ex21_func {
	
	/***
	 * ������ ������ ����� �� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _val : ���ϰ��� �ϴ� ���
	 * 
	 * ��ȯ�� :
	 * 		int���� ������ ������ ����� ��
	 * 
	 *  TEST Completion.
	 */
	public static int sum_of_divisor(int _val) {
		int sum = 0;				// �� ��
		int cur_quotient = 0;		// ���� ��
		int min_quotient = _val;	// ���� �ּҰ�
		
		// ���� ���� �򺸴� ������ ���� ����
		for(int i = 1; i < min_quotient; i++) {
			// ����� ���,
			if(_val % i == 0) {
				// ���� ��
				cur_quotient = _val / i;
				// ���� ��� ������ ���Ѵ�.
				sum = sum + cur_quotient + i;
				// �ּ� �� ����
				min_quotient = cur_quotient;
			}
		}
		
		if(sum != 0) {
			sum -= _val;
		}
		
		return sum;
	}
	
	/***
	 * �迭�� �ش� ���� �ִ��� �˻�
	 * 
	 * �Ű����� :
	 * 		int[] _arr	: �˻��� �迭
	 * 		int _val	: �ش� ��
	 * 
	 * ��ȯ�� :
	 * 		boolean - ���� ��� : true
	 * 				- ���� ��� : false
	 * 
	 * TEST Completion.
	 */
	public static boolean check_overlap(int[] _arr, int _val) {
		boolean check = false;		// �� ���
		int arr_len = _arr.length;	// �迭�� ����
		
		for(int i = 0; i < arr_len; i++) {
			// ���� ���� �ִٸ�,
			if(_arr[i] == _val) {
				check = true;
			}
		}
		
		return check;
	}
	
	/***
	 * �迭�� index �߰��Ͽ�, �Է°� ����
	 * 
	 * �Ű����� :
	 * 		int[] _arr	: ��� �迭
	 * 		int _val_1	: ������ �� 1
	 * 		int _val_2	: ������ �� 2
	 * 
	 * ��ȯ�� :
	 * 		����
	 */
	public static int[] add_idx(int[] _arr, int _val_1) {
		// �Ű����� �迭�� ����
		int arr_len = _arr.length;
		// ������ �迭 ����
		int[] arr = new int[arr_len + 1];
		
		// �Ű������� �迭 ����
		for(int i = 0; i < arr_len; i++) {
			arr[i] = _arr[i];
		}
		
		// �Ű������� ����
		arr[arr_len] = _val_1;
		
		return arr;
	}
}