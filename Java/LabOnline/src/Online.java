import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;


public class Online {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner input= new Scanner(new File("Input.txt"));
        
        LinkedList<LinkedList<Integer>> my_list= new LinkedList<>();
        
        int x = 0,y = 0, i;
        
        for(i=0; i<6; i++)
        {
            my_list.add(new LinkedList<>());
        }
        
        int a[] = new int[6];
        
        while(input.hasNextLine())
        {
            int i1= input.nextInt();
            int i2= input.nextInt();
            if(i2%2==1) {
            	a[i1] += i2;
            	my_list.get(i1).add(i2);
            }
            
        }

        for(i=1; i<6; i++)
        {
            if(a[i]>x)
            {
                x = a[i];
                y = i;
            }
        }
        
        System.out.println("Node " + y + " contains the highest ODD sum of " + x);
        System.out.println("The ODD connections with : "+my_list.get(y));
    }
    
}