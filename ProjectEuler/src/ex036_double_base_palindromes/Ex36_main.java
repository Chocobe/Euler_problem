package ex036_double_base_palindromes;

public class Ex36_main {
	public static void main(String[] args) {
		
		// 시작 시간
		long begin_time = System.nanoTime();
		
		int limit_target = 1000000;			// 대상값의 최대값
		int[] palindrome_arr = new int[0];	// 회문을 저장할 배열
		
		String str_dec = "";	// 대상값의 10진수 문자열
		String str_bin = "";	// 대상값의 2진수 문자열
		
		boolean dec_palindrome = false;		// 10진수의 회문검사 결과
		boolean bin_palindrome = false;		// 2진수의 회문검사 결과
		
		int sum_of_palindrome = 0;			// 조건을 만족하는 값의 총 합
		
		for(int i = 0; i < limit_target; i++) {
			// 대상값의 10진수 문자열 형변환
			str_dec = String.valueOf(i);
			// 대상값의 2진수 문자열 형변환
			str_bin = Integer.toBinaryString(i);
			
			// 10진수 회문 검사
			dec_palindrome = Ex36_func.is_palindrome(str_dec);
			// 2진수 회문 검사
			bin_palindrome = Ex36_func.is_palindrome(str_bin);
			
			// 10진수 회문 && 2진수 회문 검사
			if(dec_palindrome == true && bin_palindrome == true) {
				palindrome_arr = Ex36_func.add_idx(i, palindrome_arr);
			}
		}
		
		for(int i = 0; i < palindrome_arr.length; i++) {
			System.out.println("palindrome_arr[" + i + "] : " + palindrome_arr[i]);
			sum_of_palindrome += palindrome_arr[i];
		}
		
		System.out.println("total sum of palindrome : " + sum_of_palindrome);
		
		// 종료시간
		long end_time = System.nanoTime();
		double operating_time = (double)((end_time - begin_time) / Math.pow(10, 9));
		System.out.println("수행 시간 : " + operating_time);
	}
}
