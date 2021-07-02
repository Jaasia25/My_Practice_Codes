
import java.util.Scanner;


public class Pb14x 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int i,j,n;
        
        System.out.print("Enter the rows: ");
        n= input.nextInt();
        
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print("#");
            }
            System.out.printf("\n");
        }
    }
}
