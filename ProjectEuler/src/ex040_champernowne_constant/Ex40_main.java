package ex040_champernowne_constant;

public class Ex40_main {
	public static void main(String[] args) {
	
		// ���� �ð�
		long begin_time = System.nanoTime();
		
		int result_val = 1;			// �����
		int loop_limit = 7;			// ���� �Ѱ谪
		int cur_num = 0;			// ���� ��
		int champernowne_digit = 0;	// champernowne ����
		
		for(int i = 0; i < loop_limit; i++) {
			cur_num = (int)Math.pow(10, i);
			champernowne_digit = Ex40_func.get_champernowne(cur_num);
			System.out.println("d(" + cur_num + ") : " + champernowne_digit);
			
			result_val *= champernowne_digit;
		}
		
		System.out.println("-----------------------");
		System.out.println("����� : " + result_val);
		
		// ���� �ð�
		long end_time = System.nanoTime();
		// ���� �ð�
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println("���� �ð� : " + operating_time);
	}
}
