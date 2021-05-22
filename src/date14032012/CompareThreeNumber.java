package date14032012;

public class CompareThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=11;
		int z=12;
		if(z<x)
		{
			System.out.println("Z is greater than x");
			if(z>y)
			{
				System.out.println("Z is greater than  Y");
			}
		}
		//System.out.println("End of Program........");
		
		if(z>x&&z>y)
		{
			System.out.println("Z is greater than  x and y");
		}
		System.out.println("End of Program......");
	}

}
