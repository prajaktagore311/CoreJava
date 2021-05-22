package assignment1;

import java.util.Scanner;

public class LastDigitSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		
		
		//int reverse1=0;
		//int reverse2=0;
		System.out.println("Enter first number");
		int a=obj.nextInt();
		a=a%10;
		//reverse1=reverse1*10+a;
		System.out.println(a);
		System.out.println("Enter second number");
		int b=obj.nextInt();
		b=b%10;
		//reverse2=reverse1*10+b;
		System.out.println(b);
		
		if((a>=0&&b>=0)&&(a==b))
		{
			
				System.out.println("true");
			
		}
			else {
				System.out.println("false");
			}
		}
		
	}


