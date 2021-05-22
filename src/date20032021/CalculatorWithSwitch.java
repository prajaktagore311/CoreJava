package date20032021;
import java.util.Scanner;
public class CalculatorWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
Scanner objStr=new Scanner(System.in);
System.out.println("Enetr First number:");
int first=obj.nextInt();
System.out.println("Enetr Second number:");
int second=obj.nextInt();
System.out.println("Enter your choice(add/sub/mult/div):");
String choice =objStr.nextLine();
switch(choice) {
case "add":System.out.println("Addition is:"+(first+second));
break;
case "sub":System.out.println("Subtraction  is:"+(first-second));
break;
case "mult":System.out.println("Multiplication is:"+(first*second));
break;
case "div":System.out.println("Division is:"+(first/second));
break;
default:System.out.println("You enter invalid choice:"+choice);
}
	}

}
