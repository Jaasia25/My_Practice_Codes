
package covid.pkg19.vaccine;

public class ArmyPersonnel extends ApplicablePerson implements EligibilityDone{
    
    public ArmyPersonnel(String name, int age, boolean test){
     super(name,age,test);
}
    
    String s1="Eligible";
    String s2="Not Eligible";
    String s3="Waiting";

    
    public String Eligibility(){
        if(test==false)
        {
            if(age>22)
                return s1;
            else
                return s2;
        }
        else if(test==true)
        {
            return s2;
        }
        else
            return s3;

    }

    @Override
    public boolean getTest() {
        return this.test;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}
