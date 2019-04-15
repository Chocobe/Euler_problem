package ex4_largest_palindrome_product;

public class Ex4_main {
	public static void main(String[] args) {
		
		int lhs = 3;				// 좌변 최대 자릿수
		int rhs = 3;				// 우변 최대 자릿수
		int target_num = 0;			// 타겟값
		int pos_num = 0;			// 타겟값의 자릿수
		boolean check_pali = false;	// 회문 여부값 
		
		int lhs_max = (int)Math.pow(10, lhs) - 1;	// 좌변 최대값
		int rhs_max = (int)Math.pow(10, rhs) - 1;	// 우변 최대값	

		// 틀렸던 부분
		//
		// for(int j = 0; j < lhs_max; j++)
		// 로 사용했다.
		//
		// 이와 같이 연산을 하게 되면,
		// i값이 999 일때, j 가 0 부터 (lhs_max - 1) 을 진행해 버린다.
		// 때문에 "999 * 91" 값이 가장 빨리 검출 되며, 값은 90900
		//
		// 하지만, j값을 10단위로 루프를 돌리게 되면,
		// "999 * 913" 값을 가장 빨리 검출 하며, 값은 906609
		//
		// 즉, 최대값을 첫번째로 검출하기 위해서는..
		// 큰값이 먼저 나오도록 루프를 만들어야 한다.
		// (우변 10감산당 좌변 -1 값을 감산해주는 방식으로)
		for(int i = 0; i < lhs_max; i++) {
			for(int j = 0; j < 10; j++) {
				
				// 현 루프의 타겟값 도출
				target_num = (lhs_max - i) * (rhs_max - j);
				
				// 타겟값의 최대 10의 지수값 도출
				pos_num = Ex4_calc.get_pos_num(target_num);
				
				// 타겟값을 저장할 배열 생성
				int[] element_num = new int[pos_num];
				
				// -> element_num[] 에 타겟값 분할 저장 
				Ex4_calc.divid_num(target_num, pos_num, element_num);
				
				// 상단 검사 완료
				
				// 양 끝값 비교
				check_pali = Ex4_calc.check_pali(element_num, pos_num);
				if(check_pali == true) {
					System.out.println("회문값 : " + target_num);
					System.out.println("좌측값 : " + (lhs_max - i));
					System.out.println("우측값 : " + (rhs_max - j));
					
					return;
				}
			}
		}
	}
}
