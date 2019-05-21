# Truncatable primes
# (절단 가능한 소수)

The number 3797 has an interesting property. 

(숫자 3797은 흥미로운 속성을 가진다.)

Being prime itself, 
it is possible to continuously remove digits from left to right, and remain prime at each stage: 
3797, 797, 97, and 7.

(스스로 소수가 되면서, 좌측에서 우측으로 계속적으로 숫자를 지우는게 가능하고, 각 스테이지에는 소수가 남는다. "3797, 797, 97, 7")

Similarly we can work from right to left: 3797, 379, 37, and 3.

(유사하게 우측에서 좌측으로 작업할 수 있다. " 3797, 379, 37, 3)

Find the sum of the only eleven primes that are both truncatable from left to right and right to left.

(좌측에서 우측, 우측에서 좌측 양 방향에서 절단 가능한 11개 소수의 합을 구하시오.)

NOTE: 2, 3, 5, and 7 are not considered to be truncatable primes.

(NOTE : "2, 3, 5, 7은 절단가능한 소수로 고려되지 않는다.)

# 문제점_1
요구사항은 명확하기 때문에 문제될 것은 없었다.

하지만, 검사할 대상값이 크기 때문에 연산속도가 6초를 넘는.. 매우 느린 상태로 만들어 졌다.

수행시간이 1초를 넘지 않도록 만들고 싶은데... 