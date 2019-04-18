package ex010_summation_of_primes;

public class Ex10_clac {
	
	/***
	 * �Է¹��� ���� �Ҽ��� �Ǵ��ϴ� �޼���
	 * 
	 * < TEST complete >
	 */
	public static boolean check_prime(int _target) {
		
		// �˻縦 ���� ������ �ִ� Ƚ��
		// ��Ʈ���� ������ ���ϱ��� �˻�� "�Ҽ�" �Ǻ� ����
		// (��Ʈ�� �ʰ��� ��쿡��, ������ �˻��ߴ� ���� �ߺ��Ǵ� �κ��̱� ����)
		int loop_limit = (int)Math.sqrt(_target);
		
		int prime_cnt = 0;				// �Ҽ� ���� ī����
		boolean checking = false;		// �Ҽ� �Ǵܰ� (��ȯ��)
		
		// 1�� �������� �� ���� ����
		for(int i = 1; i <= loop_limit; i++) {
			if(_target % i == 0) {
				prime_cnt++;
			}
			
			if(prime_cnt >= 2) {	// 1��ȸ�� ����� �ִٸ�, �Ҽ��� �ƴϴ�.
				return checking;
			}
		}
		
		// ������ ������ ����, ����� ������ 1�� ���, �� ���ڴ� �Ҽ���.
		
		checking = true;
		
		return checking;
	}
}
