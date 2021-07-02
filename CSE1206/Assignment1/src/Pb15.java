
import java.util.Scanner;


public class Pb15 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int num1, num2, rem, gcd;
        
        System.out.println("Enter the first number: ");  
        num1= input.nextInt();
        System.out.println("Enter the second number: ");  
        num2= input.nextInt();
        
        while(num2!=0)
        {
            rem=num1%num2;
            num1= num2;
            num2= rem;
        }
        gcd= num1;
        System.out.println("The GCD is: "+gcd);     
    }
}
