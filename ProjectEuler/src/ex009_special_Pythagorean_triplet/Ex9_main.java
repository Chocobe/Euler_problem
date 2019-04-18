package ex009_special_Pythagorean_triplet;

public class Ex9_main {
	public static void main(String[] args) {
		
		int total_sum = 1000;
		
		int val_a = 0;	// 변 a의 값
		int val_b = 0;	// 변 b의 값
		int val_c = 0;	// 변 c의 값
		
		int limit_a = (total_sum / 3);			// 변 a의 최대값
		int limit_b = (total_sum - val_a) / 2;	// 변 b의 최대값
		
		for(int i = 1; i <= limit_a; i++) {
			val_a = i;
			
			for(int j = (val_a + 1); j <= limit_b; j++) {
				val_b = j;
				val_c = total_sum - (val_a + val_b);
				
				// a^2 + b^2 = c^2
				if(Math.pow(val_a, 2) + Math.pow(val_b, 2) == Math.pow(val_c, 2)) {
					System.out.println("a값 : " + val_a);
					System.out.println("b값 : " + val_b);
					System.out.println("c값 : " + val_c);
					System.out.println("a * b * c 값 : " + val_a * val_b * val_c);
					
					return;
				} 
			}
		}
		
		System.out.println("없음");		
	}
}
