
package samsung;

public class Messenger implements VideoCall{
    
    public void Call(String phoneNumber) {
        System.out.println ("Calling " + phoneNumber);
    }
    
    public void videoCall(String camera) {
	System.out.println("Video calling using "+ camera+"\n");	
	}
    public void filter(String F) {
		System.out.println("Selecting filter: "+ F);
	}
}
