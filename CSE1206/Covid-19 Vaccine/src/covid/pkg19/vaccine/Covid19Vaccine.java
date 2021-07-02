
package covid.pkg19.vaccine;

import java.util.Scanner;

public class Covid19Vaccine {

    public static void main(String[] args) {
        
        System.out.println("Position = 1 : Front Line Workers");
        System.out.println("Position = 2 : Army Personnel");
        System.out.println("Position = 3 : Members of Parliament");
        System.out.println("Position = 4 : Civil Persons");
        
        ApplicablePerson person;
        person = new ApplicablePerson() {
            @Override
            public boolean getTest() {
                return test;
            }

            @Override
            public int getAge() {
                return age;
            }
        };
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter Name: ");
        String name= input.nextLine();
        
        System.out.println("Enter Position: ");
        int position= input.nextInt();
        
        System.out.println("Past Corona Test: ");
        boolean test= input.nextBoolean();
        
        System.out.println("Enter Age: ");
        int age= input.nextInt();
        
        ApplicablePerson fp= new FrontLineWorker(name,age,test);
        ApplicablePerson ap= new ArmyPersonnel(name,age,test);
        ApplicablePerson mp= new MemberParliament(name,age,test);
        ApplicablePerson cp= new Civil(name,age,test);
        
        switch (position) {
            case 1:
                System.out.println("Covid-19 Vaccine: "+fp.Eligibility());
                break;
            case 2:
                System.out.println("Covid-19 Vaccine: "+ap.Eligibility());
                break;
            case 3:
                System.out.println("Covid-19 Vaccine: "+mp.Eligibility());
                break;
            case 4:
                System.out.println("Covid-19 Vaccine: "+cp.Eligibility());
                break;
            default:
                break;
        }
    }
    
}
