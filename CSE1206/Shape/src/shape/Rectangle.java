
package shape;

public class Rectangle extends Shape{

    Rectangle(double a, double b) {
        a= 5;
        b=6;
    }
    
    double area(){
       double area = a*b;
       return area;
    }
}
