package assignment1;

import java.util.Scanner;

public class DowhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		//int sum=0;
		int num;
		do {
			System.out.println("Enter a number");
			 num=obj.nextInt();
			 if(num%2==0)
				{
					System.out.println("This is a even number"+num);
				}
				
			 else {	System.out.println("This is a odd number"+num);
				
				
			 }
			
		
		}while(num>0);
		
		

	}

}
