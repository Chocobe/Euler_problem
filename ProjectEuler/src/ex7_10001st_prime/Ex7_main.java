package ex7_10001st_prime;

public class Ex7_main {
	public static void main(String[] args) {
		
		int dest_prime_cnt = 10001;	// 찾고자 하는 소수 갯수
		int curr_prime_cnt = 0;		// 현재 찾은 소수 갯수
		
		int target_num = 1;			// 소수 검사할 대상값
		
		int limit_num = 0;			// 소인수 분해를 위한 루프의 제한값
		int divisor_cnt = 0;		// 약수 갯수
		
		while(true) {
			// 해당 target_num의 소수 검사를 위한 부분 초기화
			target_num++;
			limit_num = target_num;
			divisor_cnt = 0;
			
			// target값을 i값으로 나눠주게 되는데,
			// 루프의 조건의 값은, target을 i로 나눴을 때 값(정수부분)보다는 크게 된다.
			// 때문에 조건값을 "target / i" 값으로 변경해 준다.
			for(int i = 1; i < limit_num; i++) {
				if(target_num % i == 0) {	// 나누어 떨어질 때,
					divisor_cnt++;			// 약수 갯수 1증가.
				}
				
				if(divisor_cnt > 1) { break; }	// 약수의 갯수가 2개가 되는 순간 소수가 아니다.
				
				limit_num = target_num / i;		// 루프의 조건값 조정 (target / i)
			}
			
			if(divisor_cnt == 1) {	// 루프를 빠져나온 "약수 갯수"가 1이면, 약수.
				curr_prime_cnt++;	// 검출한 약수 한개 증가.
			}
			
			if(curr_prime_cnt == dest_prime_cnt) {	// 검출한 약수의 갯수가 원하는 것이면 출력 & 종료.
				System.out.println(dest_prime_cnt + "번째의 소수 : " + target_num);
				break;
			}
		}
	}
}
