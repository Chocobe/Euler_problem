package ex022_names_scores;

import java.io.IOException;
import java.math.BigInteger;

public class Ex22_main {
	public static void main(String[] args) throws IOException {
		
		// ��� ����
		String path = "D:\\java\\Euler_project(git)\\Euler_problem\\ProjectEuler\\src\\ex022_names_scores\\p022_names.txt";
		// ���� �о� ����
		String origin_data = Ex22_func.open_file(path);
		
		// ���� ���� ��ȯ���� ������ �迭 [���Ⱚ][���Ⱚ�� ������ ����]
		String[] temp_data = new String[2];
		
		// ������ ������ ����� �迭
		String[] name_arr = new String[0];
		
		// ���� ������ ���� �� ����
		while(origin_data.length() != 0) {
			// ���� ������ ����
			temp_data = Ex22_func.extractor(origin_data);
			// ������ �����͸� �����Ͽ� ����
			name_arr = Ex22_func.string_sort(temp_data[0], name_arr);
			// ���� �����Ϳ��� ���� ���ڿ��� ����
			origin_data = temp_data[1];
		}
		
		// �� �̸��� ���ھ� ����� �迭
		int[] name_value = new int[name_arr.length];
		
		for(int i = 0; i < name_value.length; i++) {
			// �� �̸��� ���ھ� ����
			name_value[i] = Ex22_func.get_score(name_arr[i]);
			
			System.out.println(name_arr[i] + " : " + name_value[i]);
		}
		
		System.out.println("\n---------- ��� ----------");
		
		// ���� ���ھ��� ����
		BigInteger total_score = new BigInteger("0");
		int cur_value = 0;
		
		for(int i = 0; i < name_value.length; i++) {
			// ���� ���� ���ھ� ���
			cur_value = (name_value[i] * (i + 1));
			
			// ���� ���ھ BigInteger������ ��ȯ
			BigInteger cur_name_score = new BigInteger(String.valueOf(cur_value));
			
			total_score = total_score.add(cur_name_score);
		}
		
		System.out.println("���� ���ھ� ���� : " + total_score);
	}
}
