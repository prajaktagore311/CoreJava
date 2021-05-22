package assignment1;

import java.util.Scanner;

public class AgeCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Age");
		int age=obj.nextInt();
		if(age<16)
		{
			System.out.println("Yor are not eligible");
		}
		else if(age>16&&age<17)
		{
			System.out.println("You can drive but not vote");
		}
		else if(age>18&&age<24)
		{
			System.out.println("You can vote but not rent a car");
		}
		else {
			System.out.println("You are so preety");
		}
		
		

	}

}
