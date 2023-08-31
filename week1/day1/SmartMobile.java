package week1.day1;

public class SmartMobile {
         public static void main(String[] args) {
        	System.out.println("Switch on the phone");
			SmartMobile phone = new SmartMobile();
			phone.sendMessage();
			phone.shareDocument();
			phone.takeAPic();	
			phone.sendAPic();
			phone.sendTheAudioMessage();
			phone.watchAMovie();
			phone.call();
		
		}
         
         public void sendMessage() {
        	 System.out.println("Send a message to a frnd");
         }
         
         public void shareDocument() {
        	 System.out.println("Send a doc file");
         }
         
         public void sendAPic() {
        	 System.out.println("Send the pic");
         }
         
         public void sendTheAudioMessage() {
        	 System.out.println("Send the audio message");
         }
         
         public void takeAPic() {
        	 System.out.println("Open camera and take a pic");
         }
         
         public void watchAMovie() {
        	 System.out.println("Open MXplayer and watch a film");
         }
         
         public void call() {
        	 System.out.println("Call a Frnd");
         }
}
