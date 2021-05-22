package date14032012;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner con=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=con.nextInt();
		System.out.println("Enter second number");
		int num2=con.nextInt();
		if(num1>num2)
		{
			System.out.println("number 1 is greater than number2");
		}
		else {
			System.out.println("number 2 is greater than number 1");
		}
		con.close();

	}

}
