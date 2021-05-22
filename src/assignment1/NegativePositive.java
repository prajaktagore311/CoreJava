package assignment1;

import java.util.Scanner;

public class NegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=obj.nextInt();
		System.out.println("Enter second number");
		int b=obj.nextInt();
		System.out.println("Enter boolean value");
		boolean c=obj.nextBoolean();
		if((a<0||b<0)||(a<0&&b<0)&&c==true )
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
