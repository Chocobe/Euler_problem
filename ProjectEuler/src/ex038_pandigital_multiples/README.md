# Pandigital multiples
# (pandigital 곱)

Take the number 192 and multiply it by each of 1, 2, and 3:

("192"와 "1, 2, 3" 각각의 곱을 취해라.)

192 × 1 = 192
192 × 2 = 384
192 × 3 = 576

By concatenating each product we get the 1 to 9 pandigital, 192384576. 

(각각의 곱을 연결함에 의해 1부터 9까지의 pandigital을 얻는다. "192384576")

We will call 192384576 the concatenated product of 192 and (1,2,3)

(우리는 "192384576"을 "192"와 "1, 2, 3"의 연결된 곱이라고 부른다.)

The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, 
giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

("9"에서 시작하고 "1, 2, 3, 4, 5"의 곱에 의해 "918273645"인 pandigital을 구할 수 있다.
"918273645"는 "9"와 "1, 2, 3, 4, 5"의 연결된 곱이다.)

What is the largest 1 to 9 pandigital 9-digit number 
that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?

("1"에서 "9"까지 가장 큰 9자리 pandigital숫자는 무엇인가? - "n > 1"인 "1, 2, ... n"인 정수의 연결된 곱에 의해 형성됨)

# 문제점_1
결과값을 저장하기 위한 방법을 떠올리는데 시간이 걸렸다.

2중 클래스를 생성하여, C에서 구조체와 같은 용도로 사용했다.

# 문제점_2
2중 클래스를 이용할 경우, 각 메서드의 디버깅에 어려움이 있었다.

main메서드에서 2중 클래스를 생성할 수 없었기 때문에, 테스트용 모듈을 사용하여 테스트 하였다.

# 문제점_3
원리는 단순한데 코드가 길어지는 느낌이라 찝찝한 기분이 든다.

이번 문제의 수행시간은 0.02초로 만족스럽다.