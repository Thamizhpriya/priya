package sample1;

public class Sbi extends Rbi{
	public void sd()
	{
		System.out.println("SBI Acc# 123456789\nBranch Adayar" );
	}
	public static void main(String[] args)
	{
		Sbi sbiDetails=new Sbi();
		sbiDetails.sd();
		sbiDetails.aadharCard();
		sbiDetails.panCard();
	}	
}
