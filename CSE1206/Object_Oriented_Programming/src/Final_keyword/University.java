
package Final_keyword;

public class University {
    
    final String UNIVERSITY= "AUST";
    final int FEES;
    static final int YEAR;
    
    University(){
        FEES = 105000;
    }
    
    static{
        YEAR= 1900;
    }
    
    final void print(){
        System.out.println("University : "+UNIVERSITY);
        System.out.println("Fees : "+FEES);
        System.out.println("Since : "+YEAR);
    }
}
