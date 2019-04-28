package ex019_counting_sundays;

public class Ex19_main {
	public static void main(String[] args) {
		
		// ���� ��¥
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
		
		int cur_year = 1900;	// ���� �⵵
		int start_year = 1901;	// ���� �⵵
		int max_year = 2000;	// �ִ� �⵵
		
		int cur_day = 1;		// ���� �� 1���� ���� ��
								// 0 : ��
								// 1 : ��
								// 6 : ��
		
		int num_of_sunday = 0;	// �Ͽ��� ����
		
		while(cur_year <= max_year) {
			
			// ���� ���
			if(cur_year % 4 == 0) {
				month_table[1] = 29;	// ����
				
			} else {
				month_table[1] = 28;	// ���� �̿�
				
			}
			
			// �̹� �⵵�� �� ���� 1���� ���� ���ϱ�
			for(int i = 0; i < 12; i++) {
				cur_day = ((cur_day + month_table[i] % 7) % 7);
				
				if(cur_day == 0) {
					num_of_sunday++;
				}
			}
			
			// ���ϰ��� �ϴ� �⵵ ���������� �� �ʱ�ȭ
			if(cur_year == start_year - 1) {
				num_of_sunday = 0;
			}
			
			// ���� �⵵
			cur_year++;
		}
		
		System.out.println("�ſ� 1���� �Ͽ����� ���� : " + num_of_sunday);
	}
}
