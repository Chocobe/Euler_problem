package ex014_longest_collatz_sequence;

public class Ex14_func {
	
	/*
	 * �Է°�(�Ű����� _origin)�� collatz ���� �� ��� ��ȯ
	 * 
	 * �Ű����� :
	 * 		long _origin : �Է� ������
	 * 
	 * ��ȯ�� :
	 * 		�Է� �����Ϳ� collatz ������ �����
	 */
	public static long collatz_sequence(long _origin) {
		
		long cur_data = _origin;		// ���� �����Ͱ�
		
		// ���� �����Ͱ� ¦���� ���
		if(cur_data % 2 == 0) {
			cur_data /= 2;
			
		// ���� �����Ͱ� Ȧ���� ��� (1�� �ƴ�)
		} else if(cur_data % 2 != 0 && cur_data != 1) {
			cur_data = cur_data * 3 + 1;
			
		// ���� �����Ͱ� 1�� ���
		} else {
			cur_data = 0;
			
		}
		
		return cur_data;
	}
}
