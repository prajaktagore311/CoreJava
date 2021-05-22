package assignment1;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			for(int j=5;j>=i;j--) {
			if(i==5&&j==5)
		{
			break;
		}
			
		System.out.println(i+" "+j);
		}
		}

	}

}
