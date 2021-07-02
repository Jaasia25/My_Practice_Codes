package ExceptionDemo_throw;

import UserDefinedException.*;

public class User {

    public void countUser() throws TooManyUsers {
        int Users = 0;

        while (Users < 500) {
            Users++;
        }

        System.out.println(Users);

        throw new TooManyUsers("Maximum reached");

    }

    public void authenticUser(String username) {
        if(username.equals("")){
            try{
                throw new NotAuthenticatedUserException("User not authenticated");
            }catch(NotAuthenticatedUserException e){
                System.out.println(e);
                System.out.println("Take Correct input");
            }
        }
        
        else
            System.out.println(username +" is an authentic user");
    }
}
