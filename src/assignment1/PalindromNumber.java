package assignment1;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner arm=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=arm.nextInt();
		int r=0;
		int num1=num;
		int temp;
		while(num>0)
		{
			temp=num%10;
			r=(r*10)+temp;
			num=num/10;
		}
		if(num1==r)
		{
			System.out.println("This is a Palindrom number");
		}
		else
		{
			System.out.println("This is not Palindrom number");
		}
		

	}

}
