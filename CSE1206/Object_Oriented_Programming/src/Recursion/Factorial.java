
package Recursion;

public class Factorial {
    
    int fact(int x){
        
        if(x==1)
            return x;
        else
            return x*fact(x-1);
    }
}
