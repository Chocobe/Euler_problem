package ex023_non_abundant_sums;

public class Ex23_main {
	public static void main(String[] args) {
		
		int limit_num = 28123;
		
		int[] abundant_num = new int[0];		// 풍부한 숫자들의 배열
		int two_abundant_sum = 0;				// 현재 두개의 풍부한 숫자의 합
		
		// 두개의 풍부한 숫자의 합의 플래그 배열
		int[] two_abundant_arr = new int[limit_num + 1];

		int sum_of_divisor = 0;					// 약수의 합
		int limit_loop = 0;						// 루프의 한계값
		
		long total_sum = 0L;					// 총 합
		long total_two_abundant = 0L;			// 두 풍부한 숫자의 합의 총합
		
		for(int i = 1; i <= limit_num; i++) {
			
			sum_of_divisor = Ex23_func.sum_of_divisor(i);
			
			// 풍부한 숫자라면, 저장
			if(sum_of_divisor > i) {
				
				abundant_num = Ex23_func.add_idx(abundant_num, i);
			}
		}
		
		limit_loop = abundant_num.length;
		
		// 두개의 풍부한 숫자의 합 구하기
		for(int i = 0; i < limit_loop; i++) {
			for(int j = i; j < limit_loop; j++) {

				two_abundant_sum = abundant_num[i] + abundant_num[j];
				
				// 두 풍부한 숫자의 합이 한계값을 넘으면, 다음 루프
				if(two_abundant_sum > limit_num) {
					// 루프 한계값 갱신 (한계값을 넘는 인덱스 배제)
					limit_loop = j;
					break;
				}
				
				two_abundant_arr[two_abundant_sum] = 1;
			}
		}
		
		// 두개의 풍부한 숫자의 합의 총합
		for(int i = 0; i < two_abundant_arr.length; i++) {
			// 해당 값의 플래그 확인 후 합산
			if(two_abundant_arr[i] != 0) {
				total_two_abundant += i;
			}
		}
		
		// 총 합
		for(int i = 1; i <= limit_num; i++) {
			total_sum += i;
		}
		
		// "총 합" - "두개의 풍부한 숫자의 합의 총합"
		total_sum -= total_two_abundant;
		
		System.out.println("total_sum : " + total_sum);
	}
}
// 답 : 4179871
