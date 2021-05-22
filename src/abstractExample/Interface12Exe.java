package abstractExample;

public class Interface12Exe implements Interface2Ex {
	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("Printable Statement");
	}
		
	public void showable()
	{
		System.out.println("Sowable.........");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface12Exe obj=new Interface12Exe();
		obj.printable();
		obj.showable();

	}
	
	}


