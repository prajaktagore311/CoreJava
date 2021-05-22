package assignment1;

import java.util.Scanner;

public class PinLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pin=new Scanner(System.in);
		System.out.println("Enter a pin: ");
		int code=pin.nextInt();
		
		int tries=1;
		int pinCode=410014;
		while((code!=pinCode)&&(tries<3))
		{
			System.out.println("Wel come to bank of india");
			System.out.println("Please enter a corret pin: ");
			code=pin.nextInt();
			tries++;
		}
		if(code==pinCode)
		{
			System.out.println("You can access your account");
		}
		else
		{
			System.out.println("You cannot access your account your account is locked");
		}

	}

}
