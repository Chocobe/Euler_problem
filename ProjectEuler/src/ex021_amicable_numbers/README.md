# Amicable numbers
# (우호적인 숫자들)

Let d(n) be defined as the sum of proper divisors of n 
(numbers less than n which divide evenly into n).

(d(n)을 n의 알맞은 제수들의 합으로 정의해 보자. (n을 균등하게 나누는 n보다 작은 숫자들))

If d(a) = b and d(b) = a, where a ≠ b, 
then a and b are an amicable pair and each of a and b are called amicable numbers.

(만약 a와 b가 다르고, d(a) = b 이고 d(b) = a 라면,
a와 b는 우호적인 짝이고, a와 b각각은 우호적인 숫자들 이라고 불린다.)  

For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; 

(예를 들어, 220의 알맞은 제수는 "1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110" 이다.)

therefore d(220) = 284.

그러므로 d(220) = 284 이다.

The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

(284의 알맞은 제수들은 "1, 2, 4, 71, 142" 이다. 그래서 d(284)는 220 이다.)

Evaluate the sum of all the amicable numbers under 10000.

(10000이하의 모든 우호적인 숫자들의 합을 구해라.)

# 문제점 1
항상 단일 기능 모듈을 만들도록 생각하자.