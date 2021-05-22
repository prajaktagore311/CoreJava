package date14032012;

import java.util.Scanner;

public class AdditionOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner add=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int number1=add.nextInt();
		int number2=add.nextInt();
		float number3=add.nextFloat();
	
		System.out.println("Addition of two number is :"+(number1+number2));
		System.out.println("Addition of two number is :"+(number2+number3));
		add.close();
		
	}

}

