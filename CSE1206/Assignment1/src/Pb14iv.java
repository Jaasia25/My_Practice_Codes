
import java.util.Scanner;

public class Pb14iv
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int size,i,j;
        
        System.out.print("Enter the size: ");
        size= input.nextInt();
        
        for(i=size;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            
            for(j=1;j<=size-i;j++)
            {
                System.out.print("#");
            }
           
            System.out.printf("\n");
        }
    }
}
