package ex034_digit_factorials;

public class Ex34_func {

	/***
	 * ���丮�� ����
	 * 
	 * �Ű����� :
	 * 		int _val : ���
	 * 
	 * ��ȯ�� :
	 * 		int���� ��� ���丮��
	 * 
	 * TESTed
	 */
	private static int factorial(int _val) {
		int factorial = 1;
		
		for(int i = 1; i <= _val; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
	
	
	/***
	 * �� ������ ���丮���� ��
	 * 
	 * �Ű����� :
	 * 		int _val : ���
	 * 
	 * ��ȯ�� :
	 * 		int�� �� ���ڵ��� ���丮�� ��
	 * 
	 * TESTed
	 */
	public static int digit_factorial(int _val) {
		// ����� ���ڿ���
		String str_val = String.valueOf(_val);
		int total_sum = 0;		// ���ڵ��� ���丮�� �� ��
		int cur_digit = 0;		// ���� ����
		
		
		
		for(int i = 0; i < str_val.length(); i++) {
			// ���� ������ ���丮�� ���
			cur_digit = Integer.parseInt(str_val.substring(i, i + 1));
			// ���丮�� ����
			total_sum += factorial(cur_digit);
		}
		
		return total_sum;
	}
	
	
	/***
	 * �迭�� �ε��� �߰�
	 * 
	 * �Ű����� :
	 * 		int _val : ���
	 * 		int[] _arr : ���迭
	 * 
	 * ��ȯ�� :
	 * 		����� �߰��� int[]��
	 * 
	 * TESTed
	 */
	public static int[] add_idx(int _val, int[] _arr) {
		int len = _arr.length;				// �Է¹��� �迭�� ����
		int[] temp_arr = new int[len + 1];	// �ӽù迭
		
		// �Է¹��� �迭�� �״�� ����
		for(int i = 0; i < len; i++) {
			temp_arr[i] = _arr[i];
		}
		// ������ �ε����� ��� �߰�
		temp_arr[len] = _val;
		
		return temp_arr;
	}
	
	
	/***
	 * ���� �Ѱ谪 ����
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		int�� �Ѱ谪
	 * 
	 * TESTed
	 */
	public static int loop_limit() {
		int max_digit = 0;		// �ִ밪
		int sum_factorial = 0;	// �� ���ڵ��� ���丮�� ���� ��
		String str_digit = "9";	// �ִ밪 ������ ���� ���� ���ڿ�
		
		while(true) {
			max_digit = Integer.valueOf(str_digit);		// ���� ���ڿ��� int������
			sum_factorial = digit_factorial(max_digit);	// ���丮���� �� ����
			
			// �������� ���丮���� �� ���� ũ�ٸ�, ����
			if(max_digit > sum_factorial) {
				break;
			}
			
			// ������ ����
			str_digit = str_digit.concat("9");
		}
		
		return max_digit;
	}
}