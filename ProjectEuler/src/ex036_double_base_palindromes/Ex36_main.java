package ex036_double_base_palindromes;

public class Ex36_main {
	public static void main(String[] args) {
		
		// ���� �ð�
		long begin_time = System.nanoTime();
		
		int limit_target = 1000000;			// ����� �ִ밪
		int[] palindrome_arr = new int[0];	// ȸ���� ������ �迭
		
		String str_dec = "";	// ����� 10���� ���ڿ�
		String str_bin = "";	// ����� 2���� ���ڿ�
		
		boolean dec_palindrome = false;		// 10������ ȸ���˻� ���
		boolean bin_palindrome = false;		// 2������ ȸ���˻� ���
		
		int sum_of_palindrome = 0;			// ������ �����ϴ� ���� �� ��
		
		for(int i = 0; i < limit_target; i++) {
			// ����� 10���� ���ڿ� ����ȯ
			str_dec = String.valueOf(i);
			// ����� 2���� ���ڿ� ����ȯ
			str_bin = Integer.toBinaryString(i);
			
			// 10���� ȸ�� �˻�
			dec_palindrome = Ex36_func.is_palindrome(str_dec);
			// 2���� ȸ�� �˻�
			bin_palindrome = Ex36_func.is_palindrome(str_bin);
			
			// 10���� ȸ�� && 2���� ȸ�� �˻�
			if(dec_palindrome == true && bin_palindrome == true) {
				palindrome_arr = Ex36_func.add_idx(i, palindrome_arr);
			}
		}
		
		for(int i = 0; i < palindrome_arr.length; i++) {
			System.out.println("palindrome_arr[" + i + "] : " + palindrome_arr[i]);
			sum_of_palindrome += palindrome_arr[i];
		}
		
		System.out.println("total sum of palindrome : " + sum_of_palindrome);
		
		// ����ð�
		long end_time = System.nanoTime();
		double operating_time = (double)((end_time - begin_time) / Math.pow(10, 9));
		System.out.println("���� �ð� : " + operating_time);
	}
}
