
package Encapsulation;

import java.util.Scanner;

public class Test {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        Person p1 = new Person();
        int age;
        String name;
        
        System.out.println("Enter Name : ");
        name = input.nextLine();
        
        System.out.println("Enter Age : ");
        age = input.nextInt();
        
        p1.setName(name);
        p1.setAge(age);
        
  
        System.out.println("Name : "+p1.getName());
        System.out.println("Age : "+p1.getAge());
        System.out.println();
    }
 
}
