package assignment1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner arm=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=arm.nextInt();
		int r=0;
		int temp=0;
		int num1=num;
		while(num>0)
		{
			temp=num%10;
			num=num/10;
			r=r+(temp*temp*temp);
			
			
		}
		if(num1==r)
		{
			System.out.println("This is a armstrong number:"+r);
		}
		else
		{
			System.out.println("This is not Armstong number");
		}

	}

}
