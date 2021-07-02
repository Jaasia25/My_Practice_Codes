
import java.util.Scanner;

public class Pb14ii 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int size,i,j;
        
        System.out.print("Enter the size: ");
        size= input.nextInt();
        
        for(i=1;i<=size;i++)
        {
            for(j=size;j>=i;j--)
            {
                System.out.print("#");
            }
            System.out.printf("\n");
        }
    }
}
