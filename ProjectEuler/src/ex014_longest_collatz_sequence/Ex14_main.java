package ex014_longest_collatz_sequence;

public class Ex14_main {
	public static void main(String[] args) {
		
		int limit_num = 1000000;	// �Ѱ谪
		
		long cur_data = 0;			// ���簪
		int cur_chain = 0;			// ���� ü�μ�
		
		int most_chain = 0;			// ���� ���� ü�� ����
		long most_chain_num = 0;	// ���� ���� ü���� ������
		
		// ü�ΰ� ���� ���̺��� �ε��� �Ѱ谪
		int table_idx_limit = 10000;
		// ü�ΰ� ���� ���̺�
		int chain_table[] = new int[table_idx_limit];
		
		// i�� ����Ͽ� ������ �Ѱ谪���� ����
		for(int i = 1; i < limit_num; i++) {
			
			cur_data = i;	// collatz�� ������ ���
			cur_chain = 0;	// ���簪�� ���� ü�� ����
			
			while(cur_data != 0) {	// ���簪�� 0�̸�, collatz ���� ���� ����
				
				// ü�� ���̺��� �����ϱ����� �ε��� ����
				if(cur_data < table_idx_limit) {
					// ���� �������� ü�� ���̺� �����Ͱ� �ִٸ�,
					if(chain_table[(int)cur_data] != 0) {
						
						// �����Ͽ� ���� ü�ΰ��� ����
						cur_chain += chain_table[(int)cur_data];
						
						// ���̺� ������ ���� ������ ��� ������ �̹� ����Ǿ���
						// -> ���簪 ���� ����
						break;
					}
				}
				
				// ���簪�� collatz �ѹ� ����
				cur_data = Ex14_func.collatz_sequence(cur_data);
				// ü�� ���� �ϳ� ����
				cur_chain++;				
			}
			
			//
			// ü�� ���̺��� �����ϱ� ���� �κ�
			//
			// ���簪�� ü�����̺��� �ε��� ���ǿ� �����ϰ�,
			if(i < table_idx_limit) {
				// ü�����̺��� ���� ���ŵ��� �ʾҴٸ�,
				if(chain_table[i] == 0) {
					
					// ���簪�� �ش��ϴ� ü�����̺� ����
					chain_table[i] = cur_chain;
				}
			}
			
			// ���� ü�� ������ �ִ� ü�� ���� ���� ���ٸ�,
			if(cur_chain > most_chain) {
				most_chain = cur_chain;		// �ְ� ü�μ� ����
				most_chain_num = i;			// �� ���� ������ ����
			}
		}
		
		System.out.println("�ְ� ü�� ���� : " + most_chain);
		System.out.println("�ְ� ü�μ��� ������ : " + most_chain_num);
	}
}
