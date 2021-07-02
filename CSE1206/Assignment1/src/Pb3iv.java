import java.util.Scanner; 

public class Pb3iv 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int upperbound=8899, lowerbound=111 , sum = 0, i, count=0;
        double avg;
        
        i = lowerbound;
        
        do
        {
            sum+=i;
            i++;
            count++;
        }
        while(i<=upperbound);
        
        avg = sum/count;
        
        System.out.printf("The sum of %d to %d is %d\nThe average is %.1f\n",lowerbound,upperbound,sum,avg);
    }
}
