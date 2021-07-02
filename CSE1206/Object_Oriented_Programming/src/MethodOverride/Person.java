
package MethodOverride;

public class Person {
    
    String name;
    int age;
    //String sex = "F";
    
    Person(){
        System.out.println("Person's Constructor");
    }
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void displayInfo(){
        
        //System.out.println("My SuperClass ");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        //System.out.println("Sex : "+sex);
    }
}
