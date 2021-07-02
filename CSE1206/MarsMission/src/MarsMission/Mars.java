package MarsMission;


import exceptions.NoInformationFoundException;
import java.util.Scanner;


public class Mars {
    
    public static void main(String[] args) {
        
        int code;
        Scanner input= new Scanner(System.in);
	Transceiver t= new Transceiver() {};
        Decoder d= new Decoder();
        System.out.print("Enter Code: ");
	code= input.nextInt();
        t.setCode(code);
         
		try {
		t.checkSignal();
		d.decodeSignal(t.getCode());
                
		} catch (NoInformationFoundException e) {
		System.out.println(e);
			
                }
    }
}
