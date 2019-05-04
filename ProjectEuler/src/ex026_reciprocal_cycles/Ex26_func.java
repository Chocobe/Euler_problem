package ex026_reciprocal_cycles;

public class Ex26_func {
	
	int denominator = 0;		// �и�
	String decimal = "";		// �Ҽ���
	int recurring_len = 0;		// �ݺ� �Ҽ����� ����
	
	public Ex26_func(int _val) {
		calc_decimal(_val);
	}
	
	private void calc_decimal(int _denominator) {
		this.denominator = _denominator;	// �и�
		
		int numerator = 1;	// ����
		int exponent = 0;	// ����(10�� -������)
		
		int quotient = 0;			// ��
		int rest = 0;				// ������
		int match_cnt = 0;			// ������ ������ ���� ���� Ƚ��
		int match_idx = 0;			// ������ ������ ���� ���� �ε��� ��ȣ
		String comp_decimal = "";	// ���� ���ڿ�
		
		// ���ڰ� �и𺸴� ������, ���� ����ȭ ����
		while(numerator < denominator) {
			numerator *= 10;
			exponent++;
			this.decimal += "0";
		}
		// ������ "0" ����
		this.decimal = this.decimal.substring(1, this.decimal.length());
		
		// �Ҽ��� ���� ����
		while(true) {
			quotient = numerator / denominator;	// �� ���
			rest = numerator % denominator;		// ������ ���
			
			comp_decimal += String.valueOf(quotient);
			
			// ������ �Ҽ������� ���� ���,
			if(this.decimal.indexOf(comp_decimal) < 0) {
				this.decimal += String.valueOf(quotient);
				comp_decimal = "";
				match_cnt = 0;

			// ������ �Ҽ����� ���� ���,
			} else {
				
				match_cnt++;
				this.decimal += String.valueOf(quotient); 
				
				// ó�� ������ �Ҽ����� �ִ� �ε��� ��ȣ ����
				if(match_cnt == 1) {
					match_idx = exponent - 1;
				}
				
				// �ߺ� ������ 5�� �̻��� ���, �Ҽ��� �ݺ����� ���� ���� & ����
				if(match_cnt > 5) {
					int first_match_idx = this.decimal.indexOf(comp_decimal);
					String recurring = this.decimal.substring(first_match_idx, match_idx);

					// TEST
					this.decimal = 
							"0." + this.decimal.substring(0, first_match_idx) +
							"("  + recurring + ")";					
					
					this.recurring_len = recurring.length();
					
					return;
				}
			}
			
			// ���� ������ != 0 �� ���,
			if(rest != 0) {
				numerator = rest * 10;
				exponent++;
			
			// ���� ������ == 0 �� ���, �޼��� ����
			} else {
				// �ݺ� �Ҽ��� ���� 0
				this.recurring_len = 0;
				// decimal���� �Ҽ������� ǥ��
				this.decimal = "0." + this.decimal;
				// �޼��� ����
				return;
			}
		}
	}	
}