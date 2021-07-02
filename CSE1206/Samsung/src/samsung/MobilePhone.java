
package samsung;

public abstract class MobilePhone implements PhoneCall{
    
    abstract public void sendSms(String R, String msg);
    abstract public void saveContacts(String name, String phoneNumber);
}
