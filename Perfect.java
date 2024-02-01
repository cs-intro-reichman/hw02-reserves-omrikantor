/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int n = 1;
		String is = a + " = " + 1;
		for(int i = 2; i < a; i++)
		{
			if (a % i == 0)
			{
			n += i;
			is += " + " + i;
			}
		}
		if (n == a) 
		{
			System.out.println(a + " is a perfect number since " + is);
		}
			 else
			 {
				System.out.println(a + " is not a perfect number");
			 }
		}
	}