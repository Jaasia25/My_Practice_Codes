
import java.util.Scanner;

public class Pb12 
{
    public static void main(String[] args)
    {
        Scanner input;
        input= new Scanner(System.in);
        int num;
        System.out.print("Enter a number between 0-10 or 90-100: ");
        num= input.nextInt();
        
        if((num>=0&&num<=10)||(num>=90&&num<=100))
            System.out.println("You have entered: "+num);
        else
            System.out.println("Invalid input, try again...");
    }
}
