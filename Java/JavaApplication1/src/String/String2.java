
package String;

public class String2 {
    
    public static void main(String[] args) {
        
        String s1= "JAAsia ANjum", s2= "jaasia anjum",s3;
        
        s3= s1.concat(s2);
        System.out.println("Concatenated : "+s3);
        
        System.out.println("Uppercase : "+s1.toUpperCase());
        System.out.println("Lowercase : "+s1.toLowerCase());
        
        boolean a= s1.startsWith("J");
        boolean b= s3.endsWith(s2);
        
        System.out.println("Starts with: "+a);
        System.out.println("Ends with: "+b);
        
        String[] names= {"jaas", "sia", "anjum"};
        
        for(String i: names)
        {
            System.out.println(i+" ");
        }
    }
}
