
package array;

import java.util.ArrayList;

public class ArrayList1 {
    
    public static void main(String[] args) {
        ArrayList <Integer> Number = new ArrayList <>();
        
        Number.add(10);
        Number.add(20);
        Number.add(30);
        Number.add(40);
        Number.add(50);
        Number.add(3,33);
        
        System.out.println("The Position of 33 is: "+Number.indexOf(33));
        
        System.out.println("Array Size = "+Number.size());
        boolean checkElement= Number.contains(33);
        System.out.println(checkElement);
        
        for(int i: Number)
        {
            System.out.print(i+" ");
        }
        
        boolean check1= Number.isEmpty();
        System.out.println();
        System.out.println("Checking 1st time: "+check1);
      
        Number.remove(3);
        boolean checkElement2= Number.contains(33);
        System.out.println(checkElement2);
        System.out.println("After removing : ");
        for(int i: Number)
        {
            System.out.print(i+" ");
        }
        
        System.out.println();
        //Number.removeAll(Number);
        Number.clear();
        //System.out.println("After removing All: ");
        System.out.println("After clearing All: ");
        for(int i: Number)
        {
            System.out.print(i+" ");
        }
        
        boolean check2 = Number.isEmpty(); 
        System.out.println("Checking 2nd time: "+check2);
        
    }
}
