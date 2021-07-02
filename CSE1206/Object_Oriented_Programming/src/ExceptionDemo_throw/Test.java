package ExceptionDemo_throw;

import UserDefinedException.*;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws NotAuthenticatedUserException {

        User ob = new User();

        try {
            ob.countUser();
        } catch (TooManyUsers e) {
            System.out.println(e);
            System.out.println("Waiting for User to Exit");
            System.out.println("Refreshing...");
        }
        
        Scanner input =  new Scanner(System.in);
        
        System.out.println("Take User Input");
        
        ob.authenticUser(input.nextLine());
        ob.authenticUser(input.nextLine());
    }
}
