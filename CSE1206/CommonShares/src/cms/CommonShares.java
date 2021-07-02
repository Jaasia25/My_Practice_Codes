
package cms;

public class CommonShares {

    private static double price;

    public CommonShares(double newPrice) {
        price=newPrice;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        CommonShares.price = price;
    }
}