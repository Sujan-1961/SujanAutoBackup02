package week5.day1task;

public class Student {
          public void getStudentsInfo(int studentid) {
        	  System.out.println("The student id is " + studentid);
          }
          
          public void getStudentInfo(String studentname, int studentid) {
        	  System.out.println("The Student name is " + studentname + "The Student id is " + studentid);
          }
          
         public void getStudentInfo(String emailid) {
        	 System.out.println("The student email id is " + emailid);
         }
         
         public void getStudentInfo(long phoneno) {
        	 System.out.println( "The student phonenumber is " + phoneno);
         }
         
         public void getStudentInfo(String emailid, long phoneno) {
        	 System.out.println("The student email id is " + emailid + "The student phonenumber is " + phoneno);
         }
         
          public static void main(String[] args) {
			Student college = new Student();
			college.getStudentsInfo(4055);
			college.getStudentInfo("Sujan", 4055);
			college.getStudentInfo("sujandepp@gmail.com");
			college.getStudentInfo(8903255359L);
			college.getStudentInfo("sujandepp@gmail.com", 8903255359L);
			
			
		}
}
