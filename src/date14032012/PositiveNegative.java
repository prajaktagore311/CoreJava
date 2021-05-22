package date14032012;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=pn.nextInt();
		if(num>0)
		{
			System.out.println("Given number is Positive");
		}
		else if(num<0){
			System.out.println("Given number is negative");
		}
		else {
			System.out.println("number is zero");
		}
		pn.close();
	}

}
