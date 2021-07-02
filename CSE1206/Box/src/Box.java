
public class Box {
    
    public double length;
    public double height;
    public double width;
    
    Box(double length, double height, double width){
        
        this.length= length;
        this.height= height;
        this.width= width;       
    }
    
    public double displayVol(){

        return length*height*width;
    }
    
}