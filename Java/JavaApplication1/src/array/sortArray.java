
package array;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    
    public static void main(String[] args) {
        
        int[] arr= new int[5];
        String[] name;
        name = new String[5];
        int i;
        
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter Names: ");
        for(i=0;i<5;i++)
            name[i]= input.nextLine();
        
        Arrays.sort(name);
        
        System.out.print("Ascending : ");
        for(i=0;i<5;i++)
            System.out.print(" "+name[i]);
        
        System.out.println();
        
        System.out.print("Descending : ");
        for(i=4;i>=0;i--)
            System.out.print(" "+name[i]);
            
        System.out.println();
        
        System.out.println("Enter Numbers: ");
        for(i=0;i<5;i++)
            arr[i]= input.nextInt();
        
        Arrays.sort(arr);
        
        System.out.print("Ascending : ");
        for(i=0;i<5;i++)
            System.out.print(" "+arr[i]);
        
        System.out.println();
        
        System.out.print("Descending : ");
        for(i=4;i>=0;i--)
            System.out.print(" "+arr[i]);
            
        System.out.println();
    }
}
