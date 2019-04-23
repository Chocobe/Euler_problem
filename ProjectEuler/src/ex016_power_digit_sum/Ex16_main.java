package ex016_power_digit_sum;

import java.math.BigInteger;

public class Ex16_main {
	public static void main(String[] args) {
		
		// 밑수 (정수형)
		int base_int = 2;
		// 밑수를 BigInteger의 매개변수로 넣기 위해 String형으로 변환
		String base_string = String.valueOf(base_int);
		
		// 지수값
		int exponent_num = 1000;
		// 2 ^ 1000 을 넣을 BigInteger 변수 생성
		BigInteger result_num = new BigInteger(base_string);
		// BigInteger형의 값을 String형으로 변환
		String result_string = "";
		// 문자열 길이
		int result_len = 0;
		// 각 숫자들의 합
		int digit_sum = 0;
		
		System.out.println("밑수 : " + result_num);
		System.out.println("지수 : " + exponent_num);
		
		// 2 ^ 1000 (BigInteger 형)
		result_num = result_num.pow(exponent_num);
		// 2 ^ 1000 (String 형)
		result_string = result_num.toString();
		
		result_len = result_string.length();
		
		System.out.println("결과값(문자열)의 길이 : " + result_len);
		
		for(int i = 0; i < result_len; i++) {
			String digit = result_string.substring(i, i + 1);
			
			digit_sum += Integer.parseInt(digit);
		}
		
		System.out.println("각 숫자들의 합 : " + digit_sum);
	}
}
/* 결과값
1071508607
1862673209
4842504906
0001810561
4048117055
3360744375
0388370351
0511249361
2249319837
8815695858

1275946729
1755314682
5187145285
6923140435
9845775746
9857480393
4567774824
2309854210
7460506237
1141877954

1821530464
7498358194
1267398767
5591655439
4607706291
4571196477
6865421676
6042983165
2624386837
2056680693

76
*/