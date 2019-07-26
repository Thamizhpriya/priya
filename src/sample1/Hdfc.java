package sample1;

public class Hdfc extends Rbi{
		public void hdfcd()
		{
			System.out.println("HDFC Acc# 258963149\nBranch Thiruvanmiyur" );
		}
		public static void main(String[] args)
		{
			Hdfc hdfcDetails=new Hdfc();
			hdfcDetails.hdfcd();
			hdfcDetails.aadharCard();
			hdfcDetails.panCard();
		}
}
