package date21032012;

import java.util.Scanner;

public class DoubleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int firstnum=obj.nextInt();
		System.out.println("Enter a number");
		int secondnum=obj.nextInt();
		if(firstnum==secondnum)
		{
			System.out.println("Double sum is: "+2*(firstnum+secondnum));
		}
		else
		{
			System.out.println("Sum is "+(firstnum+secondnum));
		}
	}

}
