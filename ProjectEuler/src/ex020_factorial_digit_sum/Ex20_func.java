package ex020_factorial_digit_sum;

import java.math.BigInteger;

public class Ex20_func {
	
	/***
	 * 펙토리얼값 구하기
	 * 
	 * 매개변수 :
	 * 		int _val : 펙토리얼값을 구하고자 하는 값
	 * 
	 * 반환값 :
	 * 		BigInteger형 펙토리얼값
	 */
	public static BigInteger factorial(int _val) {
		BigInteger factorial = new BigInteger("1");
		
		for(int i = 1; i <= _val; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		return factorial;
	}
	
	/***
	 * 각 숫자의 합 구하기
	 * 
	 * 매개변수 :
	 * 		BigInteger _val : 펙토리얼의 결과값
	 * 
	 * 반환값 :
	 * 		펙토리얼값의 각 숫자의 합 (BigInteger형)
	 */
	public static int each_sum(BigInteger _val) {
		int sum = 0;
		
		// 매개변수를 String형으로 형변환
		String temp = _val.toString();
		// 형변환된 문자열의 길이
		int temp_len = temp.length();
		
		// 각 값을 곱한다.
		for(int i = 0; i < temp_len; i++) {
			int cur_val = Integer.parseInt(temp.substring(i, i + 1));
			
			sum += cur_val;
		}
		
		return sum;
	}
}