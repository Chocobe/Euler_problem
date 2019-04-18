package ex001_multiples_of_3_and_5;

public class Ex1_main {
	public static void main(String[] args) {
		
		int sum = 0;							// 합계
		int limit_num = 1000;					// 한계값(미만의 값)
		int multiple_3 = 3;						// 배수 조건1
		int multiple_5 = 5;						// 배수 조건2
		int overlap = multiple_3 * multiple_5;	// 중복값
		
		sum += sum_of_multiple_of(multiple_3, limit_num);	// 3의 배수의 총합
		sum += sum_of_multiple_of(multiple_5, limit_num);	// 5의 배수의 총합		
		sum -= sum_of_multiple_of(overlap, limit_num);		// 중복값(15) 배제
		
		System.out.println("Sum of Multiples of 3 and 5 : " + sum);
	}
	
	/***
	 * 메서드 : "_val"값의 배수의 총합 (한계값 까지)
	 * 
	 * Ex1_main 클래스의 객체를 만들어서 사용하는게 아니기 때문에,
	 * 정적 메서드로 생성 (static method)
	 */
	public static int sum_of_multiple_of(int _val, int _max) {
		
		int temp = 0;	// 루프당 해당값 저장
		
		for(int i = 0; i * _val < _max; i++) {
			temp += (i * _val);
		}
		
		return temp;
	}
}
