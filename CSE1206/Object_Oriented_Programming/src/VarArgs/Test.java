
package VarArgs;

public class Test {
    public static void main(String[] args) {
        
        Add o1= new Add();
        
        o1.Add(10);
        o1.Add(10,20);
        o1.Add(10,20,30,40);
        o1.Add(10,20,40,50);
    }  
}
