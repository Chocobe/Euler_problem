package ex026_reciprocal_cycles;

public class Ex26_main {
	public static void main(String[] args) {
		
		long begin_time = System.nanoTime();		// ���� ���� �ð�
		
		int limit_val = 1000;						// ������ �Ѱ谪
		
		Ex26_func max_recurring = new Ex26_func(2);	// �ִ� �ݺ� �Ҽ����� ���
		Ex26_func cur_recurring;					// ���� ������ �ݺ� �Ҽ���
		
		for(int i = 2; i < limit_val; i++) {
			// ���� �ݺ� �Ҽ��� ����(�����ڿ��� ó��)
			cur_recurring = new Ex26_func(i);
			
			// ���� �ݺ� �Ҽ����� ���� > �ִ� �ݺ� �Ҽ����� ����
			if(cur_recurring.recurring_len > max_recurring.recurring_len) {
				// �ִ� �ݺ� �Ҽ��� ����
				max_recurring = cur_recurring;
			}
		}
		
		System.out.println("���� �� �ݺ� �Ҽ����� ���� : " + max_recurring.denominator);
		System.out.println("���� �� : " + max_recurring.decimal);
		System.out.println("�ݺ� �Ҽ����� ���� : " + max_recurring.recurring_len);
		
		// ����ð� ���
		long end_time = System.nanoTime();
		double processing_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println(processing_time);
		
		
	}
}