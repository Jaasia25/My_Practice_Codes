
import java.util.Scanner;


public class Pb10 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num, rev=0, temp, rem;
        
        System.out.print("Enter a positive integer: ");
        num= input.nextInt();
        
        temp=num;
        
        while(temp!=0)
        {
            rem= temp%10;
            rev= rev*10+rem;
            temp/=10;
        }
        
        System.out.println("The reverse is: "+rev);
        
    }
    
}
