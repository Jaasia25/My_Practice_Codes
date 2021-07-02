
package UserDefinedException;

public class TooManyUsers extends Exception {
    
    public TooManyUsers(String message){
        super(message);
    }
}
