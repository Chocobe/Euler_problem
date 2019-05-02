package ex025_1000_digit_Fibonacci_number;

import java.math.BigInteger;

public class Ex25_main {
	public static void main(String[] args) {
		
		long start_time = System.nanoTime();
		
		// 구하고자 하는 값의 범위값
		BigInteger target_digits = BigInteger.valueOf(10);
		target_digits = target_digits.pow(999);
		
		// 피보나치 수열의 값을 참조할 배열
		BigInteger[] fibo_arr = new BigInteger[10000];
		// 현재 인덱스의 피보나치 수열 값
		BigInteger cur_fibo = BigInteger.valueOf(0);
		// 루프값(인덱스번호)
		int loop = -1;
		
		// 현재 인덱스의 수열값 < 목표값
		while(cur_fibo.compareTo(target_digits) == -1) {
			loop++;
			// 참조 테이블 갱신
			fibo_arr = Ex25_func.fibonacci(fibo_arr, loop);
			cur_fibo = fibo_arr[loop];
		}
		
		System.out.println(loop + "번째 값 : " + fibo_arr[loop]);
		
		// 프로세서 수행 시간
		long end_time = System.nanoTime();
		float process_time = (float)((end_time - start_time) / Math.pow(10, 9));
		System.out.println("수행시간 : " + process_time + "초");
		
	}
}
