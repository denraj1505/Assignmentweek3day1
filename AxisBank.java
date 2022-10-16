package Bank;

public class AxisBank extends BankInfo{
	public void deposit()
	{   
		System.out.println("Deposit is");
		super.deposit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         AxisBank AB=new AxisBank();
         AB.deposit();
         
		
	}

}
