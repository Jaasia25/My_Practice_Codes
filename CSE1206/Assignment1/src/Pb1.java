
import java.util.Scanner;

public class Pb1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a Number: ");
        number = input.nextInt();
        
        if(number%2==0)
            System.out.println("Even Number");
        else 
            System.out.println("Odd Number");
    }
    
}
