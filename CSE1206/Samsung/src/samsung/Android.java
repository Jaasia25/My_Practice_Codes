
package samsung;

public class Android {
    

	public static void main(String[] args) {
		Samsung samphone = new Samsung();
		Messenger messenger =new Messenger();
		
		System.out.println("Audio call: ");
		messenger.Call("01712345678");
		System.out.println("Video call: ");
		messenger.videoCall("Front camera");
		System.out.println("Use a Filter");
		messenger.filter("Tokyo filter\n");
		
		System.out.println("Phone call: ");
		samphone.Call("01812345678");
		System.out.println("Saving a contact");
		samphone.saveContacts("01812345678", "Rahim");
		System.out.println("Send SMS: ");
		samphone.sendSms("Rahim", "Call back");	
		
	}
}

