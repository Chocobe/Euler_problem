package ex020_factorial_digit_sum;

import java.math.BigInteger;

public class Ex20_main {
	public static void main(String[] args) {
		
		// 구하고자 하는 값
		int target_num = 100;
		
		// 펙토리얼값을 저장할 변수
		BigInteger factorial_val = new BigInteger("0");
		// 펙토리얼값의 각 수의 합
		int total_sum = 0;
		
		// 펙토리얼값 계산
		factorial_val = Ex20_func.factorial(target_num);
		
		// 펙토리얼값의 각 수의 합 계산
		total_sum = Ex20_func.each_sum(factorial_val);
		
		System.out.println(target_num + "! 각 수의 총합 : " + total_sum);		
	}
}
