package MarsMission;


public class Decoder {
    
    private int code;
    

	public void decodeSignal(int code) {
	if(code%2==0){
            System.out.println("Water Found!");
        }
        if(code%3==0){
            System.out.println("Microorganism Found!");
        }
        if(code%5==0){
            System.out.println("Minerals Found!");
        }

	}
}
