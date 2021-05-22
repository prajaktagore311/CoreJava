package date14032012;

public class PenDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int listPrice=50;
		int discountRate=12;
		int discount =listPrice*12/100;
		System.out.println("Discount  is: "+discount+ "Rs");
		discount=listPrice-discount;
		System.out.println("Discount Price is :"+discount+ "Rs");
	}

}
