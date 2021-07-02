
package Order;

import java.util.Scanner;

class order {
    public static void main(String[] args) {
        
        int quantity, on=1;
        String food;
        Scanner input= new Scanner(System.in);
        double sum=0, sum1=0, sum2=0, sum3=0, sum4=0;
       
        Beverage bev = new Beverage();
        CupCake cup = new CupCake();
        Brownies brow = new Brownies();
        Pastry pas = new Pastry();
        
        while(on>0){
            System.out.println("Enter your order: ");
            food = input.nextLine();
            
            System.out.println("Enter the Quantity: ");
            quantity = input.nextInt();
            
            input.nextLine();
            System.out.println("Enter the Type: ");
            on = input.nextInt();
            
            if(on==1)
                sum1 =sum1+ bev.takeOrder(food, quantity);
            else if(on==2)
                sum2 =sum2+ cup.takeOrder(food, quantity);
            else if(on==3)
                sum3 =sum3+ brow.takeOrder(food, quantity);
            else if(on==4)
                sum4 =sum4+ pas.takeOrder(food, quantity);
            
            
            System.out.println("Click 0 to exit");
            on= input.nextInt();
            input.nextLine();
        }
        
        sum = sum1+sum2+sum3+sum4;
        
        System.out.println("Your total bill is "+sum);
        
    }
}
