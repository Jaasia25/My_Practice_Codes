
package VarArgs;

public class Add {
    
    void Add(int ...num){
        
        int sum=0;
        
        for(int x: num){
            sum+=x;
        }
        
        System.out.println(sum);
    }
    
}
