package date13032012;

public class Calculator {
int number1;
int number2;


public Calculator(int n1,int n2)
{
	number1=n1;
	number2=n2;
	

}
void add()
{
	System.out.println("Addition is:" +(number1+number2));
	}
void sub(int n1,int n2)
{
	System.out.println("Subtraction is: "+(number1-number2));
	System.out.println("Subtraction is: "+(n1-n2));
	System.out.println("Subtraction is: "+(number1+n1));
	System.out.println("Subtraction is: "+(number2+n2));
}
void mul() 
{
	System.out.println("Multiplication  is: "+(number1*number2));
	}
void div(int n1 ,int n2)
{
	System.out.println("Division  is: "+(number1/number2));
	System.out.println("Subtraction is: "+(n1/n2));
	System.out.println("Subtraction is: "+(number2/n2));
	System.out.println("Subtraction is: "+(number1/n1));
	}
}


