package ex3_largest_prime_factor;

public class Ex3_main {
	public static void main(String[] args) {
		
		// Ÿ�ٰ� - int���� ������ �ѱ� ������ long������ ���
		// long ���� ����.. ���������� L�� ǥ���� ��� �Ѵ�.
		long target_num = 600851475143L;
		
		for(int i = 1; i < target_num; i++) {
			
			if(target_num % i == 0) {
				target_num /= i;	// �Ҽ��� ���, �������� ���� Ÿ�ٰ����� ����
				
				i = 1; // ������ �ʱ�ȭ
			}
		}
		
		// ������ �ʱ�ȭ�� ���� ���ϰ�, ������ �������� ��� -> �ִ� ���μ� ��
		
		System.out.println("Largest prime factor is " + target_num);
	}
}
