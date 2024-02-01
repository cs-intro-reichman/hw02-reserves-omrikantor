/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int a = (int) (Math.random() * 10);
		int b;
		do
		{
			System.out.print(a + " ");
			b = a;
			a = (int) (Math.random() * 10);
		
		}
		while (b <= a);
	}
}
