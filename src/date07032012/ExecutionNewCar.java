package date07032012;

public class ExecutionNewCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewCar santro=new NewCar("hudai", "santro", "white", 2012, 5);
				
			santro.displayCarDeatils();
			santro.displayCarStart();
			santro.displayCarStop();
			
			
			NewCar beat=new NewCar("Cheverlate", "Beat","Green", 2012, 5);
			beat.displayCarDeatils();
			beat.displayCarStart();
			beat.displayCarStop();
			
			
			
			NewCar waganor=new NewCar("Maruti", "Waganor", "White", 6);
			waganor.displayCarDeatils();
			waganor.displayCarStart();
			waganor.displayCarStop();
				

	}

}
