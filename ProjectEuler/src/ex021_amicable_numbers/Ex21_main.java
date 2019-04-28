package ex021_amicable_numbers;

public class Ex21_main {
	public static void main(String[] args) {
		
		int maximum = 10000;	// 최대값
		int total_sum = 0;		// 총 합
		
		int[] overlap = {0};	// 중복 연산 제거를 위한 배열
		int target_num = 1;		// 대상값
		int amicable_num = 0;	// 우호값
		boolean check = false;	// 중복 검사 결과
		
		while(target_num < maximum) {
			// 중복값 확인
			check = Ex21_func.check_overlap(overlap, target_num);
			
			// 중복값이 없다면,
			if(!check) {
				// 현재값의 우호값 계산
				amicable_num = Ex21_func.sum_of_divisor(target_num);
				
				// 우호값이 성립하고, 자신과 우호값이 다를 경우,
				// -> 6과 28의 경우
				if(target_num == Ex21_func.sum_of_divisor(amicable_num)
						&& target_num != amicable_num) {	
					
					// 총합에 우호값을 더한다.
					total_sum = total_sum + amicable_num + target_num;
					
					// 중복값 갱신
					overlap = Ex21_func.add_idx(overlap, amicable_num);
					
					//TEST (우호값 출력)
					System.out.println("우호값_1 : " + target_num + ",\t우호값_2 : " + amicable_num);
				}
			}
			
			// 다음 타겟값
			target_num++;
		}
		
		System.out.println("우호적인 수들의 총 합 : " + total_sum);
	}
}
