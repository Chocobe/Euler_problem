# Lattice paths
# (격자 경로들)

Starting in the top left corner of a 2×2 grid,
and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.
(오른쪽과 아래로만 이동할 수 있고, 2x2 그리드의 좌측 상단에서 시작하는 것은,
우측 하단으로 정확히 6개 경로가 있다.)

How many such routes are there through a 20×20 grid?
(20x20 그리드에는 이와같은 루트가 얼마나 있는가?)

# 문제점_1
순열에 대해 다시 상기하는 기회가 되었다.
순열이란 "순서를 정하는 경우의 수"

2x2의 그리드에서 순열의 값은
	4! / (2! * 2!)
	
	4! : 가로, 세로 모두에 대한 순열
	2! : 가로에 대한 순열
	2! : 세로에 대한 순열
	
가로, 세로에 대한 순열을 나눠준 이유는,
가로에 대한 순서는 정할 수 없기 때문이다.
다시 말해서 가로 이동할 경우, 건너뛰는게 아니라 순서대로 이동해야 하기 때문이다.
(세로 역시 동일하다.)

# 문제점_2
20x20 의 계산을 위해 20!를 하면, long형을 벗어난다.

이를 해결하기 위해 가로의 순열값 20!를 나눠준 상태로 루프를 시작했고,
전체 순열값과 세로의 순열값을 계산하는 루프에서 지속적인 약분을 하므로써 해결하였다.