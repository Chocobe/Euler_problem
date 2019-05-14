package ex033_digit_cancelling_fractions;

public class Ex33_main {
	public static void main(String[] args) {
		
		int numerator = 0;					// ����
		int denominator = 0;				// �и�
		int[] checked_fraction = {0, 0};	// curious fraction ���밪 [����][�и�]
		
		int[][] result_arr = new int[0][2];	// curious fraction ����
		
		float origin_val = 0f;			// ������
		float fixed_val = 0f;			// ������
		
		int mul_numerator = 1;			// ���ڵ��� ��
		int mul_denominator = 1;		// �и���� ��
		int max_common_division = 0;	// �ִ� �����
		
		int result_denominator = 0;		// �ִ������� ���� �и� (���� �䱸��)
		
		// curious fraction�� ���ϴ� ����
		for(denominator = 11; denominator < 100; denominator++) {
			for(numerator = 10; numerator < denominator; numerator++) {
				checked_fraction = Ex33_func.check_curious_fraction(numerator, denominator);
				
				// ��ȯ�� ���� 0�� ���, ���� ���ڰ� ����. (���� ������ �̵�)
				if(checked_fraction[0] == 0 || checked_fraction[1] == 0) {
					continue;
				}
				
				// ������
				origin_val = (float)numerator / (float)denominator;
				// ������ ��
				fixed_val = (float)checked_fraction[0] / (float)checked_fraction[1];
				
				// ������ == ������ ��
				if(origin_val == fixed_val) {
					int[][] temp_arr = new int[result_arr.length + 1][2];
					
					// �迭�� ũ�� ���� �� ����� ����
					for(int i = 0; i < result_arr.length; i++) {
						temp_arr[i] = result_arr[i];
					}
					temp_arr[temp_arr.length - 1][0] = numerator;
					temp_arr[temp_arr.length - 1][1] = denominator;
					result_arr = temp_arr;
				}
			}
		}
		
		// ����, �и��� ���� ��
		for(int i = 0; i < result_arr.length; i++) {
			mul_numerator *= result_arr[i][0];
			mul_denominator *= result_arr[i][1];
		}
		
		// ����, �и��� �ִ����� ���ϱ�
		max_common_division = Ex33_func.max_common_division(mul_numerator, mul_denominator);
		
		// �ִ� ������� ���� �и�
		result_denominator = mul_denominator / max_common_division;
		
		System.out.println("<-   TESTing    ->");
		for(int i = 0; i < result_arr.length; i++) {
			System.out.println("lhs : " + result_arr[i][0] + ", rhs : " + result_arr[i][1]);
		}
		
		System.out.println("------------- result -------------");
		System.out.println("������ �� : " + mul_numerator + ", �и��� �� : " + mul_denominator);
		System.out.println("�ִ� ����� : " + max_common_division);
		System.out.println("�ִ� ������� ���� �и� : " + result_denominator);
	}
}
