
package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(122);
        num.add(-21);
        num.add(-22);
        num.add(22);
        num.add(12);
        
        Collections.sort(num);
        System.out.println("Ascending : "+num);
        
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("Descending : "+num);
    }
}
