
package inheritance;

public class Teacher extends Person{
    
    private String degree;

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    void displayInfo(){
        
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Sex : "+sex);
        System.out.println("Degree : "+getDegree());
        System.out.println();
    }
}
