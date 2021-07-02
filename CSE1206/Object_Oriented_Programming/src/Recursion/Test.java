
package Recursion;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Factorial obj= new Factorial();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n= input.nextInt();
        int factorial= obj.fact(n);
        
        System.out.println("The Factorial is : "+factorial);
    
    }
    
}
