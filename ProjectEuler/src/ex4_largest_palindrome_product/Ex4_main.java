package ex4_largest_palindrome_product;

public class Ex4_main {
	public static void main(String[] args) {
		
		int lhs = 3;				// �º� �ִ� �ڸ���
		int rhs = 3;				// �캯 �ִ� �ڸ���
		int target_num = 0;			// Ÿ�ٰ�
		int pos_num = 0;			// Ÿ�ٰ��� �ڸ���
		boolean check_pali = false;	// ȸ�� ���ΰ� 
		
		int lhs_max = (int)Math.pow(10, lhs) - 1;	// �º� �ִ밪
		int rhs_max = (int)Math.pow(10, rhs) - 1;	// �캯 �ִ밪	

		// Ʋ�ȴ� �κ�
		//
		// for(int j = 0; j < lhs_max; j++)
		// �� ����ߴ�.
		//
		// �̿� ���� ������ �ϰ� �Ǹ�,
		// i���� 999 �϶�, j �� 0 ���� (lhs_max - 1) �� ������ ������.
		// ������ "999 * 91" ���� ���� ���� ���� �Ǹ�, ���� 90900
		//
		// ������, j���� 10������ ������ ������ �Ǹ�,
		// "999 * 913" ���� ���� ���� ���� �ϸ�, ���� 906609
		//
		// ��, �ִ밪�� ù��°�� �����ϱ� ���ؼ���..
		// ū���� ���� �������� ������ ������ �Ѵ�.
		// (�캯 10����� �º� -1 ���� �������ִ� �������)
		for(int i = 0; i < lhs_max; i++) {
			for(int j = 0; j < 10; j++) {
				
				// �� ������ Ÿ�ٰ� ����
				target_num = (lhs_max - i) * (rhs_max - j);
				
				// Ÿ�ٰ��� �ִ� 10�� ������ ����
				pos_num = Ex4_calc.get_pos_num(target_num);
				
				// Ÿ�ٰ��� ������ �迭 ����
				int[] element_num = new int[pos_num];
				
				// -> element_num[] �� Ÿ�ٰ� ���� ���� 
				Ex4_calc.divid_num(target_num, pos_num, element_num);
				
				// ��� �˻� �Ϸ�
				
				// �� ���� ��
				check_pali = Ex4_calc.check_pali(element_num, pos_num);
				if(check_pali == true) {
					System.out.println("ȸ���� : " + target_num);
					System.out.println("������ : " + (lhs_max - i));
					System.out.println("������ : " + (rhs_max - j));
					
					return;
				}
			}
		}
	}
}
