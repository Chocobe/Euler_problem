package ex038_pandigital_multiples;

public class Ex38_main {
	public static void main(String[] args) {
		
		// 시작 시간
		long begin_time = System.nanoTime();
		
		Ex38_func obj = new Ex38_func();
		
		int largest_val = 0;		// 가장 큰 pandigital number
		int concat_val = 0;			// 현재 pandigital number
		String str_concat = "";		// 현재 pandigital number의 String형
		
		System.out.println("pandigital number 총 개수 : " + obj.pandigital_numbers.length);
		
		for(int i = 0; i < obj.pandigital_numbers.length; i++) {
			System.out.println("---------------------");
			System.out.println("target : " + obj.pandigital_numbers[i].target_number);
			System.out.println("multiplier : " + obj.pandigital_numbers[i].multiplier);
			System.out.println("concat string : " + obj.pandigital_numbers[i].concat_number);
			
			// 현재 pandigital number 추출 (String형)
			str_concat = obj.pandigital_numbers[i].concat_number;
			// 현재 pandigital number -> int형으로 형변환
			concat_val = Integer.parseInt(str_concat);
			
			// pandigital number 크기 비교
			if(concat_val > largest_val) {
				largest_val = concat_val;
			}
		}
		
		System.out.println("---------------------");
		System.out.println("Largest pandigital number : " + largest_val);
		
		// 종료 시간
		long end_time = System.nanoTime();
		// 수행 시간
		double operating_time = (double)((end_time - begin_time) / Math.pow(10, 9));
		System.out.println("수행 시간 : " + operating_time);
	}
}
