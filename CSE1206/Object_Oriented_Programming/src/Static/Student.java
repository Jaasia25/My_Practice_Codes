
package Static;

public class Student {
    
    String name;
    int id;
    static String school= "Holy Cross School";
    static int count=0;  //static na hoile protibar count=1 hoy karon alada object
    
    Student(String name, int id){
        this.name= name;
        this.id= id;
        count++;
    }
    
    static void print_info(){
        //System.out.println("Name : "+name);
        //System.out.println("ID : "+id);
        //ei 2 tar khetre error dibe coz name,id non-static variable
        
        System.out.println("School : "+school);
        System.out.println("Student Count : "+count);
        System.out.println();
    }
}
