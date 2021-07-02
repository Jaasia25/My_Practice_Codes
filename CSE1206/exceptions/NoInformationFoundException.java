
package exceptions;

public class NoInformationFoundException extends Exception{
    
    public NoInformationFoundException(){
       super();
    }
    
    public NoInformationFoundException(String message){
        super(message);
    }
    
}
