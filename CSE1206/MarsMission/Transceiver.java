package MarsMission;


import MarsMission.Receiver;
import exceptions.NoInformationFoundException;


public abstract class Transceiver extends Receiver{
    
    @Override
    public void checkSignal() throws NoInformationFoundException{
        
        
        int num = getCode();
        
        while(num%2==0)
            num/=2;
        
        while(num%3==0)
            num/=3;
        
        while(num%5==0)
            num/=5;
            
        if(num!=1)
        {
            throw new NoInformationFoundException("Invalid Signal Received! Please Discard it");
        }
        
        else 
        {
            System.out.println("Signal Received with Information!");
        }
    }
    
}
