
import java.util.Scanner;


public class Pb13 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int i,j,n;
        System.out.print("Enter the size: ");
        n= input.nextInt();
        
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=n; j++ )
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
