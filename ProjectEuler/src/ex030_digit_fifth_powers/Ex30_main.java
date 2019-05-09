// �̿ϼ�

package ex030_digit_fifth_powers;

public class Ex30_main {
	public static void main(String[] args) {
		
		// ���۽ð�
		long begin_time = System.nanoTime();
		
		int exponent = 5;				// ���� ������
		int total_sum = 0;				// ������� �� ��
		Ex30_func main_obj = new Ex30_func(exponent);
		
		main_obj.get_table();			// ���� ���̺� ���
		int result_val = 0;				// �� ������ �����
		int[] result_arr = new int[0];	// ���ǿ� �´� ������ ����
		
		int[] use_digit = new int[6];	// ����� ���� ����
		
		for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 10; b++) {
				for(int c = 0; c < 10; c++) {
					for(int d = 0; d < 10; d++) {
						for(int e = 0; e < 10; e++) {
							for(int f = 0; f < 10; f++) {
						
								use_digit[0] = a;
								use_digit[1] = b;
								use_digit[2] = c;
								use_digit[3] = d;
								use_digit[4] = e;
								use_digit[5] = f;
								
								result_val = main_obj.comp_digit(use_digit);
								if(result_val != -1) {
									result_arr = main_obj.insert_arr(result_arr, result_val);
								}
							}
						}
					}
				}
			}
		}
		System.out.println("------------------------");
		
		for(int i = 0; i < result_arr.length; i++) {
			System.out.println(result_arr[i]);
			total_sum += result_arr[i];
		}
		System.out.println("------------------------");
		System.out.println("������� ���� : " + total_sum);
		
		// ����ð�
		long end_time = System.nanoTime();
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("����ð� : " + operating_time + " sec");
	}
}
