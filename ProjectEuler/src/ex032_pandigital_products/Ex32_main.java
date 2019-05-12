package ex032_pandigital_products;

public class Ex32_main {
	public static void main(String[] args) {
		
		// 시작 시간
		long begin_time = System.nanoTime();
		
		int[] result_arr = new int[0];
		int multiple_val = 0;
		String cur_result = "";
		
		int pandigital_sum = 0;
		
		for(int lhs = 0; lhs <= 100; lhs++) {
			for(int rhs = 0; rhs <= 2000; rhs++) {
				multiple_val = lhs * rhs;
				
				cur_result = Ex32_func.len_check(lhs, rhs, multiple_val);
				
				if(cur_result.length() == 0) {
					continue;
				}
				
				if(Ex32_func.check_pandigital(cur_result)) {
					result_arr = Ex32_func.check_duplication(multiple_val, result_arr);
					System.out.println("lhs : " + lhs + ", " + "rhs : " + rhs);
				}
			}
		}
		
		for(int i = 0; i < result_arr.length; i++) {
			System.out.println("result : " + result_arr[i]);
			pandigital_sum += result_arr[i];
		}
		
		System.out.println("----------------------------");
		System.out.println("pandigital의 총 합 : " + pandigital_sum);
		
		long end_time = System.nanoTime();
		
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("수행시간 : " + operating_time);
	}
}