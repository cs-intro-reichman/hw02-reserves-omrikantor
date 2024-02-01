
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		double a = Math.random();
		boolean girl = false;
		boolean boy = false;
		int count = 1;
		while(!girl || !boy)
		{
			if (a < 0.5)
			{
				System.out.print("g ");
				girl = true;
			}
			else
			{
				System.out.print("b ");
				boy = true;	
			}
			if (girl && boy)
			{
				System.out.println();
				System.out.println("You made it... and you now have " + count + " children.");
			}
			a = Math.random();
			count ++;
		}
	}
}
