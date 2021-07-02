import java.util.Scanner;

public class Pb14viii
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int size,i,j;
        
        System.out.print("Enter the size: ");
        size= input.nextInt();
        
        for(i=1;i<=size;i++)
        {
            for(j=1;j<=size;j++)
            {
                if(i==1||i==size)
                    System.out.print("#");
                else if((j!=1||j!=size)&&(j==size-(i-1)||j==i))
                    System.out.print("#");
                else    
                    System.out.print(" ");
            }                    
            System.out.printf("\n");
        }
    }
}
