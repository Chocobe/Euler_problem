package ex004_largest_palindrome_product;

import java.util.Arrays;

public class Ex4_calc {
	/***
	 * _target의 자릿수
	 */
	public static int get_pos_num(int _target) {
		
		int temp = _target;
		int cnt = 0;
		
		while(true) {
			if(temp < 10) {
				return cnt + 1;
			}
			
			temp /= 10;
			cnt++;
		}
	}
	
	/***
	 * 배열에 타겟값 분할 저장
	 */
	public static void divid_num(int _target, int _pos, int[] _repo) {
		
		int temp = _target;
		
		for(int i = 0; i < _pos; i++) {
			_repo[i] = temp - ((temp / 10) * 10);
			temp /= 10;
		}
	}
	
	/***
	 * 회문 파악
	 */
	public static boolean check_pali(int[] _repo, int _pos) {
		
		boolean check_pali = false;	// 검사값

		int[] val_rhs = new int[_pos / 2];
		int[] val_lhs = new int[_pos / 2];
		int div_size = _pos / 2;
		
		for(int i = 0; i < div_size; i++) {
			val_rhs[i] = _repo[(_pos - 1) - i];
			val_lhs[i] = _repo[i];
			
			check_pali = Arrays.equals(val_rhs, val_lhs);
		}
		
		return check_pali;
	}
}
