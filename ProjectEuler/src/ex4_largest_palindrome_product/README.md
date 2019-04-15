# Largest palindrome product
# (최대 회문)

A palindromic number reads the same both ways.
(회문 수는 양방향 동일하게 읽는다.)

The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
(두자리수 2개의 곱으로 만들어지는 회문은 9009 = 91 x 99 이다.)

Find the largest palindrome made from the product of two 3-digit numbers.
(세자리수 두개의 곱으로 만들어지는 최대 회문을 구하시오.)


# 틀렸던 점
틀렸던 부분
for(int j = 0; j < lhs_max; j++)
로 사용했다.

이와 같이 연산을 하게 되면,
i값이 999 일때, j 가 0 부터 (lhs_max - 1) 을 진행해 버린다.
때문에 "999 * 91" 값이 가장 빨리 검출 되며, 값은 90900

하지만, j값을 10단위로 루프를 돌리게 되면,
"999 * 913" 값을 가장 빨리 검출 하며, 값은 906609

즉, 최대값을 첫번째로 검출하기 위해서는..
큰값이 먼저 나오도록 루프를 만들어야 한다.
(우변 10감산당 좌변 -1 값을 감산해주는 방식으로)


# 헷갈렸던 점
자바에서 배열의 비교를 위해
arr_1[i] == arr_2[i] 로 사용하게 되면,
각각의 배열의 주소값을 비교해 버리기 때문에, 값비교가 되지 않는다.

때문에 "Arrays" 클래스의 "equals(int[] _arr1, int[] _arr2)" 메서드를 사용해야 한다.
반환값은, 값이 같으면 true, 틀리면 false
(Arrays를 검색하면 import 할 수 있다.) 