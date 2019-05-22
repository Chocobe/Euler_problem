package ex038_pandigital_multiples;

public class Ex38_main {
	public static void main(String[] args) {
		
		// ���� �ð�
		long begin_time = System.nanoTime();
		
		Ex38_func obj = new Ex38_func();
		
		int largest_val = 0;		// ���� ū pandigital number
		int concat_val = 0;			// ���� pandigital number
		String str_concat = "";		// ���� pandigital number�� String��
		
		System.out.println("pandigital number �� ���� : " + obj.pandigital_numbers.length);
		
		for(int i = 0; i < obj.pandigital_numbers.length; i++) {
			System.out.println("---------------------");
			System.out.println("target : " + obj.pandigital_numbers[i].target_number);
			System.out.println("multiplier : " + obj.pandigital_numbers[i].multiplier);
			System.out.println("concat string : " + obj.pandigital_numbers[i].concat_number);
			
			// ���� pandigital number ���� (String��)
			str_concat = obj.pandigital_numbers[i].concat_number;
			// ���� pandigital number -> int������ ����ȯ
			concat_val = Integer.parseInt(str_concat);
			
			// pandigital number ũ�� ��
			if(concat_val > largest_val) {
				largest_val = concat_val;
			}
		}
		
		System.out.println("---------------------");
		System.out.println("Largest pandigital number : " + largest_val);
		
		// ���� �ð�
		long end_time = System.nanoTime();
		// ���� �ð�
		double operating_time = (double)((end_time - begin_time) / Math.pow(10, 9));
		System.out.println("���� �ð� : " + operating_time);
	}
}
