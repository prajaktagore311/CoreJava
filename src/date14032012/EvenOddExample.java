package date14032012;

import java.util.Scanner;

public class EvenOddExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first number");
		int num=obj.nextInt();
		//System.out.println("Enter Second number");
		//int num2=obj.nextInt();
		if(num%2==0)
		{
			
			System.out.println("Given number is Even");
		}
		else {
			System.out.println("Given number is odd");
		}
		obj.close();
	}

}
