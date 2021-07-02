
import java.util.Scanner;


public class Pb17 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int i,j,up;
        
        System.out.print("Please enter the upper bound: ");
        up = input.nextInt();
        
        for(i=2; i<=up; i++)
        {
            for(j=2; j<=i; j++)
            {
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }
    }
}
