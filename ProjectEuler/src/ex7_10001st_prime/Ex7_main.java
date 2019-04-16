package ex7_10001st_prime;

public class Ex7_main {
	public static void main(String[] args) {
		
		int dest_prime_cnt = 10001;	// ã���� �ϴ� �Ҽ� ����
		int curr_prime_cnt = 0;		// ���� ã�� �Ҽ� ����
		
		int target_num = 1;			// �Ҽ� �˻��� ���
		
		int limit_num = 0;			// ���μ� ���ظ� ���� ������ ���Ѱ�
		int divisor_cnt = 0;		// ��� ����
		
		while(true) {
			// �ش� target_num�� �Ҽ� �˻縦 ���� �κ� �ʱ�ȭ
			target_num++;
			limit_num = target_num;
			divisor_cnt = 0;
			
			// target���� i������ �����ְ� �Ǵµ�,
			// ������ ������ ����, target�� i�� ������ �� ��(�����κ�)���ٴ� ũ�� �ȴ�.
			// ������ ���ǰ��� "target / i" ������ ������ �ش�.
			for(int i = 1; i < limit_num; i++) {
				if(target_num % i == 0) {	// ������ ������ ��,
					divisor_cnt++;			// ��� ���� 1����.
				}
				
				if(divisor_cnt > 1) { break; }	// ����� ������ 2���� �Ǵ� ���� �Ҽ��� �ƴϴ�.
				
				limit_num = target_num / i;		// ������ ���ǰ� ���� (target / i)
			}
			
			if(divisor_cnt == 1) {	// ������ �������� "��� ����"�� 1�̸�, ���.
				curr_prime_cnt++;	// ������ ��� �Ѱ� ����.
			}
			
			if(curr_prime_cnt == dest_prime_cnt) {	// ������ ����� ������ ���ϴ� ���̸� ��� & ����.
				System.out.println(dest_prime_cnt + "��°�� �Ҽ� : " + target_num);
				break;
			}
		}
	}
}
