
package ExceptionDemo_tryCatch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         
        int count = 1;
        
        while(count==1){
            try{
                Scanner input = new Scanner(System.in);
                System.out.println("Enter 1st number : ");
                int n1 = input.nextInt();
                
                System.out.println("Enter 2nd number : ");
                int n2 = input.nextInt();
                
                int result = n1/n2;
                
                System.out.println("Result = "+result);
                count = 2;
                
            }catch(Exception e){
                System.out.println("Exception : "+e);
                System.out.println("Please Take input again");
            }
        }
    }
}
