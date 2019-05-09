// 미완성

package ex030_digit_fifth_powers;

public class Ex30_main {
	public static void main(String[] args) {
		
		// 시작시간
		long begin_time = System.nanoTime();
		
		int exponent = 5;				// 조건 지수값
		int total_sum = 0;				// 결과값의 총 합
		Ex30_func main_obj = new Ex30_func(exponent);
		
		main_obj.get_table();			// 참조 테이블 출력
		int result_val = 0;				// 각 루프의 결과값
		int[] result_arr = new int[0];	// 조건에 맞는 값들을 저장
		
		int[] use_digit = new int[6];	// 사용할 숫자 조합
		
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
		System.out.println("결과값의 총합 : " + total_sum);
		
		// 종료시간
		long end_time = System.nanoTime();
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("경과시간 : " + operating_time + " sec");
	}
}
