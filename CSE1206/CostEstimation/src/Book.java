

public class Book {
    
    private int numberOfPages, costPerPage;
    
    Book(int numberOfPages, int costPerPage){
        
        this.numberOfPages= numberOfPages;
        this.costPerPage= costPerPage;
    }
    
    public void setPageN(int numberOfPages){
        this.numberOfPages= numberOfPages;
    }
    
    public int getPageN(){
        return numberOfPages;
    }
    
    public void setPageC(int costPerPage){
        this.costPerPage= costPerPage;
    }
    
    public int getPageC(){
        return costPerPage;
    }
    
}
