package ex010_summation_of_primes;

public class Ex10_main {
	public static void main(String[] args) {
		
		int max_num = 2000000;		// �˻��� �ִ� ��
		int cur_target = 1;			// ���� �˻��� ��
		long summation = 0L;		// ����
		
		boolean prime_check = false;	// �Ҽ� �Ǻ�
		
		for(int i = 1; i < (max_num - 1); i++) {
			// �κ� �ʱ�ȭ
			prime_check = false;
			cur_target++;			
			
			prime_check = Ex10_clac.check_prime(cur_target);
			
			if(prime_check) {
				summation += cur_target;
			}
		}
		
		System.out.println(max_num + "�̳��� �Ҽ��� �� �� : " + summation);
		
	}
}
