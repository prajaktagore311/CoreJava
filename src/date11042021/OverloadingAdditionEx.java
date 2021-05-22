package date11042021;

public class OverloadingAdditionEx {
	public void add(int x,int y)
	{
		System.out.println("Addition 2 int :"+(x+y));
	}
	public void add(int a,int b,int c)
	{
		System.out.println("Addition 3 int: "+(a+b+c));
	}
	public void add(int x,float y)
	{
		System.out.println("Addition 1 int 1 float :"+(x+y));
	}
	public void add(float x,int y)
	{
		System.out.println("Addition 1 foat 1int:"+(x+y));
	}
	public void add(float x,float y)
	{
		System.out.println("Addition 2 float :"+(x+y));
	}

}
