package ex024_lexicographic_permutations;

public class Ex24_main {
	public static void main(String[] args) {
		
		int permutation_num = 1000000;
		long result_num = 0;
		
		result_num = Ex24_func.permutation(permutation_num);
		
		System.out.println(permutation_num + "번째 순열 : " + result_num);
	}
}
