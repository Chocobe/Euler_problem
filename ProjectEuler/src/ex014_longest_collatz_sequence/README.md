# Longest Collatz sequence
# (���� ū �ݶ��� ����)

The following iterative sequence is defined for the set of positive integers:
(���� �ݺ����� ������ ���� ������ ��Ʈ�� ���ǵȴ�.)

n �� n/2 (n is even)
n �� 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
(�� ��Ģ���� ����ϰ� 13���� �����ϸ�, ���� ������ ����� �ȴ�.)

13 �� 40 �� 20 �� 10 �� 5 �� 16 �� 8 �� 4 �� 2 �� 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. 
((13���� �����ϰ� 1���� ������)�� ������ 10�� ���� �����ϴ� ���� �� �� �ִ�.)

Although it has not been proved yet (Collatz Problem), 
(��� ���� (�ݶ��� ����) ����Ǿ����� �ʾ�����,)

it is thought that all starting numbers finish at 1.
(��� ���� ������ 1���� �����ٴ� ���� �����Ǿ� ����.)

Which starting number, under one million, produces the longest chain?
(100�� �̸����� �����ϴ� � ���� ���� �� ü���� ����°�?)

NOTE: Once the chain starts the terms are allowed to go above one million.
(�ϴ� ü���� �����ϸ� ���� 100���� �Ѿ �ȴ�.)

# ������_1
collatz �� ���� ��Ű�� ���� ��, int���� ������ �Ѿ�� ��찡 �����.

������� ���������ν�, �̸� ���� �ľ����� ���ߴ� ���� ���� �Ǵ�.

# ������_2
������ �״�� ���븸 �ϸ� ������, �ݺ��Ǵ� ������ Ƚ���� ��û���� ������ ��ȯ�ӵ��� ���� ������.

�̸� �ذ��ϱ�����, ���� ���α׷���(Dynamic Programming)�� �����ϰ���,
1���� �迭�� "�ε���"-"������" �� ��Ī�Ͽ� �ش� chain���� �����ϰ�,
�ش� ���� �߻����� ��, �� chain���� �������� ����� ����Ͽ���.

# ������_3
�迭�� �����ϴµ� ���� ������ ��, ���� �ʹ� Ŀ�� heap overflow�� �߻��Ѵٴ� ���̴�.
������ ��� ���� ���� �迭�� �������� �ʰ�, �Ϻκ��� "10000"���� �迭ũ��� �����, ����Ͽ���.

��������� �ӵ��� ��� ����� ������ ��������.

�� ū ���� ���... ������ �� �߻��� �� �ִ� �ӽù��� ���� �ʵȴٴ� ���� �����ϴ�.
(2���� �迭�� [10000][10000]�� �����ؼ� ����� �����ߴ�.)