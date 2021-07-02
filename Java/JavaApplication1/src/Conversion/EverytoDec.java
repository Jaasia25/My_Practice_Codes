
package Conversion;

import java.util.Scanner;

public class EverytoDec {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter a Binary Number: ");
        String binary= input.nextLine();
        Integer dec1= Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: "+dec1);
        
        System.out.println("Enter a Octal Number: ");
        String octal= input.nextLine();
        Integer dec2= Integer.parseInt(octal, 8);
        System.out.println("Octal to Decimal: "+dec2);
        
        System.out.println("Enter a Hexadecimal Number: ");
        String hex= input.nextLine();
        Integer dec3= Integer.parseInt(hex, 16);
        System.out.println("Hexadecimal to Decimal: "+dec3);
    }
}
