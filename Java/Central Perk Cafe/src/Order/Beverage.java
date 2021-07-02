
package Order;

public class Beverage extends MyOrder {
    
    @Override
    double takeOrder(String food, int quantity){
        if(food.equalsIgnoreCase("The Monica")||
                food.equalsIgnoreCase("The Chandler")||
                food.equalsIgnoreCase("The ross")||
                food.equalsIgnoreCase("The phoebe")||
                food.equalsIgnoreCase("The joey")||
                food.equalsIgnoreCase("The rachel")||
                food.equalsIgnoreCase("Central perk special"))
        {
            return 300*quantity;
        }
        
        else if(food.equalsIgnoreCase("The gunther")||
                food.equalsIgnoreCase("The janice"))
        {
            return 250*quantity;
        }
        
        else
        {
            return 0;
        }
    }
    
}
