
package Shape_Polymorphism;

public class Rectangle extends Shape{
    
    double length, width;
    
    Rectangle() {
        
    }
    
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    double area(){
        return length*width;
    }
}
