package ex015_lattice_paths;

public class Ex15_main {
	public static void main(String[] args) {
		
		int row = 20;	// 행
		int col = 20;	// 열
		
		long permutation_val = permutation(row, col);
		
		System.out.println(row + "x" + col + " 의 최단경로 개수 : " + permutation_val);
		
	}
	
	// 순열 계산 메서드
	public static long permutation(int _row, int _col) {
		
		long result_val = 1;				// 결과값
		int sum_row_col = _row + _col;		// 행, 열의 합
		
		long col_permutation = 1;			// 열의 순열값
		
		// "행"부분은 모두 약분한 상태로 루프 시작
		for(int i = _row + 1; i <= sum_row_col; i++) {
			
			result_val *= i;
			col_permutation *= i - _row;
			
			// 나머지가 0일 때는, 즉시 나눈다.
			if(result_val % col_permutation == 0) {
				result_val /= col_permutation;
				col_permutation = 1;
			}
		}
		
		return result_val;
	}
}
