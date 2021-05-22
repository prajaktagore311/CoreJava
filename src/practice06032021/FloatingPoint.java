package practice06032021;

import java.util.Scanner;

public class FloatingPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fp=new Scanner(System.in);
		System.out.println("Enter first floating point number");
		double x=fp.nextDouble();
		System.out.println("Enter Second floating point number");
		double y=fp.nextDouble();
		x=Math.round(x*1000);
		x=x/1000;
		y=Math.round(y*1000);
		y=y/1000;
		if(x==y)
		{
			System.out.println("given number is same");
		}
		else
		{
			System.out.println("given number is different");
		}
		fp.close();
	}

}
