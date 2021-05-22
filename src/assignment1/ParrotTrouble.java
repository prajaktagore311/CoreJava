package assignment1;

import java.util.Scanner;

public class ParrotTrouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a current time");
        int hour=obj.nextInt();
        System.out.println("Parrot is loudly talking");
        boolean talking=obj.nextBoolean();
        //int time=23;
        	if((hour<7||hour>=20)&&talking==true)
        
        	{
        		System.out.println("true");
        	}
        
        else
        {
        	System.out.println("false");
        }
        }
 
	}


