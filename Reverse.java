/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String rev = "";
		for(int i = s.length() - 1; i >= 0; i--)
		{
			char c = s.charAt(i);
			rev += c;
		}
		char mid = rev.charAt(rev.length() / 2);
		System.out.println(rev);
		System.out.println("The middle character is : " + mid);
	}
}
