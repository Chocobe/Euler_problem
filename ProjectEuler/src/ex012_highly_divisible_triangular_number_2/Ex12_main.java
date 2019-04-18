package ex012_highly_divisible_triangular_number_2;

public class Ex12_main {
	public static void main(String[] args) {
		
		int purpose_factor = 500;
		int cur_factor = 0;
		
		int cur_tri_num = 0;
		int cur_tri_size = 0;
		
		while(cur_factor <= purpose_factor) {
			cur_tri_size++;
			
			cur_tri_num = Ex12_calc.triangular_num(cur_tri_size);
			cur_factor = Ex12_calc.factor_cnt(cur_tri_num);
		}
		
		System.out.println(purpose_factor + "개 이상의 인수를 가진 첫 삼각수 : " + cur_tri_num);
		System.out.println("이 삼각수의 최대 인수 : " + cur_tri_size);
		System.out.println("인수 갯수 : " + cur_factor);
	}
}
