
package Order;

public class Pastry extends MyOrder {
    
    @Override
    double takeOrder(String food, int quantity){
        if(food.equalsIgnoreCase("The mondler")||
                food.equalsIgnoreCase("The roschel"))
        {
            return 300*quantity;
        }
        
        else
            return 0;
    }
    
}
