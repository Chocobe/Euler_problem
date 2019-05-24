package ex039_integer_right_triangles;

public class Ex39_main {
	public static void main(String[] args) {
		
		// ���� �ð�
		long begin_time = System.nanoTime();
		
		int limit_perimeter = 1000;		// �ѷ� �Ѱ谪
		int maximum_cnt = 0;			// ���� �ﰢ���� �ִ� ����
		int maximum_perimeter = 0;		// ���� �ﰢ���� �ִ� ���� �� ��, �ѷ���
		int cur_cnt = 0;				// ���� ���� �ﰢ���� ����
		
		for(int i = 1; i <= limit_perimeter; i++) {
			// ���� �ѷ����� �����ﰢ�� ���� ����
			cur_cnt = Ex39_func.calc_right_triangle(i);
			
			// ���� �ﰢ�� �ִ� ���� ��
			if(cur_cnt > maximum_cnt) {
				maximum_cnt = cur_cnt;
				maximum_perimeter = i;
			}
		}
		
		System.out.println("maximum right triangle count : " + maximum_cnt);
		System.out.println("maximum right triangle perimeter : " + maximum_perimeter);
		
		// ���� �ð�
		long end_time = System.nanoTime();
		// ���� �ð�
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println("���� �ð� : " + operating_time);		
	}
}