# Maximum path sum 1
# (최대 경로합 1)

By starting at the top of the triangle below and moving to adjacent numbers on the row below, 
the maximum total from top to bottom is 23.

(삼각형의 꼭대기에서 시작하고 행에 속하는 인접한 숫자로 이동함에 의해, 꼭대기에서 바닥까지의 최대 합은 23이다.)

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

("3 + 7 + 4 + 9 = 23" 이다.)

Find the maximum total from top to bottom of the triangle below:

(삼각형내의 꼭대기에서 부터 바닥까지의 최대합을 찾아라.)

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. 

(NOTE : 16384개 루트 밖에 없으므로, 모든 루트를 시도함으로써 이 문제를 해결할 수 있다.)

However, Problem 67, is the same challenge with a triangle containing one-hundred rows; 

(그러나, Problem 67은 100개 행을 갖는 삼각형에서 동일한 도전이다.)

it cannot be solved by brute force, and requires a clever method! ;o)

(이 문제는 막무가내로 풀 수 없고, 영리한 방법을 요구한다.)

# 문제점
알고리즘을 분석할 때, 중간과정을 생략하지 말고 모든것을 다 기록하자.

중간 생략부분 때문에 알고리즘의 규칙을 놓친다.