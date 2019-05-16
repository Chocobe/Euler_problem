package ex034_digit_factorials;

public class Ex34_main {
	public static void main(String[] args) {
		
		// 시작 시작
		long begin_time = System.nanoTime();
		
		int target = 0;			// 대상값
		int sum_factorial = 0;	// 대상값의 숫자들의 펙토리얼 합
		int[] digit_factorials = new int[0];		// 조건에 맞는 값의 배열
		int loop_limit = Ex34_func.loop_limit();	// 루프의 한계값
		
		int total_sum = 0;	// 조건에 맞는 값들의 총 합
		
		for(target = 10; target < loop_limit; target++) {
			// 대상값의 숫자들의 펙토리얼 합 연산
			sum_factorial = Ex34_func.digit_factorial(target);
			
			// 대상값 == 펙토리얼의 합 이라면,
			if(target == sum_factorial) {
				// 저장
				digit_factorials = Ex34_func.add_idx(target, digit_factorials);
			}
		}
		
		// 도출된 값 출력 및 합산
		for(int i = 0; i < digit_factorials.length; i++) {
			System.out.println("value : " + digit_factorials[i]);
			total_sum += digit_factorials[i];
		}
		
		System.out.println("-----------------------------");
		System.out.println("digit factorials의 총 합 : " + total_sum);
		System.out.println("-----------------------------");
		
		// 종료 시간
		long end_time = System.nanoTime();
		// 연산 시간
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("연산 시간 : " + operating_time);
	}
}
