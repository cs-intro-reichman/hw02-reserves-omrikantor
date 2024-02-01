/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		for (int i = 0; i < a; i++)
		{
			if (i % 2 != 0)
			{
				System.out.print(" ");
			}
		for (int j = 0; j < a; j++)
		{
		System.out.print("*");
		if (j == a-1)
			{
				if (i % 2 != 0)
				{
					System.out.println();
				}
				else
				{
					System.out.print(" ");
					System.out.println();
				}		
		}
		else
		{
			System.out.print(" ");
		}
	}
}
	}
}
