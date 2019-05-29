package ex040_champernowne_constant;

public class Ex40_main {
	public static void main(String[] args) {
	
		// 시작 시간
		long begin_time = System.nanoTime();
		
		int result_val = 1;			// 결과값
		int loop_limit = 7;			// 루프 한계값
		int cur_num = 0;			// 현재 값
		int champernowne_digit = 0;	// champernowne 숫자
		
		for(int i = 0; i < loop_limit; i++) {
			cur_num = (int)Math.pow(10, i);
			champernowne_digit = Ex40_func.get_champernowne(cur_num);
			System.out.println("d(" + cur_num + ") : " + champernowne_digit);
			
			result_val *= champernowne_digit;
		}
		
		System.out.println("-----------------------");
		System.out.println("결과값 : " + result_val);
		
		// 종료 시간
		long end_time = System.nanoTime();
		// 수행 시간
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println("수행 시간 : " + operating_time);
	}
}
