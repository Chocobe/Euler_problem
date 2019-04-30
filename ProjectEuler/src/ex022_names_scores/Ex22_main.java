package ex022_names_scores;

import java.io.IOException;
import java.math.BigInteger;

public class Ex22_main {
	public static void main(String[] args) throws IOException {
		
		// 경로 설정
		String path = "D:\\java\\Euler_project(git)\\Euler_problem\\ProjectEuler\\src\\ex022_names_scores\\p022_names.txt";
		// 파일 읽어 오기
		String origin_data = Ex22_func.open_file(path);
		
		// 추출 직후 반환값을 저장할 배열 [추출값][추출값을 제외한 원본]
		String[] temp_data = new String[2];
		
		// 추출한 데이터 저장용 배열
		String[] name_arr = new String[0];
		
		// 파일 내용이 없을 떄 까지
		while(origin_data.length() != 0) {
			// 개별 데이터 추출
			temp_data = Ex22_func.extractor(origin_data);
			// 추출한 데이터를 정렬하여 저장
			name_arr = Ex22_func.string_sort(temp_data[0], name_arr);
			// 원본 데이터에서 추출 문자열을 제거
			origin_data = temp_data[1];
		}
		
		// 각 이름별 스코어 저장용 배열
		int[] name_value = new int[name_arr.length];
		
		for(int i = 0; i < name_value.length; i++) {
			// 각 이름별 스코어 저장
			name_value[i] = Ex22_func.get_score(name_arr[i]);
			
			System.out.println(name_arr[i] + " : " + name_value[i]);
		}
		
		System.out.println("\n---------- 결과 ----------");
		
		// 네임 스코어의 총합
		BigInteger total_score = new BigInteger("0");
		int cur_value = 0;
		
		for(int i = 0; i < name_value.length; i++) {
			// 현재 네임 스코어 계산
			cur_value = (name_value[i] * (i + 1));
			
			// 네임 스코어를 BigInteger형으로 변환
			BigInteger cur_name_score = new BigInteger(String.valueOf(cur_value));
			
			total_score = total_score.add(cur_name_score);
		}
		
		System.out.println("네임 스코어 총합 : " + total_score);
	}
}
