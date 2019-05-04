package ex026_reciprocal_cycles;

public class Ex26_main {
	public static void main(String[] args) {
		
		long begin_time = System.nanoTime();		// 연산 시작 시간
		
		int limit_val = 1000;						// 제수의 한계값
		
		Ex26_func max_recurring = new Ex26_func(2);	// 최대 반복 소수점의 대상
		Ex26_func cur_recurring;					// 현재 제수의 반복 소수점
		
		for(int i = 2; i < limit_val; i++) {
			// 현재 반복 소수점 연산(생성자에서 처리)
			cur_recurring = new Ex26_func(i);
			
			// 현재 반복 소수점의 길이 > 최대 반복 소수점의 길이
			if(cur_recurring.recurring_len > max_recurring.recurring_len) {
				// 최대 반복 소수점 갱신
				max_recurring = cur_recurring;
			}
		}
		
		System.out.println("가장 긴 반복 소수점의 제수 : " + max_recurring.denominator);
		System.out.println("연산 값 : " + max_recurring.decimal);
		System.out.println("반복 소수점의 길이 : " + max_recurring.recurring_len);
		
		// 연산시간 출력
		long end_time = System.nanoTime();
		double processing_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println(processing_time);
		
		
	}
}