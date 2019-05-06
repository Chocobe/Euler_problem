package ex027_quadratic_primes;

public class Ex27_euler {
	
	int coefficient_a;			// ��� a
	int coefficient_b;			// ��� b
	int mul_a_and_b;			// a * b
	int prime_cnt;				// �������� �Ҽ� ����
	
	public Ex27_euler() {
		// �ʱ�ȭ
		this.coefficient_a = 0;
		this.coefficient_b = 0;
		this.prime_cnt = 0;
	}
	
	public Ex27_euler(int _a, int _b) {
		// �ʱ�ȭ
		this.coefficient_a = _a;
		this.coefficient_b = _b;
		this.mul_a_and_b = _a * _b;
		
		consecutive_prime_cnt(_a, _b);
	}
	
	
	/***
	 * �Ҽ� �Ǻ� �޼���
	 * 
	 * �Ű����� :
	 * 		int _input : �Է°�
	 * 
	 * ��ȯ�� :
	 * 		boolean��	- true  : �Ҽ� o
	 * 					- false : �Ҽ� x
	 */
	public boolean check_prime(int _input) {
		
		boolean is_prime = false;	// �Ҽ� �Ǻ�
		int loop_limit = _input;	// ���� �Ѱ谪
		
		// �Է°��� "0 �Ǵ� 1, ����"�� ���, ����ó�� (�Ҽ� x)
		if(_input == 0 || _input == 1 || _input < 0) {
			return is_prime;
		}
		
		// �Է°��� 2�� ���, ����ó�� (�Ҽ� o)
		if(_input == 2) {
			is_prime = true;
			return is_prime;
		}
		
		// �� ���� �Է°��� ����
		for(int i = 2; i <= loop_limit; i++) {
			// ����� �����Ѵٸ�,
			if(_input % i == 0) {
				return is_prime;
			}
			
			// ���� �Ѱ谪 ����
			loop_limit = _input / i;
		}
		
		// ����������� ����� ���ٸ�, �Ҽ� o
		is_prime = true;
		
		return is_prime;
	}
	
	/***
	 * ���ӵǴ� �Ҽ����� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _a : ��� a
	 * 		int _b : ��� b
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 */
	public void consecutive_prime_cnt(int _a, int _b) {
		
		int formula = 0;
		int cur_num = 0;
		boolean is_prime = false;
		
		while(true) {
			formula = (int)Math.pow(cur_num, 2) + (cur_num * _a) + _b;
			is_prime = check_prime(formula);
			
			if(is_prime) {
				this.prime_cnt++;
				
			} else {
				return;
				
			}
			
			cur_num++;
		}
	}
}
