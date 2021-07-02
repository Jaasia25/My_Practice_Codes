import java.util.Scanner;

public class Pb18
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		
		System.out.print ("Enter a Binary string: ");
		
		String bin = input.nextLine ();
		
		boolean truth = true;
		int len = bin.length ();
		
		int res = 0, t = 1;
		
		for (int i = len - 1; i >= 0; i--)
		{
			char c = bin.charAt (i);
			
			if (c != '0' && c != '1')
			{
				truth = false;
				break;
			}
			
			res += (c - '0') * t;
			t *= 2;
		}
		
		if (truth)
			System.out.println ("The equivalent decimal number for binary " + bin + " is: " + res);
		else
			System.out.println ("error: invalid binary string " + bin);
	}
}