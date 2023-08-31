package oops.assignment;

public class AxisBank extends BankInfo {
	@Override
         public void deposit() {
        	 System.out.println("Deposited the money");
         }
         
         public static void main(String[] args) {
			AxisBank drive = new AxisBank();
			drive.saving();
			drive.fixed();
			drive.deposit();
		}
}
