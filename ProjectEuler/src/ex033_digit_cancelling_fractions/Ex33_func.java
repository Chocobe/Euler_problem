package ex033_digit_cancelling_fractions;

public class Ex33_func {
	
	/***
	 * �ΰ��� �������� ����� ���ڸ� �Ұ��� ���� �迭�� ��ȯ
	 * 
	 * �Ű����� :
	 * 		int _numerator		: ����
	 * 		int _denominator	: �и�
	 * 
	 * ��ȯ�� :
	 * 		int[2]���� �� == {����, �и�}
	 * 		���� 0�� ��� : �Ұ� ������ ���� ���ڰ� ����
	 * 
	 * TESTed
	 */
	public static int[] check_curious_fraction(int _numerator, int _denominator) {
		int[] result_arr = {0, 0};
		
		String str_numerator = String.valueOf(_numerator);		// ������ ���ڿ���
		String str_denominator = String.valueOf(_denominator);	// �и��� ���ڿ���
		String str_common = "";		// ����� ������ ���ڿ���
		
		for(int i = 0; i < 2; i++) {
			// �и��� ���� �ϳ� ����
			str_common = str_denominator.substring(i, i + 1);
			
			// ����� ���ڰ� 0�� ���� ����
			if(str_common.compareTo("0") == 0) {
				continue;
			}
			
			for(int j = 0; j < 2; j++) {
				// ������ ���� ���,
				if(str_common.compareTo(str_numerator.substring(j, j + 1)) == 0) {
					str_numerator = str_numerator.replaceFirst(str_common, "");
					str_denominator = str_denominator.replaceFirst(str_common, "");
					
					result_arr[0] = Integer.parseInt(str_numerator);
					result_arr[1] = Integer.parseInt(str_denominator);
					
					// ����� ��ȯ & �޼��� ����
					return result_arr;					
				}
			}
		}
		
		return result_arr;
	}
	
	
	/***
	 * ��� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _target : ���
	 * 
	 * ��ȯ�� :
	 * 		int[] division : ����� ����� �迭
	 * 
	 * TESTed
	 */
	private static int[] division(int _target) {
		int division[] = new int[0];	// ����� ��� �迭
		
		for(int i = 2; i <= _target; i++) {
			// ����� ������,
			if(_target % i == 0) {
				int[] temp_arr = new int[division.length + 1];
				// ���簪�� 0�� �ε����� ���� (ū���� ��� ������ �����ϱ� ����)
				temp_arr[0] = i;
				
				for(int j = 0; j < division.length; j++) {
					temp_arr[1 + j] = division[j];
				}
				
				division = temp_arr;
			}
		}
		
		return division;
	}
	
	
	/***
	 * �ִ����� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		int _numerator	: ������
	 * 		int denominator	: ������
	 * 
	 * ��ȯ�� :
	 * 		int�� �ִ�����
	 * 
	 * TESTed
	 */
	public static int max_common_division(int _numerator, int _denominator) {
		int common_division = 0;	// ������
		int[] division;				// ���
		
		// ������ ��� ���ϱ�
		division = Ex33_func.division(_numerator);
		
		for(int i = 0; i < division.length; i++) {
			// �и��� ������,
			if(_denominator % division[i] == 0) {
				common_division = division[i];
				break;
			}
		}
		
		return common_division;
	}
}