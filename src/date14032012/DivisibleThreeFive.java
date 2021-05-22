package date14032012;

import java.util.Scanner;

public class DivisibleThreeFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner div=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=div.nextInt();
		if(num%3==0&&num%5==0)
		{
			System.out.println("The given number is divisible by 3 and 5");
		}
		else if(num%3==0)
		{
			System.out.println("The given number is only divisible by 3");
		}
		else if(num%5==0)
		{
			System.out.println("The given number is only divisible by 5");
		}
		else {
			System.out.println("The given number is not divisible by 3 or 5");
		}
		System.out.println("End Program.......");
		div.close();
	}

}
