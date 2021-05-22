package assignment1;

import java.util.Scanner;

public class Max1020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number in between 10 to 20");
		int a=obj.nextInt();
		System.out.println("Enter a number in between 10 to 20");
		int b=obj.nextInt();
		if((a>10&&a<20)&&(b>10&&b<20))
		{
			if(a>b)
			{
				System.out.println("A is greater than b");
			}
			else if(b>a)
			{
				System.out.println("B is greater than A");
			}
		}
		else
		{
			System.out.println("Return 0");
		}
		

	}

}
