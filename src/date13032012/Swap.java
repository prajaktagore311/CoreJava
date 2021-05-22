package date13032012;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		int z=x+y;
		x=z-x;
		y=z-y;
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
		
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("X :"+x);
		System.out.println("Y :"+y);
		

	}

}
