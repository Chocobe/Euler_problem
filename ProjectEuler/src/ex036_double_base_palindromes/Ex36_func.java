package ex036_double_base_palindromes;

public class Ex36_func {
	
	/***
	 * 회문 검사
	 * 
	 * 매개변수 :
	 * 		String _target : 검사 대상
	 * 
	 * 반환값 :
	 * 		boolean	- true	: 회문 o
	 * 				- false	: 회문 x
	 * TESTed
	 */
	public static boolean is_palindrome(String _target) {
		int len = _target.length();
		int loop_limit = len / 2;
		String str_lhs = "";
		String str_rhs = "";
		
		for(int i = 0; i <= loop_limit; i++) {
			// 좌측 문자 도출
			str_lhs = _target.substring(i, (i + 1));
			// 우측 문자 도출
			str_rhs = _target.substring((len - 1) - i, (len - i));
			
			// 좌측 != 우측 이라면, false
			if(str_lhs.compareTo(str_rhs) != 0) { return false; }
		}
		
		return true;
	}
	
	
	/***
	 * 배열에 인덱스 추가
	 * 
	 * 매개변수 :
	 * 		int _val	: 저장할 값
	 * 		int[] _arr	: 추가할 배열
	 * 
	 * 반환값 :
	 * 		int[] 배열
	 * 
	 * TESTed
	 */
	public static int[] add_idx(int _val, int[] _arr) {
		int len = _arr.length;
		int[] result_arr = new int[len + 1];
		
		for(int i = 0; i < len; i++) {
			result_arr[i] = _arr[i];
		}
		result_arr[len] = _val;
		
		return result_arr;
		
	}
}