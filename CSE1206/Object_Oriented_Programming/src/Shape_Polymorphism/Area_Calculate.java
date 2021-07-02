
package Shape_Polymorphism;

public class Area_Calculate {
    public static void main(String[] args) {
        
        Shape s = new Shape();
        System.out.println("The Area is : "+s.area());
        
        s = new Rectangle(4.0, 5.0);
        System.out.println("The Reactangle Area is : "+s.area());
        
        s = new Triangle(4.0, 5.0);
        System.out.println("The Triangle Area is : "+s.area());
    
    }
}
