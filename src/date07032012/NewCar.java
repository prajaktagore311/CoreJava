package date07032012;

public class NewCar {
	String comapany;
	String modelName;
	String color;
	int year;
	int numberOfGears;
	
	NewCar(String iCoampny,String iModelName,String iColor,int iYear,int iGears)
	{
		comapany=iCoampny;
		modelName=iModelName;
		color=iColor;
		year=iYear;
		numberOfGears=iGears;
		
	}
	NewCar(String iCoampny,String iModelName,String iColor,int iGears)
	{
		comapany=iCoampny;
		modelName=iModelName;
		color=iColor;
		year=6;
		numberOfGears=iGears;
		
	}
	void displayCarDeatils()
	{
		System.out.println("Company name is: "+comapany);
		System.out.println("Model Nmae is: "+modelName);
		System.out.println("Color is: "+color);
		System.out.println("Year is: "+year);
		System.out.println("Number of Gears is: "+numberOfGears);
	}
	void displayCarStart()
	{
		System.out.println("Car is Strated.......");
	}
	void displayCarStop()
	{
		System.out.println("Car is Stopped.......");
	}
	
}

