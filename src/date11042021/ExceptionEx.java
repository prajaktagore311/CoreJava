package date11042021;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");//enter number
		int num=obj.nextInt();
		System.out.println("Enter a number");//enter zero number at that time come exception 
		int num1=obj.nextInt();
		
		
		try
		{
			int result=num/num1;//unchecked exception
			System.out.println("The result of division: "+result);
		}catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
		
		System.out.println("End program");
	
	}

}
