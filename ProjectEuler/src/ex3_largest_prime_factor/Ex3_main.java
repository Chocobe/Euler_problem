package ex3_largest_prime_factor;

public class Ex3_main {
	public static void main(String[] args) {
		
		// 타겟값 - int형의 범위를 넘기 때문에 long형으로 사용
		// long 형의 값은.. 값마지막에 L을 표시해 줘야 한다.
		long target_num = 600851475143L;
		
		for(int i = 1; i < target_num; i++) {
			
			if(target_num % i == 0) {
				target_num /= i;	// 소수인 경우, 나누기의 몫을 타겟값으로 변경
				
				i = 1; // 루프값 초기화
			}
		}
		
		// 루프의 초기화가 되지 못하고, 루프를 빠져나온 경우 -> 최대 소인수 값
		
		System.out.println("Largest prime factor is " + target_num);
	}
}
