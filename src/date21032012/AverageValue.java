package date21032012;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		//System.out.println("Enter the number");
		
		int sum=0;
		for(int i=0;i<=10;i++)
		{
			System.out.println("Enter a number");
			int num=obj.nextInt();
			sum=sum+num;
			
			
		}
		System.out.println("Average of number is: "+sum);
		obj.close();
	}

}
