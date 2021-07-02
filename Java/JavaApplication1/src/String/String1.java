
package String;

public class String1 {
    
    public static void main(String[] args) {
        
        String s1= "JAAsia ANjum", s2= "jaasia anjum";
        
        System.out.println("String Size : "+s1.length());
        
        if(s1==s2)
            System.out.println("Equal for =");
        else
            System.out.println("Not Equal for =");
        
        if(s1.equals(s2))
            System.out.println("Equal for .equals");
        else
            System.out.println("Not Equal for .equals");
        
        if(s1.equalsIgnoreCase(s2))
            System.out.println("Equal for Ignore case");
        else
            System.out.println("Not Equal for Ignore case");
        
        boolean contain = s1.contains("ANjum");
        System.out.println("Contains ANjum : "+contain);
        
    }
}
