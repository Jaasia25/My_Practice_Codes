

public class TotalPricing {
    
    
    public Book bookObj;
    
    TotalPricing(Book bookObj){
        this.bookObj=bookObj;
    }
         
         public void finalCost(){
             int price;
             price= bookObj.getPageC()*bookObj.getPageN();
             System.out.println("Total price : "+price);
             
             int p=1,temp,sq,last;
             temp= price;
             
             while(temp!=0)
             {
                 temp/=10;
                 p*=10;
             }
             
             sq= price*price;
             last= sq%p;
             
             if(last==price)
                 System.out.println("Pricing is too high");
             else
                 System.out.println("Pricing is ok");
             
         }
    }

