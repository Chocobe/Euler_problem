package ex017_number_letter_counts;

public class Ex17_main {	
	public static void main(String[] args) {
		
		int[] letter_table = new int[1001];	// ���� ���� ���̺�
		
		final int letter_and = 3;			// "and"�� ���� ����
		
		// �⺻ ������ ����
		letter_table[1]  = 3;
		letter_table[2]  = 3;
		letter_table[3]  = 5;
		letter_table[4]  = 4;
		letter_table[5]  = 4;
		letter_table[6]  = 3;
		letter_table[7]  = 5;
		letter_table[8]  = 5;
		letter_table[9]  = 4;
		letter_table[10] = 3;
		
		letter_table[11] = 6;
		letter_table[12] = 6;
		letter_table[13] = 8;
		letter_table[14] = 8;
		letter_table[15] = 7;
		letter_table[16] = 7;
		letter_table[17] = 9;
		letter_table[18] = 8;
		letter_table[19] = 8;
		
		letter_table[20] = 6;
		letter_table[30] = 6;
		letter_table[40] = 5;
		letter_table[50] = 5;
		letter_table[60] = 5;
		letter_table[70] = 7;
		letter_table[80] = 6;
		letter_table[90] = 6;
		
		letter_table[100] = 10;
		letter_table[200] = 10;
		letter_table[300] = 12;
		letter_table[400] = 11;
		letter_table[500] = 11;
		letter_table[600] = 10;
		letter_table[700] = 12;
		letter_table[800] = 12;
		letter_table[900] = 11;
		
		letter_table[1000] = 11;
		

		
		// ����� ����
		int cur_digit_num = 0;			// ���� ����
		int cur_temp = 0;				// ���� ������ ������ ���� ����
		int total_letter_num = 0;		// �� ���� ����		

		
		// �����
		for(int i = 1; i <= 1000; i++) {
			
			// �������� �ʱ�ȭ
			cur_digit_num = 0;
			cur_temp = 0;
			
			// ���� ���̺� ���� ���ٸ�, ����
			if(letter_table[i] == 0) {
				
				if(i >= 100) {
					
					// cur_temp = (100���� �� ���� * 100)
					cur_temp = (divide_digit(i, 2) * 100);
					//  ���� ������ ���� �� = letter_table[cur_temp]
					cur_digit_num = letter_table[cur_temp];					
					
					// 10�� �ڸ� & 1�� �ڸ� �� = i - cur_temp
					cur_temp = i - cur_temp;
					
					if(cur_temp != 0) {
					// total_letter_num += letter_table[cur_temp] + letter_and;
						cur_digit_num += letter_table[cur_temp] + letter_and;
					}
					
				} else {
					if(i >= 20) {
						
						// cur_temp = (10���� �� ���� * 10)
						cur_temp = (divide_digit(i, 1) * 10);
						
						// total_letter_num += letter_table[cur_temp];
						cur_digit_num = letter_table[cur_temp];
										
						// 1�� �ڸ� ���� ���� = i - cur_temp
						cur_temp = i - cur_temp;
						//total_letter_num += letter_table[cur_temp]
						if(cur_temp != 0) {
							cur_digit_num += letter_table[cur_temp];
						}
						
					} else {
						
						// total_letter_num += letter_table[i]
						total_letter_num += letter_table[i];
						continue;
						
					}
				}
				
				// ���̺� ����
				// �� ���ڼ� ������ ������ ���ڼ� ���ϱ�
				total_letter_num += cur_digit_num;
				// ���̺� ���簪 ����
				letter_table[i] = cur_digit_num;
				
			// ���� ���̺� ���� �����Ѵٸ�, �� ����
			} else {
				total_letter_num += letter_table[i];
				
			}
		}
		
		System.out.println("1���� 1000������ �� ���� ���� : " + total_letter_num);	
	}
	
	
	/***
	 * �Ű������� �ڸ��� ���� ���� (123�� 100�ڸ� ���� ���� -> ��ȯ�� : 1)
	 * 
	 * �Ű����� :
	 * 		int _target : ��� ����
	 * 		int _exponent : 10�� ������
	 * 
	 * ��ȯ�� :
	 * 		�ش� �ڸ����� ����. (321�� 100�ڸ� ���� ���� �� -> ��ȯ�� : 3)
	 */
	public static int divide_digit(int _target, int _exponent) {
		
		int result_digit = 0;		// �ش� �ڸ����� ��
		
		result_digit = _target / (int)(Math.pow(10,_exponent));
		
		return result_digit;
		
	}
}
