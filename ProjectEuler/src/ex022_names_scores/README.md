# Names scores
# (���� ���ھ�)

Using "names.txt" (right click and 'Save Link/Target As...'), 
a 46K text file containing over five-thousand first names, 
begin by sorting it into alphabetical order. 

(5õ�� �̻� ù��° �̸�(��)�� �����ϴ� 46k �ؽ�Ʈ������ name.txt(��Ŭ���Ͽ� �ٸ��̸����� ����)�� ����Ͽ�,
���ĺ� ������ �����ض�.)

Then working out the alphabetical value for each name, 
multiply this value by its alphabetical position in the list to obtain a name score.

(�׸��� �� �̸��� ���ĺ� ���� ����ϰ�, �� ���� "���� ���ھ�"�� ������� ����Ʈ���� ���ĺ� ��ġ�� ���ض�.)

For example, when the list is sorted into alphabetical order, COLIN, 
which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938 �� 53 = 49714.

(���� ���, ����Ʈ�� ���ĺ� ������ ���ĵǾ��� ��, "COLIN"�� "3 + 15 + 12 + 9 + 14 = 53"���̰�,
����Ʈ���� 938��° �̸��̴�.
�׷��� "COLIN"�� "938 x 53 = 49714"�� ���� ���̴�.)

What is the total of all the name scores in the file?

(���Ͼ��� ��� "���� ���ھ�"�� ���� ���ΰ�?)

# �帧��
1. ���� �о���� (���1)
2. "�̸�" ���� (���2)
3. �����Ͽ� ���� (���3)

-------���� != null �̸�, "2"��������

4. "�̸�" �� ���ĺ� �� ���ϱ�
5. �� "name socre" ���ϱ�
6. �� ��

# ������_1 <.txt���� �б�>

.txt������ �ҷ����� ����� �����.
(������ ��θ� ���� File�� ����)

��Ʈ�� ����
(FileReader�� ��Ʈ�� ����)

����� ������ ������ �б� ���� ���� ����
(BufferedReader�� ����)

���ۿ��� ������ �б�
(���ۺ���.readLine() �޼��� ����)

# ������_2 <������ �����ϱ�>
���ڿ� ����.indexOf() �޼����
���ڿ� ����.substring() �޼��� ���

# ������_3 <���� ��>
���ڸ� ���ϴ°��� ����� ������,
���� ������� ó���ϴ°��� �������.
�̴� Ŭ��(1), ������(-1), ������(0) �� �÷��� �������� ó���ؿ���.

# ������_4 <���� �񱳸� ����� ����>
Ŭ��(1), ������(-1), ������(0)�� ó���� �򰥸��� ����������,
�� �ܿ��� �Ҹ� �ߴ�.