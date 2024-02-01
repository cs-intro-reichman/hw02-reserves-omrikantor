/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int sum = 0;
		for(int i = 0; i < a; i++)
		{
		double b = Math.random();
		boolean girl = false;
		boolean boy = false;
		int count = 1;
		while(!girl || !boy)
		{
			if (b < 0.5)
			{
				girl = true;
			}
			else
			{
				boy = true;	
			}
			if (girl && boy)
			{
				if (count == 2)
				{
					n1++;	
				}
				else
				{
					if (count == 3)
					{
					n2++;	
					}
					else
					{
						n3++;
					}
				}
				sum += count;
				}
			b = Math.random();
			count ++;
			}
		}
		double avg = ((double) sum) / a;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + n1);
		System.out.println("Number of families with 3 children: " + n2);
		System.out.println("Number of families with 4 or more children: " + n3);
		if (n1 > n2)
		{
			if (n1 > n3)
			{
				System.out.println("The most common number of children is 2.");	
			}
			else
			{
				System.out.println("The most common number of children is 4 or more.");
			}	
		}
		else
		{
			if (n2 > n3)
			{
				System.out.println("The most common number of children is 3.");	
			}
			else
			{
				System.out.println("The most common number of children is 4 or more.");
			}
		}
		}
	}