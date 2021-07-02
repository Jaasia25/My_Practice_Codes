
package cms;


public class Owner extends CommonShares{

    private int ownerID;

    public Owner(double newPrice) {
        super(newPrice);

    }

    public Owner(double newPrice, int ownerID) {
        super(newPrice);
        this.ownerID = ownerID;
    }

    public int getOwnerID() {
        return ownerID;
    }
    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public static double PriceRise(double percentage){
        return getPrice() + (getPrice() * percentage);
    }

    public static double PriceFall(double percentage){
        return getPrice() - (getPrice() * percentage);
    }
}