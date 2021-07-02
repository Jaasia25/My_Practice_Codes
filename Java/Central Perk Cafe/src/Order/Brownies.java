
package Order;

public class Brownies extends MyOrder {
    
    @Override
    double takeOrder(String food, int quantity){
        if(food.equalsIgnoreCase("The jack and judy")||
                food.equalsIgnoreCase("The carol and susan"))
        {
            return 270*quantity;
        }
        
        else if(food.equalsIgnoreCase("The mike and phoebe"))
        {
            return 300*quantity;
        }
        
        else
            return 0;
    }
    
}
