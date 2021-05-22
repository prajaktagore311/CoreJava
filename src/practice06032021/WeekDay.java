package practice06032021;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=obj.nextInt();
		if(num<=7)
		{
		if(num==1)
		{
		
			System.out.println("Today is Sunday");
		}
		if(num==2)
		{
		
			System.out.println("Today is Monday");
		}
		if(num==3)
		{
		
			System.out.println("Today is Tuesdayh");
		}
		if(num==4)
		{
		
			System.out.println("Today is wednesday");
		}
		if(num==5)
		{
		
			System.out.println("Today is Thursday");
		}
		if(num==6)
		{
		
			System.out.println("Today is Friday");
		}
		if(num==7)
		{
		
			System.out.println("Today is Saturday");
		}
		}
		else {
			System.out.println("Please Enter valid Number");
		}
		
		
		obj.close();
		
		
	}

}
