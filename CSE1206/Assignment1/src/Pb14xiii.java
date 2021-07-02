
import java.util.Scanner;

public class Pb14xiii 
{
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int i=1,j,n;
        
        System.out.print("Enter the rows: ");
        n= input.nextInt();
        
        while(i==1)
        {
            for(j=1;j<=2*n-1;j++)
                System.out.print("#");
            
            i++;
        }
        System.out.printf("\n");    
        
        for(i=1; i<n; i++)
        {            
            for(j=1; j<=n-i; j++)
            {
                System.out.print("#");
            }
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=n-i; j++)
            {
                System.out.print("#");
            }
            
           System.out.printf("\n");    
        }
        
        for(i=n-2; i>=1; i--)
        {            
            for(j=1; j<=n-i; j++)
            {
                System.out.print("#");
            }
            for(j=1; j<=2*i-1; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=n-i; j++)
            {
                System.out.print("#");
            }
            
            System.out.printf("\n");    
        }  
        i=n;
        while(i==n)
        {
            for(j=1;j<=2*n-1;j++)
                System.out.print("#");
            
            i++;
        }
    }
}
