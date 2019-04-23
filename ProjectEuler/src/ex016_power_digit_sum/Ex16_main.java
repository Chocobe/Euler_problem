package ex016_power_digit_sum;

import java.math.BigInteger;

public class Ex16_main {
	public static void main(String[] args) {
		
		// �ؼ� (������)
		int base_int = 2;
		// �ؼ��� BigInteger�� �Ű������� �ֱ� ���� String������ ��ȯ
		String base_string = String.valueOf(base_int);
		
		// ������
		int exponent_num = 1000;
		// 2 ^ 1000 �� ���� BigInteger ���� ����
		BigInteger result_num = new BigInteger(base_string);
		// BigInteger���� ���� String������ ��ȯ
		String result_string = "";
		// ���ڿ� ����
		int result_len = 0;
		// �� ���ڵ��� ��
		int digit_sum = 0;
		
		System.out.println("�ؼ� : " + result_num);
		System.out.println("���� : " + exponent_num);
		
		// 2 ^ 1000 (BigInteger ��)
		result_num = result_num.pow(exponent_num);
		// 2 ^ 1000 (String ��)
		result_string = result_num.toString();
		
		result_len = result_string.length();
		
		System.out.println("�����(���ڿ�)�� ���� : " + result_len);
		
		for(int i = 0; i < result_len; i++) {
			String digit = result_string.substring(i, i + 1);
			
			digit_sum += Integer.parseInt(digit);
		}
		
		System.out.println("�� ���ڵ��� �� : " + digit_sum);
	}
}
/* �����
1071508607
1862673209
4842504906
0001810561
4048117055
3360744375
0388370351
0511249361
2249319837
8815695858

1275946729
1755314682
5187145285
6923140435
9845775746
9857480393
4567774824
2309854210
7460506237
1141877954

1821530464
7498358194
1267398767
5591655439
4607706291
4571196477
6865421676
6042983165
2624386837
2056680693

76
*/