package ex037_truncatable_primes;

public class Ex37_func {
	
	int[] prime_table;			// �Ҽ� ���̺�
	int[] truncatable_prime;	// ���� ���� �Ҽ� �迭 (�䱸��)
	
	
	/***
	 * ������
	 * 
	 * �Ű����� :
	 * 		int _cnt : ���� ���� �Ҽ��� ����
	 */
	public Ex37_func(int _cnt) {
		this.prime_table = new int[0];
		this.truncatable_prime = new int[0];
		
		// ����� 10 �̻�
		int target = 9;
		
		while(this.truncatable_prime.length < _cnt) {
			// ���++
			target++;
			
			// ��,�� ���� ���� �Ҽ� �˻�
			if(left_truncatable_prime(target) && right_truncatable_prime(target)) {
				// ���� ���� �Ҽ� �迭 ����
				add_idx(target, "TRUNCATABLE");
			}
		}
	}

	
	/***
	 * �Ҽ� �˻�
	 * 
	 * �Ű����� :
	 * 		int _target : ���
	 * 		int[] _table : ���� ���̺�
	 * 
	 * ��ȯ�� :
	 * 		boolean - true	: �Ҽ� o
	 * 				- false	: �Ҽ� x
	 * 
	 * TESTed
	 */
	private boolean check_prime(int _target) {
		// ����� 0, 1�� ���, ����ó�� - �Ҽ� x)
		if(_target == 0 || _target == 1) {
			return false;
		}
		
		// �Ҽ� ���̺� �˻� (�Ҽ� ���̺� ���� ���� ���, �Ҽ� o)
		for(int i = 0; i < this.prime_table.length; i++) {
			if(_target == this.prime_table[i]) {
				return true;
			}
		}
		
		// �Ҽ� ���̺� ����� ���� ���,
		// �˻� �Ѱ谪
		int loop_limit = (int)Math.sqrt(_target);
		
		// ����� ����� �ִٸ�, �Ҽ� x
		for(int i = 2; i <= loop_limit; i++) {
			if(_target % i == 0) {
				return false;
			}
		}
		
		// �Ҽ� ���̺� ����
		add_idx(_target, "PRIME");
		
		return true;
	}
	
	
	/***
	 * �迭 �ε��� �߰�
	 * 
	 * �Ű����� :
	 * 		int _val : ���
	 * 
	 * ��ȯ�� :
	 * 		����� �߰��� int[]�迭
	 * 
	 * TESTed
	 */
	private void add_idx(int _val, String _mode) {
		int[] origin_arr;
		int len;
		
		// ��� ����
		if(_mode == "PRIME") {
			origin_arr = this.prime_table;
			len = this.prime_table.length;
		
		} else if(_mode == "TRUNCATABLE") {
			origin_arr = this.truncatable_prime;
			len = this.truncatable_prime.length;
		
		} else {
			return;
		}

		// ��� �迭 ����
		int[] added_table = new int[len + 1];
		
		// ���� ������ �ű��
		for(int i = 0; i < len; i++) {
			added_table[i] = origin_arr[i];
		}
		// �Է� ������ �߰�
		added_table[len] = _val;
		
		// ���� (�Ҽ� ���̺�)
		if(_mode == "PRIME") {
			this.prime_table = added_table;
		}
		
		// ���� (���� ���� �Ҽ� ���̺�)
		if(_mode == "TRUNCATABLE") {
			this.truncatable_prime = added_table;
		}
	}
	
	
	/***
	 * ��->�� ���� ����
	 * 
	 * �Ű����� :
	 * 		int _target : ���
	 * 
	 * ��ȯ�� :
	 * 		���ܵ� int�� ��
	 * 		-1 : ����� 0 ������ ���,
	 * 
	 * TESTed
	 */
	private static int left_remove_digit(int _target) {
		if(_target < 10) {
			return -1;
		}
		
		String str_target = String.valueOf(_target);
		str_target = str_target.substring(1, str_target.length());
		
		int fixed_target = Integer.parseInt(str_target);
		
		return fixed_target;
	}
	
	
	/***
	 * ��->�� ���� ����
	 * 
	 * �Ű����� :
	 * 		int _target : ���
	 * 
	 * ��ȯ�� :
	 * 		���ܵ� int�� ��
	 * 		-1 : ����� 0 ������ ���,
	 * 
	 * TESTed
	 */
	private static int right_remove_digit(int _target) {
		if(_target < 10) {
			return -1;
		}
		
		String str_target = String.valueOf(_target);
		str_target = str_target.substring(0, (str_target.length() - 1));
		
		int fixed_target = Integer.parseInt(str_target);
		
		return fixed_target;
	}
	
	
	/***
	 * ��->�� ���� ���� & �Ҽ� �˻� & �Ҽ� ���̺� ���� ����
	 * 
	 * �Ű����� :
	 * 		int _target : �˻� ���
	 * 
	 * ��ȯ�� :
	 * 		boolean - true	: ���� ���� �Ҽ� o
	 * 				- false : ���� ���� �Ҽ� x
	 * 
	 * TESTed
	 */
	public boolean left_truncatable_prime(int _target) {
		int fixed_target = _target;		// ���� ���� ���� ����� (���)
		
		while(fixed_target != -1) {
			// �Ҽ��� �ƴ� ���,
			if(!check_prime(fixed_target)) {
				return false;
			}
			
			// ���� ���� ����
			fixed_target = left_remove_digit(fixed_target);
		}
		
		return true;
	}
	
	
	/***
	 * ��->�� ���� ���� & �Ҽ� �˻� & �Ҽ� ���̺� ���� ����
	 * 
	 * �Ű����� :
	 * 		int _target : �˻� ���
	 * 
	 * ��ȯ�� :
	 * 		boolean - true	: ���� ���� �Ҽ� o
	 * 				- false	: ���� ���� �Ҽ� x
	 * 
	 * TESTed
	 */
	public boolean right_truncatable_prime(int _target) {
		int fixed_target = _target;		// ���� ���� ���� ����� (���)
		
		while(fixed_target != -1) {
			// �Ҽ��� �ƴ� ���,
			if(!check_prime(fixed_target)) {
				return false;
			}
			
			// ���� ���� ����
			fixed_target = right_remove_digit(fixed_target);
		}

		return true;
	}
}