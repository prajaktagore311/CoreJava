package date14032012;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner log=new Scanner(System.in);
		System.out.println("Enter two number :");
		int num1=log.nextInt();
		float num2=log.nextFloat();
		//char con=log.nextLine();
		//System.out.println("condition is :"+(num1>num2&&num1==num2));
		System.out.println("condition is:"+(num1<num2||num1==num2));
		log.close();

	}

}
