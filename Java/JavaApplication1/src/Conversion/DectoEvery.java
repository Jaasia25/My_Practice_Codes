
package Conversion;

import java.util.Scanner;

public class DectoEvery {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int decimal= input.nextInt();
        
        String binary= Integer.toBinaryString(decimal);
        System.out.println("Binary: "+binary);
        
        String octal= Integer.toOctalString(decimal);
        System.out.println("Octal: "+octal);
        
        String hex= Integer.toHexString(decimal);
        System.out.println("Hexadecimal: "+hex);
    }
}
