package assignment1;

import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		//System.out.println("Enter a number");
		//int num=obj.nextInt();
		int secret=5;
		int n=1;
	     while(n<=10)
		{
			System.out.println("Enter a number");
			int num=obj.nextInt();
			if(num==secret)
			{
			System.out.println("Your are corret gussing a number");
			}
			else {
		
		System.out.println("Please try again your are wrong");
			}
		}
		
	}	

}
