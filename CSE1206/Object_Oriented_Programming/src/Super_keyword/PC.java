
package Super_keyword;

public class PC {
    
    String color;
    int ID;
    
    PC(){
        
    }
    
    PC(String color, int ID){
        this.color= color;
        this.ID = ID;
    }
    
    void Info(){
        System.out.println("Colour : "+color);
        System.out.println("ID : "+ID);
    }
}
