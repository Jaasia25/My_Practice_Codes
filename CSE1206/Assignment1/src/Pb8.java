
import java.util.Scanner;


public class Pb8 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c,sum,product,min,max;
        
        System.out.print("Enter three Numbers: ");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        
        sum= a+b+c;
        product= a*b*c;
        
        if(a>b&&a>c)
                max=a;       
        else if(b>c&&b>a)
                    max=b; 
        else
            max=c;
        
        if(a<b&&a<c)
                min=a;       
        else if(b<c&&b<a)
                    min=b; 
        else
            min=c;
        
        System.out.println("The sum is "+sum);
        System.out.println("The product is "+product);
        System.out.println("The minimum number is "+min);
        System.out.println("The maximum number is "+max);
        
    }
}
