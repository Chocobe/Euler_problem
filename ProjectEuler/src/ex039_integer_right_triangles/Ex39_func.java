package ex039_integer_right_triangles;

public class Ex39_func {
	
	/***
	 * 입력값을 둘레로 가지는 직각삼각형 개수 구하기
	 * 
	 * 매개변수 :
	 * 		int _perimeter : 둘레값
	 * 
	 * 반환값 :
	 * 		int형 직각삼각형 개수
	 */
	public static int calc_right_triangle(int _perimeter) {
		int triangle_cnt = 0;			// 직각 삼각형 개수
		int limit_a = _perimeter / 2;	// 변 a의 최대값
		
		int side_a = 0;		// 변 a
		int side_b = 0;		// 변 b
		int side_c = 0;		// 변 c
		
		double pow_a = 0f;	// 변 a^2
		double pow_b = 0f;	// 변 b^2
		double pow_c = 0f;	// 변 c^2
		
		for(side_a = 1; side_a < limit_a; side_a++) {
			for(side_b = 1; side_b <= side_a; side_b++) {
				// 변 c값 도출
				side_c = _perimeter - (side_a + side_b);
				
				// 루프 탈출 조건
				if(side_a >= side_c) {
					break;
				}
				
				// 각 변의 제곱
				pow_a = Math.pow(side_a, 2);
				pow_b = Math.pow(side_b, 2);
				pow_c = Math.pow(side_c, 2);
				
				// 직각 삼각형 조건 검사 (a^2 + b^2 == c^2)
				if(pow_a + pow_b == pow_c) {
					triangle_cnt++;
				}
			}
		}
			
		return triangle_cnt;
	}
}





































