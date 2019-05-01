package ex024_lexicographic_permutations;

public class Ex24_func {
	
	/***
	 * ���丮�� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _digit : ���ϰ��� �ϴ� ���丮��
	 * 
	 * ��ȯ�� :
	 * 		int�� ���丮��
	 */
	public static int pactorial(int _digit) {
		int pactorial = 1;
		
		for(int i = 1; i <= _digit; i++) {
			pactorial *= i;
		}
		
		return pactorial;
	}
	
	
	/***
	 * �Ű����� ������ ���� ��ȯ
	 * 
	 * �Ű����� :
	 * 		int _order_num : ������ ���� ��ȣ
	 * 
	 * ��ȯ�� :
	 * 		long�� ������
	 */
	public static long permutation(int _order_num) {
		
		// ������
		long permutation = 0;
		String str_permutation = "";
		
		// ����� ������ Ȯ���� ���� �÷��� �迭
		int[] digit_arr = new int[10];
		for(int i = 0; i < digit_arr.length; i++) {
			digit_arr[i] = 1;
		}
		
		int quotient = 0;		// ��
		int rest = _order_num;	// ������
		int cur_pactorial = 0;	// ���� ������ ���丮�� ��
		int idx_cnt = 0;		// �ε��� ������ ����
		
		for(int i = 9; i >= 0; i--) {
			// ���� ������ ���丮�� ���
			cur_pactorial = pactorial(i);
			// �� (�Ű����� / ���丮��)
			quotient = rest / cur_pactorial;
			// ������ (�Ű����� / ���丮��)
			rest %= cur_pactorial;
			// ���� �ε��� ���� �ʱ�ȭ
			idx_cnt = 0;
			
			switch(rest) {
			// ������ == 0
			case 0:
				for(int j = 0; j < 10; j++) {
					if(digit_arr[j] == 1) {
						idx_cnt++;
					}
					
					if(idx_cnt == quotient) {
						str_permutation += String.valueOf(j);
						// �������� ����
						digit_arr[j] = 0;
						break;
					}
				}
				
				for(int j = 9; j >= 0; j--) {
					if(digit_arr[j] == 1) {
						str_permutation += String.valueOf(j);
					}
				}
				// ��ü ���� ����
				i = 0;
				break;
				
			// ������ == 1
			case 1:
				for(int j = 0; j < 10; j++) {
					if(digit_arr[j] == 1) {
						idx_cnt++;
					}
					
					if(idx_cnt == quotient + 1) {
						str_permutation += String.valueOf(j);
						// �������� ����
						digit_arr[j] = 0;
						break;
					}
				}
				
				for(int j = 0; j < 10; j++) {
					if(digit_arr[j] == 1) {
						str_permutation += String.valueOf(j);
					}
				}
				i = 0;				
				break;
				
			// ������ == �� ��
			default:
				for(int j = 0; j < 10; j++) {
					// �������� Ȯ��
					if(digit_arr[j] == 1) {
						idx_cnt++;
					}
					
					// "�� + 1" ��° (���� �������� ����) �� ����
					if(idx_cnt == quotient + 1) {
						str_permutation += String.valueOf(j);
						// �������� ����
						digit_arr[j] = 0;
						break;
					}
				}
				break;					
			}
		}
		permutation = Long.parseLong(str_permutation);
				
		return permutation;
	}
}
