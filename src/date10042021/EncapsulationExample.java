package date10042021;

public class EncapsulationExample {
	private String name="Encapsulation";
	private int year=2021;
	
	
	void showName() {
		System.out.println("Show name"+name);
	}
	
	void showYear()
	{
		System.out.println("Enter year"+year);
	}
	void setName(String iName)
	{
		name=iName;
	}
	void setYear(int iYear)
	{
		year=iYear;
	}
}
