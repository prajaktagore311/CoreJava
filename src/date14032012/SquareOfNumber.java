package date14032012;

import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sq=new Scanner(System.in);
		System.out.println("Enter the  number");
		int num=sq.nextInt();
		if(num<100)
		{
			num=num*num;
			System.out.println("Square of number is: "+num);
		}
		else if(num>100)
		{
			num=num+10;
			System.out.println("add 10 in given number then number is: "+num);
		}
		else {
			System.out.println("End Program......");
		}
		sq.close();
	}

}
