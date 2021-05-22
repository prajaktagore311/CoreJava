package date21032012;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int firstnum=obj.nextInt();
		if(firstnum>21)
		{
			System.out.println("Double Difference: "+2*(firstnum-21));
		}
		else
		{
			System.out.println("Difference is: "+(21-firstnum));
		}
	}

}
