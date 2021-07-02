
import java.util.Scanner;


public class Pb11 
{
    public static void main(String[] args)
    {
        Scanner input;
        input = new Scanner(System.in);
        int num, sum=0, temp, rem;
        
        System.out.print("Enter a positive integer: ");
        num= input.nextInt();
        
        temp=num;
        
        while(temp!=0)
        {
            rem= temp%10;
            sum+=rem;
            temp/=10;
        }
        
        System.out.println("The sum of all digits is: "+sum);
        
    }
}