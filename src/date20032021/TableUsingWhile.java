package date20032021;
import java.util.Scanner;
public class TableUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
Scanner scstr=new Scanner(System.in);
System.out.println("Enter any number");
int i=sc.nextInt();
int num=1;
while(num<=10) {
	System.out.println(i +"x"+num+"="+i*num);
	num++;}
System.out.println("Do u want to continue(Y/N):");
String ch=scstr.nextLine();
System.out.println("User choice:"+ch);
System.out.println("Enter any number");
 i=sc.nextInt();
 num=1;
while(num<=10) {
	System.out.println(i +"x"+num+"="+i*num);
	num++;
	}
	}
}

