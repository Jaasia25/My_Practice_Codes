
package Basic_Demo;

public class Teacher {
    
    String Name;
    int age;
    String phone;
    
    Teacher(){
        
    }
    
    Teacher(String Name, int age, String phone){
        this.Name= Name;
        this.age= age;
        this.phone= phone;
    }
    
    //Overloading Constructor
    Teacher(int age, String Name, String phone){
        this.Name= Name;
        this.age= age;
        this.phone= phone;
    }
    
    void setInfo(String Name, int age, String phone){
        this.Name= Name;
        this.age= age;
        this.phone= phone;
    }
    
    void print_Teacher(){ 
        //System.out.println("The Teacher's Name: "+Name);
        //System.out.println("The Teacher's Age: "+age);
        //System.out.println("The Teacher's Phone Number: "+phone);
        System.out.println("No parameter");
    }
    
    void print_Teacher(int a){ //Method Overloading
        System.out.println("One Parameter ");
    }
    
    void print_Teacher(int a, int b){ //Method Overloading
        System.out.println("Two Parameter ");
    }
    
    void print_Teacher(int a, int b, int c){ //Method Overloading
        System.out.println("Three Parameter ");
    }
}
