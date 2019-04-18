package ex005_smallest_multiple;

public class Ex5_main {
	public static void main(String[] args) {

		int max_num = 20;			// 범위의 최대값
		int min_num = 1;			// 범위의 최소값
		
		int cur_gcd = max_num;		// 루프 상의 최대공약수 (Greatest Common Divisior)
		int cur_lsm = max_num;		// 루프 상의 최소공배수 (Least Common Multiple)
		
		for(int i = min_num; i < max_num; i++) {
			
			// 최소공배수 = (x * y) / 최대공약수
			cur_gcd = Ex5_calc.gcd(cur_lsm, i);
			cur_lsm = (cur_lsm * i) / cur_gcd;
			
		}
		
		System.out.println(min_num + " ~ " + max_num + "의 최소공배수 : " + cur_lsm);
	}
}
