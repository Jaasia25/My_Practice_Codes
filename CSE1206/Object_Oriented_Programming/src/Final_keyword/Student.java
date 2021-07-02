
package Final_keyword;

final public class Student extends University{
    
    int ID;
    
    Student(int ID){
        this.ID = ID;
    }
    
    void printInfo(){
        super.print();
        System.out.println("ID : "+ID);
    }
}
