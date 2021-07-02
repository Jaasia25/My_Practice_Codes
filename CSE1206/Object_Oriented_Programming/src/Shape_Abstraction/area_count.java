
package Shape_Abstraction;

public class area_count {
    public static void main(String[] args) {
        
        Shape s;
        
        s = new Triangle(4.0,5.0);
        System.out.println("The area of Triangle = "+s.area());
        
        s = new Rectangle(4.0,5.0);
        System.out.println("The area of Rectangle = "+s.area());
        
        s = new Circle(4.0);
        System.out.println("The area of Circle = "+s.area());
    }
}
