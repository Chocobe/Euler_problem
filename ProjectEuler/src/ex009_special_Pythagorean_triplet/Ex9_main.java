package ex009_special_Pythagorean_triplet;

public class Ex9_main {
	public static void main(String[] args) {
		
		int total_sum = 1000;
		
		int val_a = 0;	// �� a�� ��
		int val_b = 0;	// �� b�� ��
		int val_c = 0;	// �� c�� ��
		
		int limit_a = (total_sum / 3);			// �� a�� �ִ밪
		int limit_b = (total_sum - val_a) / 2;	// �� b�� �ִ밪
		
		for(int i = 1; i <= limit_a; i++) {
			val_a = i;
			
			for(int j = (val_a + 1); j <= limit_b; j++) {
				val_b = j;
				val_c = total_sum - (val_a + val_b);
				
				// a^2 + b^2 = c^2
				if(Math.pow(val_a, 2) + Math.pow(val_b, 2) == Math.pow(val_c, 2)) {
					System.out.println("a�� : " + val_a);
					System.out.println("b�� : " + val_b);
					System.out.println("c�� : " + val_c);
					System.out.println("a * b * c �� : " + val_a * val_b * val_c);
					
					return;
				} 
			}
		}
		
		System.out.println("����");		
	}
}
