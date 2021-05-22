package assignment1;

import java.util.Scanner;

public class CodingBatTeaParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number");
		int tea=obj.nextInt();
		System.out.println("Enter a number ");
		int candy=obj.nextInt();
		
		 if(tea>=5&&candy>=5)
			{
				System.out.println("Party is good");
			
		
		 if((2*(tea+candy)>=candy)||(2*(candy+tea)>=tea))
		{
			System.out.println("Party is great");
		}
			}
		else {
			System.out.println("Party is Bad");
		}
		
	}

}
