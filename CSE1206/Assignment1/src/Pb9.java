
import java.util.Scanner;


public class Pb9 
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        int number1, number2, temp;
        
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        
        System.out.printf("\n");
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        
        temp=number1;
        number1=number2;
        number2=temp;
        
        System.out.printf("After the swap, first integer is: %d, second integer is: %d\n",number1,number2);
        
    }
}
