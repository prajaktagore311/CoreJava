package assignment1;

import java.util.Scanner;

public class Sum10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=obj.nextInt();
		System.out.println("Enter second number");
		int num2=obj.nextInt();
		//int a=10;
		if((num1==10||num2==10)||(num1+num2==10))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	


	}

}
