# Lexicographic permutations
# (사전상의 순열)

A permutation is an ordered arrangement of objects. 

(순열은 객체들의 정렬된 방식이다.)

For example, 3124 is one possible permutation of the digits 1, 2, 3 and 4. 

(예를들면, 3124는 "1, 2, 3, 4" 숫자의 가능한 순열의 하나이다.)

If all of the permutations are listed numerically or alphabetically, 
we call it lexicographic order. 

(만약 모든 순열을 계수적 또는 알파벳순으로 나열한다면, 이것을 사전적 정렬 이라고 부른다.)

The lexicographic permutations of 0, 1 and 2 are:
012   021   102   120   201   210

("0, 1, 2"의 사전적 순열은 "012, 021, 102, 120, 201, 210" 이다.)

What is the millionth lexicographic permutation of 
the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?

("0, 1, 2, 3, 4, 5, 6, 7, 8, 9"의 100만번째 사전적 순열은 무엇인가?)

# 문제점_1
순열의 특정 위치의 값을 구하는 문제.
각 순열의 구성에 대해 이해해야 한다.

4자리(ㅁ,ㄴ,ㅇ,ㄹ)를 예를 들면,
"ㄴ,ㅇ,ㄹ"의 순열은 3! = 3 x 2 = 6가지가 된다.
"ㅁ"에 오는 값은 "특정위치값 / 6" 값이 되는 것이다. 
(예외로 나머지가 0인 경우는 "특정위치값 / 6"에서 1을 뺀 값, 그리고 그 뒤의 값은 역순으로 배치된다.)
(나머지가 1인 경우는 "특정위치값 / 6"의 값이 오고, 그 뒤의 값은 순차적으로 배치된다.)

#프로그램 연산 시간 구하기
Sytem.nanoTime() 메서드로 프로그램의 연산시간을 구할 수 있다.
(프로그램 종료 직전의 시간 - 프로그램 시작 직후 시간)