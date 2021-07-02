
import java.util.Scanner; 

public class Pb3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int upperbound, lowerbound , sum = 0, i, count=0;
        double avg;
        
        System.out.print("Enter the Lower limit: ");
        lowerbound = input.nextInt();
        
        System.out.print("Enter the Upper limit: ");
        upperbound = input.nextInt();
        
        i = lowerbound;
        
        while(i<=upperbound)
        {
            sum+=i;
            i++;
            count++;
        }
        
        avg = sum/count;
        
        System.out.printf("The sum of %d to %d is %d\nThe average is %.1f\n",lowerbound,upperbound,sum,avg);
    }
}
