# Longest Collatz sequence
# (가장 큰 콜라츠 과정)

The following iterative sequence is defined for the set of positive integers:
(다음 반복적인 과정은 양의 정수의 세트에 정의된다.)

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
(이 규칙위에 사용하고 13에서 시작하면, 다음 과정을 만들게 된다.)

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
((13에서 시작하고 1에서 끝나는)이 과정은 10개 항을 포함하는 것을 알 수 있다.)

Although it has not been proved yet (Collatz Problem), 
(비록 아직 (콜라츠 문제) 증명되어지지 않았지만,)

it is thought that all starting numbers finish at 1.
(모든 시작 수들은 1에서 끝난다는 것이 생각되어 진다.)

Which starting number, under one million, produces the longest chain?
(100만 미만에서 시작하는 어떤 수가 가장 긴 체인을 만드는가?)

NOTE: Once the chain starts the terms are allowed to go above one million.
(일단 체인이 시작하면 항은 100만을 넘어도 된다.)

# 문제점_1
collatz 를 적용 시키는 과정 중, int형의 범위를 넘어가는 경우가 생긴다.

디버깅을 대충함으로써, 이를 빨리 파악하지 못했던 점이 가장 컸다.

# 문제점_2
로직은 그대로 적용만 하면 되지만, 반복되는 과정의 횟수가 엄청나기 때문에 반환속도가 답이 없었다.

이를 해결하기위해, 동적 프로그래밍(Dynamic Programming)을 적용하고자,
1차원 배열의 "인덱스"-"원본값" 을 매칭하여 해당 chain값을 저장하고,
해당 값이 발생했을 시, 그 chain값을 가져오는 방식을 사용하였다.

# 문제점_3
배열을 생성하는데 생긴 문제점 중, 값이 너무 커서 heap overflow가 발생한다는 점이다.
때문에 모든 값에 대한 배열을 생성하지 않고, 일부분인 "10000"개만 배열크기로 만들고, 사용하였다.

결과적으로 속도는 즉시 실행될 정도로 빨라졌다.

더 큰 값의 경우... 문제는 또 발생할 수 있는 임시방편 뿐이 않된다는 점은 찝찝하다.
(2차원 배열로 [10000][10000]을 생성해서 사용은 가능했다.)