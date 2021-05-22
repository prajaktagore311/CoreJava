package date20032021;

import java.util.Scanner;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Start number");
		int x=obj.nextInt();
		System.out.println("Enter End number");
		int y=obj.nextInt();
	
		for(int i=x;i<=y;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number"+i);
			}
			//System.out.println(x+"X"+i+"="+x*i);
		}
		obj.close();
	}

}
