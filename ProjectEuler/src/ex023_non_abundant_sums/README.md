# Non-abundant sums
# (풍부하지 않은 합들)

A perfect number is a number for which the sum of its proper divisors is 
exactly equal to the number. 

(완벽한 수는 이 수의 약수들의 합과 정확하게 같은 숫자이다.)

For example, the sum of the proper divisors of 28 would be 
1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

(예를들면, 28의 약수의 합은 "1 + 2 + 4 + 7 + 14 = 28"이 되고, 이것은 28은 완벽한 숫자라는 것을 의미한다.)

A number n is called deficient if the sum of its proper divisors is less than n and 
it is called abundant if this sum exceeds n.

(숫자 n이 만약 이 숫자의 약수의 합이 n보다 적다면 결핍됬다고 부르고, 만약 이 합이 n을 넘는다면 풍부하다고 부른다.)

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
the smallest number that can be written as the sum of two abundant numbers is 24. 

("1 + 2 + 3 + 4 + 6 = 16"인 12는 가장 적은 풍부한 숫자로써, 두개의 풍부한 숫자의 합으로써
적을 수 있는 가장 적은 수는 24이다.)

By mathematical analysis, it can be shown that all integers greater than 28123 
can be written as the sum of two abundant numbers. 

(수학적 분석에 의해, 28123보다 큰 모든 정수가 두개의 풍부한 숫자의 합으로써 적어질 수 있다는 것을 볼 수 있다.)

However, this upper limit cannot be reduced any further by analysis even though 
it is known that the greatest number that cannot be expressed 
as the sum of two abundant numbers is less than this limit.

(그러나, 이 상한값은 두개의 풍부한 숫자의 합으로써 나타낼 수 없는 가장 큰 숫자가 이 한계값 보다 작다는 것이
알려졌음에도 불구하고 분석에 의해 더 줄일 수 없다.)

Find the sum of all the positive integers which 
cannot be written as the sum of two abundant numbers.

(두개의 풍부한 숫자의 합으로써 나타낼 수 없는 모든 양의 정수의 합을 구하시오.)

# 문제점_1
해석에 어려움이 있었다.
결론적으로, 28123보다 큰 모든 정수는 두개의 풍부한 숫자의 합으로 나타낼 수 있고,
28123 이하의 모든 풍부한 숫자를 구하는 것이 핵심이다.

# 문제점_2
"두 풍부한 숫자의 합" 에 중복값을 제거할 방법이 가장 큰 문제였다.

"두 풍부한 숫자의 합"을 중복을 배제하여 배열에 넣을 경우,
중복 검사에 걸리는 작업시간이 엄청나게 길어지는 현상이 발생한다.

때문에, 각 값을 인덱스 번호로 갖는 배열을 만들어
인덱스값이 해당값인 부분을 "1"로 바꿈으로써 해결했다.

중복검사가 필요없이, 발생할 때마다 1로 바꿔도 중복은 적용되지 않기 때문이다.

앞으로 중복검사는 플래그 사용으로 해결할 수 있을것이라 생각된다.