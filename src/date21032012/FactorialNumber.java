package date21032012;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=obj.nextInt();
		int fact=1;
		for(int x=num;x>=1;x--)
		{
			fact=fact*x;
			
		}
		System.out.println("Factorial number is"+fact);
	}

}
