package stringAssignment;

import java.util.Scanner;

public class EnterHalfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Even String");
		String str=obj.nextLine();
		int k=str.length();
		for(int i=0;i<=k/2;i++)
		{
		if(i%2==0)
	
		{
			System.out.println(str);
		}
		}
	
		System.out.println("Please Print even string");
		
		
	}

}
