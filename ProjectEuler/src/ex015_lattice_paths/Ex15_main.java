package ex015_lattice_paths;

public class Ex15_main {
	public static void main(String[] args) {
		
		int row = 20;	// ��
		int col = 20;	// ��
		
		long permutation_val = permutation(row, col);
		
		System.out.println(row + "x" + col + " �� �ִܰ�� ���� : " + permutation_val);
		
	}
	
	// ���� ��� �޼���
	public static long permutation(int _row, int _col) {
		
		long result_val = 1;				// �����
		int sum_row_col = _row + _col;		// ��, ���� ��
		
		long col_permutation = 1;			// ���� ������
		
		// "��"�κ��� ��� ����� ���·� ���� ����
		for(int i = _row + 1; i <= sum_row_col; i++) {
			
			result_val *= i;
			col_permutation *= i - _row;
			
			// �������� 0�� ����, ��� ������.
			if(result_val % col_permutation == 0) {
				result_val /= col_permutation;
				col_permutation = 1;
			}
		}
		
		return result_val;
	}
}
