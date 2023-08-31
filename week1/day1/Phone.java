package week1.day1;

public class Phone {
           public static void main(String[] args) {
			Phone mobile = new Phone ();
			mobile.switchOn();
			mobile.takeAPic();
			mobile.call();
			mobile.watchAFilm();
			mobile.downloadDocument();
			mobile.viewDocument();
			mobile.sendDocument();
			mobile.viewPic();
			mobile.switchOffPhone();
			mobile.openNotePad();
			mobile.setAWallpaper();
			mobile.setAWallpaper();
			mobile.setARingtone();
			mobile.setANotificationTune();
		}
           public void switchOn() {
        	   System.out.println("switch on the phone");
           }
           
           public void call() {
        	   System.out.println("make a call");
           }
           
           public void watchAFilm() {
        	   System.out.println("watch a film");
           }
           
           public void sendDocument() {
        	   System.out.println("send the selected document");
           }
           
           public void downloadDocument() {
        	   System.out.println("download the Document");
           }
           
           public void viewDocument() {
        	   System.out.println("view the document");
           }
           
           public void takeAPic() {
        	   System.out.println("take a picture");
           }
           
           public void viewPic() {
        	   System.out.println("view a picture");
           }
           
           public void switchOffPhone() {
        	   System.out.println("switch off the Phone");
           }
           
           public void openNotePad() {
        	   System.out.println("open the notepad");
           }
           
           public void setARingtone() {
        	   System.out.println("set a new ringtone");
           }
           
           public void setANotificationTune() {
        	   System.out.println("set your favourite notification sound");
           }
           
           public void setAWallpaper() {
        	   System.out.println("set your favorite wallpaper from gallery");
           }
}
