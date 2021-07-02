
public class Pb6 
{
    public static void main(String[] args)
    {
        double i, hm, hm1=0.0, hm2=0.0;
        
        for(i=1; i<=50000; i++)
        {
            hm1+= (1/i);
        }
        System.out.println("The hm1 is "+hm1);
        
        for(i=50000; i>=1; i--)
        {
            hm2+= (1/i);
        } 
        System.out.println("The hm2 is "+hm2);
        
        hm=hm1-hm2; 
        
        if(hm<0)
            hm*=(-1);
        
        System.out.println("The Difference is "+hm);
    }
}
