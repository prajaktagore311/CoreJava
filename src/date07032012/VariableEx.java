package date07032012;

public class VariableEx {
	/*public void localVariable()
	{
		int age=10;
		age=age+2;
		System.out.println("age is : "+age);
	}*/
	String name;
	Double salary=1000.00;
	
	public VariableEx(String ename) {
		name=ename;
		
	}
	public VariableEx(Double eSalary)
	{
		salary=eSalary;
		
	}
	public void instanceVariable()
	{
		System.out.println("name is: "+name);
		System.out.println("Salary is: "+salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableEx instance= new VariableEx("Prajakta");
				{
			instance.instanceVariable();
				}
		//  variable=new VariableEx();
		//variable.localVariable();
		

	}

}
