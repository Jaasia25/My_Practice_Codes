
package array;

import java.util.ArrayList;

public class ArrayList2 {
    
    public static void main(String[] args) {
        ArrayList <Integer> num1 = new ArrayList<>();
        ArrayList <Integer> num2 = new ArrayList<>();
        ArrayList <Integer> num3 = new ArrayList<>();
        
        num1.add(1);
        num1.add(2);
        num1.add(3);
        System.out.println("Number 1 : "+num1);
        
        num2.add(4);
        num2.add(5);
        num2.add(6);
        System.out.println("Number 2 : "+num2);
        
        num3.addAll(num1);
        System.out.println("Number 3 : "+num3);
        
        boolean result= num1.equals(num3);
        System.out.println("They are equal : "+result);
    }
}
