package date17042021;

public class MultidimensionalArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] number= {{2,4,6,8},{3,6,9,12}};
		System.out.println(number[1][2]);
		System.out.println(number[0][3]);
		for(int i=0;i<number.length;i++)
		{
			
		
		for(int j=0;j<number[i].length;j++)
		{
			System.out.print(number[i][j]);
		}
		System.out.println();
		}
		
		String[][] name=new String[2][4];
		name[0][0]="pune";
		name[0][1]="fhghjgj";
		name[1][0]="ghhhkj";
		name[1][1]="ghjghjgh";
	}

}
