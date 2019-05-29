# Champernowne's constant
# (Champernowne의 수들)

An irrational decimal fraction is created by concatenating the positive integers:

(비논리적인 소수점 분수는 양의 정수들을 연결하는 것에 의해 만들어 진다.)

0.123456789101112131415161718192021...

It can be seen that the 12th digit of the fractional part is 1.

(분수의 12번째 숫자가 "1"임을 알 수 있다.)

If d(n) represents the (n)th digit of the fractional part, find the value of the following expression.

(만약 d(n)이 분수의 n번째 숫자를 표현한다면, 다음 표현의 값을 찾아라.)

d(1) × d(10) × d(100) × d(1000) × d(10000) × d(100000) × d(1000000)

#문제점_1
로직을 떠올리는데 시간이 걸렸다.

해결방법은, 글자수를 카운팅 하여, 목표 카운트 값과 비교하여 값을 도출하였다.

수행시간은 0.03초로 만족스럽다.