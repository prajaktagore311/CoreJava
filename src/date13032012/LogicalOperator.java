package date13032012;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=11;
		int z=12;
		int a=10;
		boolean res =x<y&&a>y;
		System.out.println(res);
		System.out.println(x==y||x>y);
		System.out.println(!(x==y||x>z));
	}

}
