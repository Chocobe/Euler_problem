package ex018_maximum_path_sum_1;

public class Ex18_func {
	/***
	 * 두 수중 큰 값 반환
	 * 
	 * 매개변수 :
	 * 		int _lhs : 좌측값
	 * 		int _rhs : 우측값
	 * 
	 * 반환값 :
	 * 		큰 값 반환
	 */
	public static int compare_val(int _lhs, int _rhs) {
		if(_lhs > _rhs) {
			return _lhs;
			
		} else {
			return _rhs;
		}
	}
}
