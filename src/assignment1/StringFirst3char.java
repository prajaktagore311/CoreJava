package assignment1;

import java.util.Scanner;

public class StringFirst3char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=obj.nextLine();
       String  str1;
		if(str.length()>3)
		{   
			str1=str.substring(0, 3);
			System.out.println("First three char"+str1);
			System.out.print(str1+str1+str1);
			
		}
		else
		{
		System.out.println("Pleas enter more than 3 string character");
		
		}
		

	}

}
