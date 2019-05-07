package ex029_distinct_powers;

public class Ex29_func {
	private int min_base;		// �ؼ� �ּҰ�
	private int max_base;		// �ؼ� �ִ밪
	private int min_exponent;	// ���� �ּҰ�
	private int max_exponent;	// ���� �ִ밪
	
	private int distinct_num;	// �ߺ��� ������ ����
	
	public Ex29_func(int _min_base, int _max_base, int _min_exp, int _max_exp) {
		this.min_base = _min_base;
		this.max_base = _max_base;
		this.min_exponent = _min_exp;
		this.max_exponent = _max_exp;
		
		// �ߺ��� ����
		int total_cnt = (max_base - min_base + 1) * (max_exponent - min_exponent + 1);
		int duplication = 0;
		
		for(int i = min_base; i <= max_base; i++) {
			for(int j = min_exponent; j <= max_exponent; j++) {
				if(check_duplication(i, j)) {
					duplication++;
				}
			}
		}
		
		this.distinct_num = total_cnt - duplication;
	}
	
	/***
	 * �ν��Ͻ��� ���� ��� �޼���
	 * 
	 * �Ű����� :
	 * 		N/A
	 * 
	 * ��ȯ�� :
	 * 		N/A
	 * 
	 * TESTed
	 */
	public void get_inform() {
		System.out.print("    (base) min : " + this.min_base + ", ");
		System.out.println("max : " + this.max_base);
		System.out.print("(exponent) min : " + this.min_exponent + ", ");
		System.out.println("max : " + this.max_exponent);
		System.out.println("Distinct powers counter : " + this.distinct_num);
	}
	
	
	/***
	 * �ߺ��� �˻�
	 * 
	 * �Ű����� :
	 * 		int _base		: �ذ�
	 * 		int _exponent	: ������
	 * 
	 * ��ȯ�� :
	 * 		true	: �ߺ� ����
	 * 		false	: �ߺ� ����
	 * 
	 * TESTed
	 */
	private boolean check_duplication(int _base, int _exponent) {
		boolean overlap = false;	// �ߺ� ���� ���� (�⺻�� : �ߺ� ����)
		
		int min_power = Ex29_func.min_power(_base);
		if(min_power != -1) {
			int cur_power = min_power;
			int min_power_exp = Ex29_func.anti_log(cur_power, _base) * _exponent;
			
			if(min_power_exp <= this.max_exponent) {
				overlap = true;
				
			} else {
				int step = 1;		// �ּ� �ŵ��������� ������
				int step_exp = 0;	// ���� ���ܻ����� �Է°��� ǥ���� ��, ������
				
				while(true) {
					// ���� ��������
					cur_power *= min_power;
					step++;
					
					// ���� ������ �ذ��� �Է°��� �ذ� �̻��̹Ƿ�, ���� ���� (�ߺ� �߰� ����)
					if(cur_power >= _base) {
						break;
					}
					
					// ���� ���ܻ󿡼� �Է°��� �������� ǥ�� (�Ҽ��� �߻� -> ���� ������ �����߻� �κ�, �� �ŵ������� �Ǻ�)
					step_exp = min_power_exp / step;
					
					// ���� ������ ���� �Է°��� ���ٸ�(���� ������ �Է°��� �ŵ����������� �˻�),
					if(Math.pow(_base, _exponent) == Math.pow(cur_power, step_exp)) {
						// ���� ������ �������� ���� �̳����,
						if(step_exp <= this.max_exponent) {
							overlap = true;
						}
					}
				}
			}
		}
		
		return overlap;
	}
	
	
	/***
	 * base�� ������ �� �ִ� log �޼���
	 * 
	 * �Ű����� :
	 * 		int _base : �ذ�
	 * 		int _anti : ������
	 * 
	 * ��ȯ�� :
	 * 		_base �� _anti�� �αװ� (_base�� ������)
	 * 
	 * TESTed
	 */
	private static int anti_log(int _base, int _anti) {
		// �α� �� ��ȯ ����
		double anti_log_val = Math.log(_anti) / Math.log(_base);
		return (int)anti_log_val;
	}
	
	
	/***
	 * �ּ� �ŵ������� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _val : ��� ��
	 * 
	 * ��ȯ�� :
	 * 		-1 		: �ŵ������� ����
	 * 		���� ����	: �ŵ�������
	 * 
	 * TESTed
	 */
	private static int min_power(int _val) {
		int loop_limit = _val;
		int divisor = 1;
		
		for(int i = 2; i <= loop_limit; i++) {
			// ���� �ʱ�ȭ
			divisor = 1;
			
			if(_val == i) {
				return -1;
			}
			
			if(_val % i == 0) {
				
				while(true) {
					divisor *= i;
					
					// �ؼ� ���� ���� ���, ����� �ѹ� �� ���Ѵ�.
					if(divisor < _val) {
						continue;
						
					// �ؼ� ���� ū ���, ���� ����� ���� ���� ����
					} else if(divisor > _val) {
						break;
					
					// �ؼ��� ���� ���, �ּ� ���������� ��ȯ
					} else {
						return i;
					}
				}
				
				// ���� �Ѱ谪 ����
				loop_limit = _val / i;
			}
		}
		
		// ��� ����� �������� �ƴ� ���, ������ ����(-1) ��ȯ
		return -1;
	}
}




































