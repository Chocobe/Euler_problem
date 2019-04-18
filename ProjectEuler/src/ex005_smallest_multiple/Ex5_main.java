package ex005_smallest_multiple;

public class Ex5_main {
	public static void main(String[] args) {

		int max_num = 20;			// ������ �ִ밪
		int min_num = 1;			// ������ �ּҰ�
		
		int cur_gcd = max_num;		// ���� ���� �ִ����� (Greatest Common Divisior)
		int cur_lsm = max_num;		// ���� ���� �ּҰ���� (Least Common Multiple)
		
		for(int i = min_num; i < max_num; i++) {
			
			// �ּҰ���� = (x * y) / �ִ�����
			cur_gcd = Ex5_calc.gcd(cur_lsm, i);
			cur_lsm = (cur_lsm * i) / cur_gcd;
			
		}
		
		System.out.println(min_num + " ~ " + max_num + "�� �ּҰ���� : " + cur_lsm);
	}
}
