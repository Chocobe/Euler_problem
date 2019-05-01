package ex023_non_abundant_sums;

public class Ex23_main {
	public static void main(String[] args) {
		
		int limit_num = 28123;
		
		int[] abundant_num = new int[0];		// ǳ���� ���ڵ��� �迭
		int two_abundant_sum = 0;				// ���� �ΰ��� ǳ���� ������ ��
		
		// �ΰ��� ǳ���� ������ ���� �÷��� �迭
		int[] two_abundant_arr = new int[limit_num + 1];

		int sum_of_divisor = 0;					// ����� ��
		int limit_loop = 0;						// ������ �Ѱ谪
		
		long total_sum = 0L;					// �� ��
		long total_two_abundant = 0L;			// �� ǳ���� ������ ���� ����
		
		for(int i = 1; i <= limit_num; i++) {
			
			sum_of_divisor = Ex23_func.sum_of_divisor(i);
			
			// ǳ���� ���ڶ��, ����
			if(sum_of_divisor > i) {
				
				abundant_num = Ex23_func.add_idx(abundant_num, i);
			}
		}
		
		limit_loop = abundant_num.length;
		
		// �ΰ��� ǳ���� ������ �� ���ϱ�
		for(int i = 0; i < limit_loop; i++) {
			for(int j = i; j < limit_loop; j++) {

				two_abundant_sum = abundant_num[i] + abundant_num[j];
				
				// �� ǳ���� ������ ���� �Ѱ谪�� ������, ���� ����
				if(two_abundant_sum > limit_num) {
					// ���� �Ѱ谪 ���� (�Ѱ谪�� �Ѵ� �ε��� ����)
					limit_loop = j;
					break;
				}
				
				two_abundant_arr[two_abundant_sum] = 1;
			}
		}
		
		// �ΰ��� ǳ���� ������ ���� ����
		for(int i = 0; i < two_abundant_arr.length; i++) {
			// �ش� ���� �÷��� Ȯ�� �� �ջ�
			if(two_abundant_arr[i] != 0) {
				total_two_abundant += i;
			}
		}
		
		// �� ��
		for(int i = 1; i <= limit_num; i++) {
			total_sum += i;
		}
		
		// "�� ��" - "�ΰ��� ǳ���� ������ ���� ����"
		total_sum -= total_two_abundant;
		
		System.out.println("total_sum : " + total_sum);
	}
}
// �� : 4179871
