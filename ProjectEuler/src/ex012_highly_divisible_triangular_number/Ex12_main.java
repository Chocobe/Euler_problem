package ex012_highly_divisible_triangular_number;

public class Ex12_main {
	public static void main(String[] args) {
		
		int purpose_factor = 500;		// ��ǥ �μ��� ����(�ʰ���)

		long cur_tri_num = 0;		// ���� �ﰢ��
		int cur_tri_size = 0;		// ���� �ﰢ���� �ִ� �μ���
		int cur_tri_factor = 0;		// ���� �ﰢ���� �μ� ����
		
		while(true) {
			
			cur_tri_factor = 0;
			cur_tri_size++;
			cur_tri_num = Ex12_calc.triangular_num(cur_tri_size);
			
			cur_tri_factor = Ex12_calc.factor_cnt(cur_tri_num);
			
			if(cur_tri_factor > purpose_factor) {
				System.out.println("�ﰢ�� �� : " + cur_tri_num);
				System.out.println(cur_tri_num + "�� �ִ� �μ� �� : " + cur_tri_size);
				System.out.println(cur_tri_num + "�� �μ� ���� : " + cur_tri_factor);
				
				break;
			}
		}
	}
}
