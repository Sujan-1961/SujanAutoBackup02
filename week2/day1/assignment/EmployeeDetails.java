package week2.day1.assignment;

public class EmployeeDetails {
       public void printEmployeeName ( String empName, int empId) {
			/*
			 * String employeename = empName; int employeeid = empId;
			 */
    	   System.out.println(empName);
    	   System.out.println(empId);
       }
       
       public void getEmployeeAddress (String empAddress) {
			/* String empaddress = empAddress; */
    	   System.out.println(empAddress);
       }
       
       public void printEmployeeSalary (double empSalary) {
    	   System.out.println(empSalary);
       }
       
       public void printEmployeeMobileNumber (long mobNum) {
    	   System.out.println(mobNum);
       }
       
       public static void main(String[] args) {
		   EmployeeDetails employee = new EmployeeDetails (); 
			   employee.printEmployeeName ("Sujan", 4065);
			   employee.getEmployeeAddress("3/245, Dubai kurukku sandhu, Dubai main rd, Dubai.");
			   employee.printEmployeeSalary(89076.99);
			   employee.printEmployeeMobileNumber(987645321);
		   
	}
}
