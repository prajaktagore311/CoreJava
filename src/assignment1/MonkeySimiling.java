package assignment1;

import java.util.Scanner;

public class MonkeySimiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
				System.out.println("Enter a first a monkey");
		boolean aSmiling=obj.nextBoolean();
		System.out.println("Enter a seconf b monkey");
		boolean bSmiling=obj.nextBoolean();
		if(aSmiling&&bSmiling)
		{
			System.out.println("true");
		}
		else if(!aSmiling&&!bSmiling)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		

	}

}
