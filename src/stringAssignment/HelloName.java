package stringAssignment;

import java.util.Scanner;

public class HelloName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		StringBuffer str1=new StringBuffer("hello");
		System.out.println("Enter a name");
		String name=s1.nextLine();
		str1=str1.append(name);
		System.out.print(str1);
		System.out.println("!");

	}

}
