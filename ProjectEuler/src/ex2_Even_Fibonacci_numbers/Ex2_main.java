package ex2_Even_Fibonacci_numbers;

public class Ex2_main {
	public static void main(String[] args) {
				
		int lhs = 1;				// 좌측값
		int rhs = 1;				// 우측값
		int limit_num = 4000000;	// 한계값
		int sum = 0;				// 결과값
		
		// 문제 해결용 메서드 호출
		Ex2_fibo.fibo_sum(lhs, rhs, limit_num);
		
		// 결과값 가져오기
		sum = Ex2_fibo.getSum();
		
		// 출력
		System.out.println("Totla : " + sum);
	}
}
