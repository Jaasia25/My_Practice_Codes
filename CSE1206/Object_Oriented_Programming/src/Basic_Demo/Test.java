
package Basic_Demo;

public class Test {
    
    public static void main(String[] args) {
        
        Teacher t1= new Teacher("Jaasia", 21, "01763392331"); //parametrized constructor
        Teacher t2= new Teacher(); //default constructor
        Teacher t3= new Teacher(21, "Anjum","01941410963"); //overloading constructor
        
        t2.setInfo("Anika", 19, "01729398892");
        
        t1.print_Teacher();
        System.out.println(" ");
        t2.print_Teacher(3);
        System.out.println(" ");
        t3.print_Teacher(4, 5);
        System.out.println(" ");
        t3.print_Teacher(4, 5, 6);
    }
}
