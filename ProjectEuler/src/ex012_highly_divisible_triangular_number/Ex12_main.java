package ex012_highly_divisible_triangular_number;

public class Ex12_main {
	public static void main(String[] args) {
		
		int purpose_factor = 500;		// 목표 인수의 갯수(초과값)

		long cur_tri_num = 0;		// 현재 삼각수
		int cur_tri_size = 0;		// 현재 삼각수의 최대 인수값
		int cur_tri_factor = 0;		// 현재 삼각수의 인수 갯수
		
		while(true) {
			
			cur_tri_factor = 0;
			cur_tri_size++;
			cur_tri_num = Ex12_calc.triangular_num(cur_tri_size);
			
			cur_tri_factor = Ex12_calc.factor_cnt(cur_tri_num);
			
			if(cur_tri_factor > purpose_factor) {
				System.out.println("삼각수 값 : " + cur_tri_num);
				System.out.println(cur_tri_num + "의 최대 인수 값 : " + cur_tri_size);
				System.out.println(cur_tri_num + "의 인수 갯수 : " + cur_tri_factor);
				
				break;
			}
		}
	}
}
