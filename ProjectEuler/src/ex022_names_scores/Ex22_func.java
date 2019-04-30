package ex022_names_scores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex22_func {
	
	/***
	 * 파일 읽어오기
	 * 
	 * 매개변수 :
	 * 		String _path : 경로 문자열
	 * 
	 * 반환값 :
	 * 		String형 파일 내용
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
	 * "를 기준으로 문자열 추출하기
	 * 
	 * 매개변수 :
	 * 		String _origin : 원본 문자열
	 * 
	 * 반환값 :
	 * 		String 배열 : [추출한 문자열][추출 문자열을 제외한 데이터]
	 */
	public static String[] extractor(String _origin) {
		
		String origin_string = _origin;
		
		String[] result_arr = new String[2];
		String extraction;
		
		String temp_string;
		int search_idx = 0;
		
		// 첫번째 " 의 인덱스값
		search_idx = origin_string.indexOf('\"');
		// 첫번째 " 를 포함한 문자열
		temp_string = origin_string.substring(0, (search_idx + 1));
		// 첫번째 " 를 포함한 문자열 삭제
		origin_string = origin_string.replaceFirst(temp_string, "");
		
		// 첫번째 " 의 인덱스값
		search_idx = origin_string.indexOf('\"');
		// 문자열 추출
		extraction = origin_string.substring(0, search_idx);
		// 원본에서 제거할 문자열
		temp_string = origin_string.substring(0, (search_idx + 1));
		// 원본에서 추출 문자열 제거
		origin_string = origin_string.replaceFirst(temp_string, "");
		
		result_arr[0] = extraction;
		result_arr[1] = origin_string;
		
		return result_arr;
	}
	
	
	/***
	 * 문자열 비교
	 * 
	 * 매개변수 :
	 * 		String _lhs : 좌측 문자열
	 * 		String _rhs : 우측 문자열
	 * 
	 * 반환값 :
	 * 		좌측이 크면 1,
	 * 		우측이 크면 -1,
	 * 		같으면 0
	 */
	public static int compare_string(String _lhs, String _rhs) {
		int lhs_len = _lhs.length();	// 좌측 문자열 길이
		int rhs_len = _rhs.length();	// 우측 문자열 길이
		int min_len = 0;				// 둘 중 작은 문자열의 길이
		
		int result_val = -2;			// 반환할 변수
		
		char lhs_char;					// 현재 좌측 문자
		char rhs_char;					// 현재 우측 문자
		
		// 길이 비교 : 좌측이 클 때,
		if(lhs_len > rhs_len) {
			// 길이 최소값은 우측의 길이값
			min_len = rhs_len;
			
		// 길이 비교 : 좌측이 작거나 같을 떄,
		} else {
			// 길이 최소값은 좌측의 길이값
			min_len = lhs_len;
		}
		
		// 문자 비교
		for(int i = 0; i < min_len; i++) {
			lhs_char = _lhs.charAt(i);	// 현재 비교할 좌측 문자
			rhs_char = _rhs.charAt(i);	// 현재 비교할 우측 문자
			
			// 현재 문자가 같다면,
			if(lhs_char == rhs_char) {
				// 다음 인덱스로
				continue;
				
			// 좌측 문자가 크다면,
			} else if(lhs_char > rhs_char) {
				// 결과값 1 을 반환 & 종료
				result_val = 1;
				return result_val;
				
			// 우측 문자가 크다면,
			} else {
				// 결과값 -1 을 반환 & 종료
				result_val = -1;
				return result_val;
			}
		}
		
		// 메서드가 종료되지 않았다!?
		// 문자열의 최소 길이까지 비교한 결과, 동일할 경우,
		// 둘 중 문자열이 짧은게 작은 문자열이 된다.
		
		// 좌측 문자열 길이가 클 때,
		if(lhs_len > rhs_len) {
			result_val = 1;
			
		// 우측 문자열 길이가 클 떄,
		} else if (lhs_len < rhs_len) {
			result_val = -1;
		
		// 동일할 경우,
		} else {
			result_val = 0;
		}
		
		return result_val;
	}
	
	
	/***
	 * 입력 문자열을 알파벳 순으로 정렬하여 저장
	 * 
	 * 매개변수 :
	 * 		String _sour : 저장할 문자열
	 * 		String[] _dest : 정렬하여 저장할 공간
	 * 
	 * 반환값 :
	 * 		String[]형 배열
	 */
	public static String[] string_sort(String _sour, String[] _dest) {
		
		// 입력받은 배열의 길이
		int dest_len = _dest.length;
		// 반환할 배열 (정렬된 값)
		String[] result_arr = new String[dest_len + 1];
		// 비교한 결과값
		int compare_val = -2;
		// 좌측값 입력 완료 인덱스
		int inserted_idx = 0;
		// 좌측값 입력 완료 플래그
		boolean inserted_flag = false;
		
		// 정렬
		for(int i = 0; i < dest_len; i++) {
			// 두 문자열 비교
			compare_val = Ex22_func.compare_string(_sour, _dest[i]);
			
			// 좌측 문자열이 클 떄,
			if(compare_val == 1) {
				result_arr[i] = _dest[i];
			
			// 우측 문자열이 클 때,
			} else {
				result_arr[i] = _sour;
				// 좌측값의 정렬된 인덱스 번호
				inserted_idx = i;
				// 좌측값 입력 완료 플래그 true
				inserted_flag = true;
				
				// 비교 루프 종료
				break;
			}
		}
		
		// 좌측값 입력이 됬다면,
		if(inserted_flag) {	
			// 나머지 배열 요소들 저장
			for(int i = inserted_idx; i < dest_len; i++) {
				result_arr[i + 1] = _dest[i];
			}
			
		// 마지막까지 좌측값을 입력 못했다면, (좌측값이 가장 클 경우)
		} else {
			// 좌측값을 배열의 가장 뒤에 저장
			result_arr[dest_len] = _sour;	
		}
		
		return result_arr;
	}
	
	
	/***
	 * 문자열의 스코어 구하기
	 * 
	 * 매개변수 :
	 * 		String _sour
	 * 
	 * 반환값 :
	 * 		int형 문자열 스코어
	 */
	public static int get_score(String _sour) {
		
		// 스코어
		int score = 0;
		// 스코어 기준값
		int basic_val = "A".codePointBefore(1) - 1;
		// 입력 문자열의 길이
		int sour_len = _sour.length();
		
		// 현재 문자
		String cur_char = "";
		// 현재 문자의 값
		int cur_val = 0;
		
		for(int i = 0; i < sour_len; i++) {
			// 문자 하나 추출
			cur_char = _sour.substring(i, i + 1);
			// 추출한 문자의 값
			cur_val = cur_char.codePointBefore(1);
			
			// 각 문자의 값을 score에 누적
			score = score + (cur_val - basic_val);
		}
		
		return score;
	}
}
