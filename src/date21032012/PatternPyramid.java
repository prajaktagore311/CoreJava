package date21032012;

public class PatternPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//outer loop row control 
		//inner loop colunm control
		//Reverse pyramid
		/*for(int i=5; i>=0; i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		//pyramid
		/*for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		for(int i=5;i>=0;i--)
		{
			for(int j=5;j<i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
