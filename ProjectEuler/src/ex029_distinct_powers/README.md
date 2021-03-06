# Distinct powers
# (구별되는 거듭제곱)

Consider all integer combinations of a, b for 2 ≤ a ≤ 5 and 2 ≤ b ≤ 5:

(2 ≤ a ≤ 5, 2 ≤ b ≤ 5 인 범위의 a와 b의 모든 정수 조합들을 생각해보자.)

2 ^ 2 = 4, 2 ^ 3 = 8, 2 ^ 4 = 16, 2 ^ 5 = 32
3 ^ 2 = 9, 3 ^ 3 = 27, 3 ^ 4 = 81, 3 ^ 5 = 243
4 ^ 2 = 16, 4 ^ 3 = 64, 4 ^ 4 = 256, 4 ^ 5 = 1024
5 ^ 2 = 25, 5 ^ 3 = 125, 5 ^ 4 = 625, 5 ^ 5 = 3125

If they are then placed in numerical order, with any repeats removed, 
we get the following sequence of 15 distinct terms:

(만약 모든 반복을 제거하여 숫자 순으로 정렬하여 놓으면, 15개 구별되는 항의 순서를 얻는다.)

4, 8, 9, 16, 25, 27, 32, 64, 81, 125, 243, 256, 625, 1024, 3125

How many distinct terms are in the sequence generated by a, b for 
2 ≤ a ≤ 100 and 2 ≤ b ≤ 100?

(2 ≤ a ≤ 100, 2 ≤ b ≤ 100 범위인 a와 b에 의해 순차적으로 생성되는 것 안에서 구별되는 항들은 몇개인가?)

# 문제점_1
처음 메서드 구상에서 b에 대한 모든 값을 검사하는 방법을 생각했다.

이 경우, 8 ^ 6 == 4 ^ 9 을 검사할 수가 없었다.

이전 문제들에서도 반성했던...

"하나의 메서드에서는 하나의 기능만 수행하도록 할 것" 을 생각하지 않았다.

명심하자.

기능을 세분화 하여 private 메서드를 만들자.

#문제점_2
x ^ y 의 계산 빈도를 최대한 줄이기 위해서는 log(x)y가 필요했다.

JAVA내의 log 메서드는 log(10)y 만 지원하기 때문에,

log의 밑교환 법칙을 사용하여 log(x)y를 만들어 사용했다.

	log(c)y / log(c)x == log(x)y