
import java.util.Scanner;


public class CostEstimation {

    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
        int in1, in2;
        
        System.out.print("Number of pages : ");
        in1= input.nextInt();
        
        System.out.print("Cost per page : ");
        in2= input.nextInt();
        
        Book book= new Book(0,0);
        
        TotalPricing Price= new TotalPricing(book);
        
        book.setPageN(in1);
        book.setPageC(in2);
        
        Price.finalCost();
    }
    
}
