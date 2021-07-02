
package array;

import java.util.Scanner;

public class Array{

    public static void main(String[] args) {
        
        int[] Number= new int[10];
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter Numbers: ");
        
        for(int i=0; i<5; i++)
            Number[i]= input.nextInt();
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Number["+i+"] = "+Number[i]);
        }
    }
    
}
