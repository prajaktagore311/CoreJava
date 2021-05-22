package date14032012;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter first numbers");
		int x=obj.nextInt();
		System.out.println("Enter second  number");
		int y=obj.nextInt();
		if(x>y)
		{
			System.out.println("x is greater than y");
		}
		if(y>x)
		{
			System.out.println("y is greater than x");
		}
		System.out.println("End of Program......");
		
		obj.close();
		

	}

}
