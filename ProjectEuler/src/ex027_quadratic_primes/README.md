# Quadratic primes
# (이차 소수들)

Euler discovered the remarkable quadratic formula:

(Euler는 놀라운 근의 공식을 발견했다.)

n^2 + n + 41

It turns out that the formula will produce 40 primes for the consecutive integer values 0 <= n <= 39. 

(이 공식은 n이 0에서 39사이 정수값들의 40개 소수들을 만들어 내는 것을 나타낸다.)

However, when n = 40, 40^2 + 40 + 41 = 40(40 + 1) + 41 is divisible by 41, and certainly when n = 41, 41^2 + 41 + 41 is clearly divisible by 41.

(그러나 n이 40일 떄, "40^2 + 40 + 41 = 40(40 + 1) + 41"은 41로 나눠지고, 
n이 41일 때도 "41^2 + 41 + 41"은 41에 의해 정확하게 나눠진다.)

The incredible formula n^2 - 79n + 1601 was discovered, 
which produces 80 primes for the consecutive values 0 <= n <= 79. 

(놀라운 공식 "n^2 - 79n + 1601"은 n이 0에서 79사이 값의 80개 소수들을 생산하는 것이 발견되었다.)

The product of the coefficients, -79 and 1601, is -126479.

(계수 -79와 1601의 곱의 결과는 -126479이다.)

Considering quadratics of the form:

(다음 형식의 이차식을 생각하면,)

n^2 + a*n + b, where |a| < 1000 and |b| <= 1000

("n^2 + a^n + b에서 |a|는 1000 미만이고 |b|는 1000이하)

where |n| is the modulus/absolute value of n

(|n|은 n의 절대값이다.)

e.g. |11| = 11 and |-4| = 4

Find the product of the coefficients, 
a and b, for the quadratic expression that produces the maximum number of primes for consecutive values of n, starting with n = 0.

(n이 0부터 시작하는 연속된 n값의 소수들을 최대개수로 만드는 이차식에서 계수 a와 b의 곱의 결과를 구해라.)

# 문제점
"소수"의 정의에 대해 몰랐던 것.

"소수"란, 1보다 큰 자연수 중에서 약수로 1과 자기자신만을 가지는 수를 말한다.

"1보다 큰 자연수" 라는 점을 몰랐다.

즉, "양의 정수"라는 뜻

음수는 소수가 될 수 없다.

잊지 말자.