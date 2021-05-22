package date14032012;

import java.util.Scanner;

public class RectangleExample {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner rec=new Scanner(System.in);
		System.out.println("Enter base number");
		float base=rec.nextFloat();
		System.out.println("Enter height number");
		float height=rec.nextFloat();
		 
		 float area=base*height;
		System.out.println("the area of rectangle is: "+(area=base*height));
		rec.close();
	}

}
