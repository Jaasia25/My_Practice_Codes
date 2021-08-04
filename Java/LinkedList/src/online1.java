import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


public class online1 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input = new Scanner(new File("Input.txt"));
        
        LinkedList<LinkedList<Integer>> my_list= new LinkedList<>();
        
        int x=0,y=0, i;
        
        for(i=0; i<6; i++)
        {
            boolean add = my_list.add(new LinkedList<>());
        }
        
        int array[] = new int[6];
        
        while(input.hasNextLine())
        {
            //String s = input.nextLine();
            int i1= input.nextInt();
            int i2= input.nextInt();
            if(i2%2==1) {
            	array[i1]+=i2;
            	my_list.get(i1).add(i2);
            }
            
        }
        
        for(i=1; i<6; i++)
        {
            if(array[i]>x)
            {
                x=array[i];
                y=i;
            }
        }
        System.out.println("Node " + y + " has the highest ODD sum of " + x);
        
        System.out.println("The ODD connections is with : "+my_list.get(y));
        
    }
    
}