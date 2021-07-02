
package MethodOverride;

public class Teacher extends Person{
    
    //String sex = "M";
    
    Teacher(){
        System.out.println("Teacher's Constructor");
    }
    
    Teacher(String name, int age){
        super();
    }
    
    //@Override
    @Override
    void displayInfo(){ 
        //super.displayInfo();   //superclass er method call
        //System.out.println("My Subclass");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        //System.out.println("Sex : "+super.sex); //super dekhe F printed
    }
}
