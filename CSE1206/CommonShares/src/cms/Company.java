
package cms;

import java.util.Scanner;


public class Company {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Price:");
        double Price = input.nextDouble();
        CommonShares cs = new CommonShares(Price);

        System.out.println("Enter First Owner ID: ");
        int id1 = input.nextInt();
        Owner o1 = new Owner(Price, id1); 

        System.out.println("Enter Second Owner ID: ");
        int id2 = input.nextInt();
        Owner o2 = new Owner(Price, id2); 

        System.out.println("Enter price rise percentage: ");
        double rise = input.nextDouble();

        System.out.println("Owner ID: " + o1.getOwnerID());
        System.out.println("Rise Amount: " + rise);
        System.out.println("Price " + Owner.PriceRise(rise));

        System.out.println("Enter price fall percentage: ");
        double fall = input.nextDouble();

        System.out.println("Owner ID: " + o2.getOwnerID());
        System.out.println("Fall Amount: " + fall);
        System.out.println("Price " + Owner.PriceFall(fall));
    }
}