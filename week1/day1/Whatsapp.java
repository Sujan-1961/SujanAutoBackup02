package week1.day1;

public class Whatsapp {
            public static void main(String[] args) {
				System.out.println("Install the application");
				Whatsapp application = new Whatsapp();
				application.openWhatsapp();
				application.sendMessage();
				application.addAStatus();
			}
            
            public void openWhatsapp() {
            	System.out.println("open the application");
            }
            
            public void sendMessage() {
            	System.out.println("send the message");
            }
            
            public void recieveMessage() {
            	System.out.println("receive a message");
            }
            
            public void addAStatus() {
            	System.out.println("Add a status to the feed");
            }
            
            public void downloadDocument() {
            	System.out.println("download the received document");
            }
            
            public void downloadImage() {
            	System.out.println("download the image");
            }
}
