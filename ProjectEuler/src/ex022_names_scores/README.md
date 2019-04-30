# Names scores
# (네임 스코어)

Using "names.txt" (right click and 'Save Link/Target As...'), 
a 46K text file containing over five-thousand first names, 
begin by sorting it into alphabetical order. 

(5천개 이상 첫번째 이름(성)을 포함하는 46k 텍스트파일인 name.txt(우클릭하여 다른이름으로 저장)을 사용하여,
알파벳 순으로 정렬해라.)

Then working out the alphabetical value for each name, 
multiply this value by its alphabetical position in the list to obtain a name score.

(그리고 각 이름의 알파벳 값을 계산하고, 이 값을 "네임 스코어"를 얻기위한 리스트에서 알파벳 위치와 곱해라.)

For example, when the list is sorted into alphabetical order, COLIN, 
which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938 × 53 = 49714.

(예를 들면, 리스트가 알파벳 순으로 정렬되었을 떄, "COLIN"은 "3 + 15 + 12 + 9 + 14 = 53"값이고,
리스트에서 938번째 이름이다.
그래서 "COLIN"은 "938 x 53 = 49714"를 얻을 것이다.)

What is the total of all the name scores in the file?

(파일안의 모든 "네임 스코어"의 합은 얼마인가?)

# 흐름도
1. 파일 읽어오기 (모듈1)
2. "이름" 추출 (모듈2)
3. 정렬하여 저장 (모듈3)

-------파일 != null 이면, "2"과정으로

4. "이름" 의 알파벳 값 구하기
5. 각 "name socre" 구하기
6. 총 합

# 문제점_1 <.txt파일 읽기>

.txt파일을 불러오는 방법을 배웠다.
(파일의 경로를 갖는 File형 변수)

스트림 열기
(FileReader형 스트림 생성)

열어둔 파일의 내용을 읽기 위한 버퍼 생성
(BufferedReader형 변수)

버퍼에서 데이터 읽기
(버퍼변수.readLine() 메서드 실행)

# 문제점_2 <데이터 추출하기>
문자열 변수.indexOf() 메서드와
문자열 변수.substring() 메서드 사용

# 문제점_3 <문자 비교>
문자를 비교하는것은 어렵지 않지만,
비교한 결과값을 처리하는것이 어려웠다.
이는 클때(1), 작을떄(-1), 같을때(0) 의 플래그 형식으로 처리해였다.

# 문제점_4 <문자 비교를 사용한 정렬>
클때(1), 작을떄(-1), 같을때(0)의 처리에 헷갈림이 문제였지만,
그 외에는 할만 했다.