
package inheritance;

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        Person p1 = new Person();
        
        t1.setName("Jaasia");
        t1.setAge(21);
        t1.sex = "F";
        t1.setDegree("B.Sc. in CSE");
        
        t1.displayInfo();
        
        t2.setName("Joy");
        t2.setAge(21);
        t2.sex = "M";
        t2.setDegree("B.Sc. in CSE");
        
        t2.displayInfo();
        
        System.out.println(t1 instanceof Person);
        System.out.println(p1 instanceof Teacher);
    }
    
}
