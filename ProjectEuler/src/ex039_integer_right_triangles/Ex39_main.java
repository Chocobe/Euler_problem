package ex039_integer_right_triangles;

public class Ex39_main {
	public static void main(String[] args) {
		
		// 시작 시간
		long begin_time = System.nanoTime();
		
		int limit_perimeter = 1000;		// 둘레 한계값
		int maximum_cnt = 0;			// 직각 삼각형의 최대 개수
		int maximum_perimeter = 0;		// 직각 삼각형의 최대 개수 일 때, 둘레값
		int cur_cnt = 0;				// 현재 직각 삼각형의 개수
		
		for(int i = 1; i <= limit_perimeter; i++) {
			// 현재 둘레에서 직각삼각형 개수 연산
			cur_cnt = Ex39_func.calc_right_triangle(i);
			
			// 직각 삼각형 최대 개수 비교
			if(cur_cnt > maximum_cnt) {
				maximum_cnt = cur_cnt;
				maximum_perimeter = i;
			}
		}
		
		System.out.println("maximum right triangle count : " + maximum_cnt);
		System.out.println("maximum right triangle perimeter : " + maximum_perimeter);
		
		// 종료 시간
		long end_time = System.nanoTime();
		// 수행 시간
		double operating_time = (end_time - begin_time) / Math.pow(10, 9);
		System.out.println("수행 시간 : " + operating_time);		
	}
}