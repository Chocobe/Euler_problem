package ex028_number_spiral_diagonals;

public class Ex28_main {
	public static void main(String[] args) {
		
		// �밢�� ����
		int diagonal_len = 1001;
		Ex28_calc spiral = new Ex28_calc();
		
		spiral.calc_diagonal(diagonal_len);
		
		System.out.println("�밢�� ���� : " + diagonal_len);
		System.out.println("���Ǻ� �� : " + spiral.sum);
	}
}
