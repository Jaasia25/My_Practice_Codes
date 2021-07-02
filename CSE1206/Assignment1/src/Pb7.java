
public class Pb7 
{
    public static void main(String[] args)
    {
        int count=0,n,first=1,second=1,fibo,sum=0;
        float avg;
        
        System.out.println("The first 20 Fibonacci numbers are:");
        while(count<20)
        {
            switch (count) 
            {
                case 0:
                    fibo=count+1;
                    break;
                case 1:
                    fibo=count;
                    break;
                default:
                    fibo=first+second;
                    first=second;
                    second=fibo;
                    break;
            }
            
            System.out.printf("%d ",fibo);

            count++;
            sum+=fibo;     
            }
        
         avg= (float) sum/(float) (count);
         System.out.printf("\nThe average is %.1f\n",avg);
    }
}
