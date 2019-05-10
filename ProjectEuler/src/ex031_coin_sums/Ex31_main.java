package ex031_coin_sums;

public class Ex31_main {
	public static void main(String[] args) {
		
		// 연산 시작 시간
		long begin_time = System.nanoTime();
		
		int[] coin_table = {200, 100, 50, 20, 10, 5, 2, 1};
		
		Ex31_func main_obj = new Ex31_func(coin_table);
		
		// TEST
		main_obj.print_coin_table();
		System.out.println("-----------------------");
		
		main_obj.combine_ways(200);
		
		long end_time = System.nanoTime();
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("연산 수행시간 : " + operating_time);
	}
}
