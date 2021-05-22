package date20032021;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value between 1-7");
		int input=obj.nextInt();
		
		switch(input)
		{
		
		case 1:System.out.println("Monday");
			break;
		case 2:System.out.println("Tuesday");
			break;
			
		case 3:System.out.println("wednesday");
			break;
			
		case 4:System.out.println("thursday");
			break;
			
		case 5:System.out.println("Friday");
			break;
			
		case 6:System.out.println("Saturday");
			break;
			
		case 7:System.out.println("Sunday");
			break;
		default:System.out.println("Enter invalid number:" +input);
		
		
		}
	}

}
