package ex039_integer_right_triangles;

public class Ex39_func {
	
	/***
	 * �Է°��� �ѷ��� ������ �����ﰢ�� ���� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _perimeter : �ѷ���
	 * 
	 * ��ȯ�� :
	 * 		int�� �����ﰢ�� ����
	 */
	public static int calc_right_triangle(int _perimeter) {
		int triangle_cnt = 0;			// ���� �ﰢ�� ����
		int limit_a = _perimeter / 2;	// �� a�� �ִ밪
		
		int side_a = 0;		// �� a
		int side_b = 0;		// �� b
		int side_c = 0;		// �� c
		
		double pow_a = 0f;	// �� a^2
		double pow_b = 0f;	// �� b^2
		double pow_c = 0f;	// �� c^2
		
		for(side_a = 1; side_a < limit_a; side_a++) {
			for(side_b = 1; side_b <= side_a; side_b++) {
				// �� c�� ����
				side_c = _perimeter - (side_a + side_b);
				
				// ���� Ż�� ����
				if(side_a >= side_c) {
					break;
				}
				
				// �� ���� ����
				pow_a = Math.pow(side_a, 2);
				pow_b = Math.pow(side_b, 2);
				pow_c = Math.pow(side_c, 2);
				
				// ���� �ﰢ�� ���� �˻� (a^2 + b^2 == c^2)
				if(pow_a + pow_b == pow_c) {
					triangle_cnt++;
				}
			}
		}
			
		return triangle_cnt;
	}
}





































