package ex019_counting_sundays;

public class Ex19_main {
	public static void main(String[] args) {
		
		// 월별 날짜
		int month_table[] = new int[12];
		month_table[0]  = 31;
		month_table[1]  = 0;
		month_table[2]  = 31;
		month_table[3]  = 30;
		month_table[4]  = 31;
		month_table[5]  = 30;
		month_table[6]  = 31;
		month_table[7]  = 31;
		month_table[8]  = 30;
		month_table[9]  = 31;
		month_table[10] = 30;
		month_table[11] = 31;
		
		int cur_year = 1900;	// 현재 년도
		int start_year = 1901;	// 시작 년도
		int max_year = 2000;	// 최대 년도
		
		int cur_day = 1;		// 현재 달 1일의 요일 값
								// 0 : 일
								// 1 : 월
								// 6 : 토
		
		int num_of_sunday = 0;	// 일요일 개수
		
		while(cur_year <= max_year) {
			
			// 윤달 계산
			if(cur_year % 4 == 0) {
				month_table[1] = 29;	// 윤달
				
			} else {
				month_table[1] = 28;	// 윤달 이외
				
			}
			
			// 이번 년도의 각 월별 1일의 요일 구하기
			for(int i = 0; i < 12; i++) {
				cur_day = ((cur_day + month_table[i] % 7) % 7);
				
				if(cur_day == 0) {
					num_of_sunday++;
				}
			}
			
			// 구하고자 하는 년도 이전까지의 값 초기화
			if(cur_year == start_year - 1) {
				num_of_sunday = 0;
			}
			
			// 다음 년도
			cur_year++;
		}
		
		System.out.println("매월 1일이 일요일인 개수 : " + num_of_sunday);
	}
}
