package date14032012;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your name");
		String  name=obj.nextLine();
		System.out.println("Enter your city and pincode");
		String city=obj.nextLine();
		int pinCode=obj.nextInt();
		System.out.println("Hello ,"+ name);
		System.out.println("i am belongs to ,"+ city);
		System.out.println("Pincode is ,"+ pinCode);
		
        obj.close();
        
	}

}
