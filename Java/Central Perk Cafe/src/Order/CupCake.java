
package Order;

public class CupCake extends MyOrder {
    
    @Override
    double takeOrder(String food, int quantity){
        if(food.equalsIgnoreCase("The ben"))
        {
            return 250*quantity;
        }
        
        else if(food.equalsIgnoreCase("The emma"))
        {
            return 250*quantity;
        }
        
        else if(food.equalsIgnoreCase("The twins"))
        {
            return 470*quantity;
        }
        
        else if(food.equalsIgnoreCase("The triplets"))
        {
            return 700*quantity;
        }
        
        else
            return 0;
    }
    
}
