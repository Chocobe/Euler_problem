package ex029_distinct_powers;

public class Ex29_main {
	public static void main(String[] args) {
		
		long begin_time = System.nanoTime();
		
		int min_base = 2;
		int max_base = 100;
		int min_exponent = 2;
		int max_exponent = 100;
		
		Ex29_func distinct_powers = new Ex29_func(min_base, max_base, min_exponent, max_exponent);
		
		distinct_powers.get_inform();
		
		long end_time = System.nanoTime();
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		
		System.out.println("수행 시간 : " + operating_time);
	}
}