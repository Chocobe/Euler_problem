package ex012_highly_divisible_triangular_number;

public class Ex12_calc {

	/***
	 * "삼각수" 구하는 메서드
	 * 
	 * 매개변수 :
	 * 		int _size : 삼각수의 최대 인수값
	 * 
	 * 반환값 :
	 * 		삼각수
	 */
	public static long triangular_num(int _size) {
		
		long tri_num = 0;	// 삼각수
		
		for(int i = 1; i <= _size; i++) {
			
			tri_num += i;
		}
	
		return tri_num;
	}
	
	/***
	 * 매개변수의 "인수 갯수"를 구하는 메서드
	 * 
	 * 매개변수 :
	 * 		int _target : 인수 갯수를 구하고자 하는 입력값
	 * 
	 * 반환값 :
	 * 		입력받은 값의 "인수 갯수"
	 */
	public static int factor_cnt(long _target) {
		
		int factor_cnt = 0;		// 인수 갯수
		
		for(long i = 1; i <= _target; i++) {
			
			if(_target % i == 0) {
				factor_cnt++;
			}
		}
		
		return factor_cnt;		
	}
}
