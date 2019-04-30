package ex022_names_scores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex22_func {
	
	/***
	 * ���� �о����
	 * 
	 * �Ű����� :
	 * 		String _path : ��� ���ڿ�
	 * 
	 * ��ȯ�� :
	 * 		String�� ���� ����
	 * @throws IOException 
	 */
	public static String open_file(String _path) throws IOException {
		String extraction;
		
		File file = new File(_path);
		FileReader file_stream = new FileReader(file);
		BufferedReader buffer = new BufferedReader(file_stream);
		
		extraction = buffer.readLine();
		
		file_stream.close();		
		
		return extraction;
	}
	
	
	/***
	 * "�� �������� ���ڿ� �����ϱ�
	 * 
	 * �Ű����� :
	 * 		String _origin : ���� ���ڿ�
	 * 
	 * ��ȯ�� :
	 * 		String �迭 : [������ ���ڿ�][���� ���ڿ��� ������ ������]
	 */
	public static String[] extractor(String _origin) {
		
		String origin_string = _origin;
		
		String[] result_arr = new String[2];
		String extraction;
		
		String temp_string;
		int search_idx = 0;
		
		// ù��° " �� �ε�����
		search_idx = origin_string.indexOf('\"');
		// ù��° " �� ������ ���ڿ�
		temp_string = origin_string.substring(0, (search_idx + 1));
		// ù��° " �� ������ ���ڿ� ����
		origin_string = origin_string.replaceFirst(temp_string, "");
		
		// ù��° " �� �ε�����
		search_idx = origin_string.indexOf('\"');
		// ���ڿ� ����
		extraction = origin_string.substring(0, search_idx);
		// �������� ������ ���ڿ�
		temp_string = origin_string.substring(0, (search_idx + 1));
		// �������� ���� ���ڿ� ����
		origin_string = origin_string.replaceFirst(temp_string, "");
		
		result_arr[0] = extraction;
		result_arr[1] = origin_string;
		
		return result_arr;
	}
	
	
	/***
	 * ���ڿ� ��
	 * 
	 * �Ű����� :
	 * 		String _lhs : ���� ���ڿ�
	 * 		String _rhs : ���� ���ڿ�
	 * 
	 * ��ȯ�� :
	 * 		������ ũ�� 1,
	 * 		������ ũ�� -1,
	 * 		������ 0
	 */
	public static int compare_string(String _lhs, String _rhs) {
		int lhs_len = _lhs.length();	// ���� ���ڿ� ����
		int rhs_len = _rhs.length();	// ���� ���ڿ� ����
		int min_len = 0;				// �� �� ���� ���ڿ��� ����
		
		int result_val = -2;			// ��ȯ�� ����
		
		char lhs_char;					// ���� ���� ����
		char rhs_char;					// ���� ���� ����
		
		// ���� �� : ������ Ŭ ��,
		if(lhs_len > rhs_len) {
			// ���� �ּҰ��� ������ ���̰�
			min_len = rhs_len;
			
		// ���� �� : ������ �۰ų� ���� ��,
		} else {
			// ���� �ּҰ��� ������ ���̰�
			min_len = lhs_len;
		}
		
		// ���� ��
		for(int i = 0; i < min_len; i++) {
			lhs_char = _lhs.charAt(i);	// ���� ���� ���� ����
			rhs_char = _rhs.charAt(i);	// ���� ���� ���� ����
			
			// ���� ���ڰ� ���ٸ�,
			if(lhs_char == rhs_char) {
				// ���� �ε�����
				continue;
				
			// ���� ���ڰ� ũ�ٸ�,
			} else if(lhs_char > rhs_char) {
				// ����� 1 �� ��ȯ & ����
				result_val = 1;
				return result_val;
				
			// ���� ���ڰ� ũ�ٸ�,
			} else {
				// ����� -1 �� ��ȯ & ����
				result_val = -1;
				return result_val;
			}
		}
		
		// �޼��尡 ������� �ʾҴ�!?
		// ���ڿ��� �ּ� ���̱��� ���� ���, ������ ���,
		// �� �� ���ڿ��� ª���� ���� ���ڿ��� �ȴ�.
		
		// ���� ���ڿ� ���̰� Ŭ ��,
		if(lhs_len > rhs_len) {
			result_val = 1;
			
		// ���� ���ڿ� ���̰� Ŭ ��,
		} else if (lhs_len < rhs_len) {
			result_val = -1;
		
		// ������ ���,
		} else {
			result_val = 0;
		}
		
		return result_val;
	}
	
	
	/***
	 * �Է� ���ڿ��� ���ĺ� ������ �����Ͽ� ����
	 * 
	 * �Ű����� :
	 * 		String _sour : ������ ���ڿ�
	 * 		String[] _dest : �����Ͽ� ������ ����
	 * 
	 * ��ȯ�� :
	 * 		String[]�� �迭
	 */
	public static String[] string_sort(String _sour, String[] _dest) {
		
		// �Է¹��� �迭�� ����
		int dest_len = _dest.length;
		// ��ȯ�� �迭 (���ĵ� ��)
		String[] result_arr = new String[dest_len + 1];
		// ���� �����
		int compare_val = -2;
		// ������ �Է� �Ϸ� �ε���
		int inserted_idx = 0;
		// ������ �Է� �Ϸ� �÷���
		boolean inserted_flag = false;
		
		// ����
		for(int i = 0; i < dest_len; i++) {
			// �� ���ڿ� ��
			compare_val = Ex22_func.compare_string(_sour, _dest[i]);
			
			// ���� ���ڿ��� Ŭ ��,
			if(compare_val == 1) {
				result_arr[i] = _dest[i];
			
			// ���� ���ڿ��� Ŭ ��,
			} else {
				result_arr[i] = _sour;
				// �������� ���ĵ� �ε��� ��ȣ
				inserted_idx = i;
				// ������ �Է� �Ϸ� �÷��� true
				inserted_flag = true;
				
				// �� ���� ����
				break;
			}
		}
		
		// ������ �Է��� ��ٸ�,
		if(inserted_flag) {	
			// ������ �迭 ��ҵ� ����
			for(int i = inserted_idx; i < dest_len; i++) {
				result_arr[i + 1] = _dest[i];
			}
			
		// ���������� �������� �Է� ���ߴٸ�, (�������� ���� Ŭ ���)
		} else {
			// �������� �迭�� ���� �ڿ� ����
			result_arr[dest_len] = _sour;	
		}
		
		return result_arr;
	}
	
	
	/***
	 * ���ڿ��� ���ھ� ���ϱ�
	 * 
	 * �Ű����� :
	 * 		String _sour
	 * 
	 * ��ȯ�� :
	 * 		int�� ���ڿ� ���ھ�
	 */
	public static int get_score(String _sour) {
		
		// ���ھ�
		int score = 0;
		// ���ھ� ���ذ�
		int basic_val = "A".codePointBefore(1) - 1;
		// �Է� ���ڿ��� ����
		int sour_len = _sour.length();
		
		// ���� ����
		String cur_char = "";
		// ���� ������ ��
		int cur_val = 0;
		
		for(int i = 0; i < sour_len; i++) {
			// ���� �ϳ� ����
			cur_char = _sour.substring(i, i + 1);
			// ������ ������ ��
			cur_val = cur_char.codePointBefore(1);
			
			// �� ������ ���� score�� ����
			score = score + (cur_val - basic_val);
		}
		
		return score;
	}
}
