
package Super_keyword;

public class Laptop extends PC{
    String name;
    
    Laptop(){
        
    }
    
    Laptop(String color, int ID, String name){
        super(color, ID);
        this.name = name;
    }
    
    @Override
    void Info(){
        System.out.println("Name : "+name);
        super.Info();
    }
}
