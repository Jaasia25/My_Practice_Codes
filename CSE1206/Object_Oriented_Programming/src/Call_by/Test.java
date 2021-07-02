
package Call_by;

public class Test {
    public static void main(String[] args) {
        
        CallbyValue obj1= new CallbyValue();
        int x= 111;
        System.out.println("Before Method Call: x = "+x);
        obj1.change(x);
        System.out.println("After Method Call: x = "+x);
        
        System.out.println();
        
        CallbyReference obj2= new CallbyReference();
        obj2.name= "Jaasia";
        System.out.println("Before Method Calling: Name = "+obj2.name);
        obj2.change(obj2);
        System.out.println("After Method Calling: Name = "+obj2.name);
    }
}
