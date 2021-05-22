package date21032012;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isPrime=true;
		int counter=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=obj.nextInt();

		for(int i=2; i<=num;i++)
		{
			if(num%i==0)
			{
				 isPrime = true;
				 counter++;
			}
			
		}
		if(counter<=2&&isPrime)
		{
			System.out.println(num+ " is a prime number");
		}
		else
		{
			System.out.println(num+ " is not prime number");
		}
		obj.close();

	}

}
