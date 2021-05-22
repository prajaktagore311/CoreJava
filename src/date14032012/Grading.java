package date14032012;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner gd=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int num=gd.nextInt();
		if (num<35)
		{
			System.out.println("Sorry your Fail Try Again");
		}
		else if(num>35&&num<50)
		{
			System.out.println("you got D grade");
		}
		else if(num>50&&num<60)
		{
			System.out.println("you got C grade");
		}
		else if(num>60&&num<70)
		{
			System.out.println("you got B grade");
		}
		else if(num>70&&num<80)
		{
			System.out.println("you got A grade");
		
		}
		else if(num>80&&num<90)
		{
			System.out.println("you got A+ grade");
		}
		else if(num>90&&num<100)
		{
			System.out.println("you got O grade");
		}
		else {
			System.out.println("Invalid result");
		}
	}

}
