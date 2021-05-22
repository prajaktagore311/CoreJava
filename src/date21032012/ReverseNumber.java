package date21032012;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=obj.nextInt();
	     int reverse=0;
	     int orignum=num;
		int temp;
		
		while(num>=1)
		{
			temp=num%10;
			reverse=reverse*10+temp;
			num=num/10;
			
		}
		System.out.println("Reverse number is"+reverse);

	}

}
