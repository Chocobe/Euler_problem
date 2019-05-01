// 다른사람이 푼 풀이법

package ex024_lexicographic_permutations;

public class Ex24_others_thing {
//	  @Test
//	  public void problem24() {
	
//			List<Integer> digits = seq(0, 9);
//			StringBuilder solution = new StringBuilder();
//			int position = 1000000;
//			long start = System.nanoTime();
	
//			while (!digits.isEmpty()) {
	
//				  int k = 0;
//				  int permutations = MathTools.factorial(digits.size()-1);
	
//				  while ((k + 1) * permutations < position) {
//					  k++;
//				  }
	
//				  Integer digit = digits.get(k);
//				  digits.remove(digit);
//				  solution.append(digit);
//				  position = position - (k * permutations);
//			}
	
//			long nanos = System.nanoTime() - start;
//			String msg = String.format("solution = %s. It took %.8f seconds", solution, nanos / 100000000.0);
//			System.out.println(msg);
//			assertEquals("2783915460", solution.toString());
//	  }
}
