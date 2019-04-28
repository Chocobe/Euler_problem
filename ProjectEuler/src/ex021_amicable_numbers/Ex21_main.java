package ex021_amicable_numbers;

public class Ex21_main {
	public static void main(String[] args) {
		
		int maximum = 10000;	// �ִ밪
		int total_sum = 0;		// �� ��
		
		int[] overlap = {0};	// �ߺ� ���� ���Ÿ� ���� �迭
		int target_num = 1;		// ���
		int amicable_num = 0;	// ��ȣ��
		boolean check = false;	// �ߺ� �˻� ���
		
		while(target_num < maximum) {
			// �ߺ��� Ȯ��
			check = Ex21_func.check_overlap(overlap, target_num);
			
			// �ߺ����� ���ٸ�,
			if(!check) {
				// ���簪�� ��ȣ�� ���
				amicable_num = Ex21_func.sum_of_divisor(target_num);
				
				// ��ȣ���� �����ϰ�, �ڽŰ� ��ȣ���� �ٸ� ���,
				// -> 6�� 28�� ���
				if(target_num == Ex21_func.sum_of_divisor(amicable_num)
						&& target_num != amicable_num) {	
					
					// ���տ� ��ȣ���� ���Ѵ�.
					total_sum = total_sum + amicable_num + target_num;
					
					// �ߺ��� ����
					overlap = Ex21_func.add_idx(overlap, amicable_num);
					
					//TEST (��ȣ�� ���)
					System.out.println("��ȣ��_1 : " + target_num + ",\t��ȣ��_2 : " + amicable_num);
				}
			}
			
			// ���� Ÿ�ٰ�
			target_num++;
		}
		
		System.out.println("��ȣ���� ������ �� �� : " + total_sum);
	}
}
