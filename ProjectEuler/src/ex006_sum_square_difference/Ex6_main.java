package ex006_sum_square_difference;

public class Ex6_main {
	public static void main(String[] args) {
		
		int max_num = 100;		// ������ �ִ밪
		
		int sum = 0;			// �հ�
		int square_of_sum = 0;	// ���� ����
		int sum_of_square = 0;	// ������ ��
		int target_num = 0;		// ���
		
		int diff_val = 0;		// ���̰�(�����)
		
		for(int i = 0; i < max_num; i++) {
			target_num = max_num - i;
			
			sum += target_num;
			sum_of_square += (int)Math.pow(target_num, 2);
			
		}
		
		square_of_sum = (int)Math.pow(sum, 2);
		
		if(square_of_sum > sum_of_square) {
			diff_val = square_of_sum - sum_of_square;
		
		} else {
			diff_val = sum_of_square - square_of_sum;
			
		}
		
		System.out.println("���̰��� : " + diff_val);
		
	}
}