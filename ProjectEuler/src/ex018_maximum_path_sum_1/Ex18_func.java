package ex018_maximum_path_sum_1;

public class Ex18_func {
	/***
	 * �� ���� ū �� ��ȯ
	 * 
	 * �Ű����� :
	 * 		int _lhs : ������
	 * 		int _rhs : ������
	 * 
	 * ��ȯ�� :
	 * 		ū �� ��ȯ
	 */
	public static int compare_val(int _lhs, int _rhs) {
		if(_lhs > _rhs) {
			return _lhs;
			
		} else {
			return _rhs;
		}
	}
}
