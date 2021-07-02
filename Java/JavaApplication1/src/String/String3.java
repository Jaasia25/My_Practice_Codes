
package String;

public class String3 {
    
    public static void main(String[] args) {
        
        String s1= "Jaasia is a Good Girl";
        String s2;
        
        s2= s1.replace("asia", "samin");
        
        System.out.println(s2);
        
        String[] s3= s1.split(" ");
        
        for(String x: s3)
        {
            System.out.println(x);
        }
    }
}
