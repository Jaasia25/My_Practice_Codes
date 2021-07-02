
package covid.pkg19.vaccine;

import java.util.Scanner;

public abstract class ApplicablePerson {
    
    Scanner input= new Scanner(System.in);
        private String name;
        int age;
        boolean test;
        String s = "default";
        
        public String Eligibility(){
           return s;
        }
        
        ApplicablePerson(){
          
        }
    
        ApplicablePerson(String name, int age, boolean test){
            this.name= name;
            this.age=age;
            this.test=test;
        }
        
        public void setName(String name){
        this.name = name;
    }
    
        public String getName(){
        return name;
    }
    
        public void setTest(boolean test){
        this.test= test;
    }
    
        abstract public boolean getTest();
    
        public void setAge(int age){
        this.age = age;
    }
    
        abstract public int getAge();
        
}
