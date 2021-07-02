
package samsung;

public class Samsung extends MobilePhone{
    
    @Override
    public void Call(String phoneNumber) {
        System.out.println ("Calling " + phoneNumber);
    }
    
    @Override
    public void sendSms(String R, String msg) {
        System.out.println ("Sending " + R + "message: " + msg);
    }
    
    @Override
    public void saveContacts(String name, String phoneNumber){
        System.out.println ("Saving " + name + ", Number: " + phoneNumber);
    }
    
}
    

    
    
