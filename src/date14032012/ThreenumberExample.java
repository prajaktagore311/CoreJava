package date14032012;

import java.util.Scanner;

public class ThreenumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=obj.nextInt();
		System.out.println("Enter second number");
		int num2=obj.nextInt();

		System.out.println("Enter third number");
		int num3=obj.nextInt();
		if(num1>num2&&num1>num3)
		{
			System.out.println("number1 is greater than other two");
		}
		if(num2>num1&&num2>num3)
		{
			System.out.println("number2 is greater than other two");
		}
		if(num3>num1&&num3>num2)
		{
			System.out.println("number3 is greater than other two");
		}
		
		System.out.println("End program......");
		obj.close();
		
	}
	
}
