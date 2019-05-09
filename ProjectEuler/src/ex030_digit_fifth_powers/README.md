# Digit fifth powers
# (숫자 5승)

Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

(놀랍게도 그것들의 숫자들의 4승의 합으로 적혀질 수 있는 단 3개의 숫자가 있다.)

1634 = 1^4 + 6^4 + 3^4 + 4^4
8208 = 8^4 + 2^4 + 0^4 + 8^4
9474 = 9^4 + 4^4 + 7^4 + 4^4

As 1 = 1^4 is not a sum it is not included.

("1 = 1^4" 는 합이 아니기 때문에 포함되지 않는다.) 

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

(이 숫자들의 합은 "1634 + 8308 + 9474 = 19316" 이다.)

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

(그것들의 숫자들의 5승의 합으로 적혀질 수 있는 모든 숫자들의 합을 구하시오.)

# 문제점_1
문제 해결을 위한 각 모듈 설계는 나쁘지 않았다.

하지만, 각 모듈을 문제해결을 위한 사용상에 문제가 발생했다.

이는 중복값에 대한 생각이 부족함과,

정수형에서 앞자리가 0일 경우, 표시되지 않는다는 것을 간과한 것이다.

# 문제점_2
자릿수에 대한 예외처리를 하지 않아서,

모든 루프를 검사하는 코드가 되었다.

예외처리를 위한 루프의 제약조건을 만드는게 안되었다.

어떻해야 될까...

(현재 코드로 수행시간은 약 0.4초 걸린다.)