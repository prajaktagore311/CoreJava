package date10042021;

public class CalcuatorFloat extends CalculatorInt {
 float c;
 float d;
 public CalcuatorFloat(float x,float y,int u,int v)
 {
	 super(u,v);
	 c=x;
	 d=y;
 }
 
 void addfloat()
	{
		System.out.println("Addition :"+(c+d));
	}
	void subfloat()
	{
		System.out.println("Substraction :"+(c-d));
	}
	void mulfloat()
	{
		System.out.println("Multiplication :"+(c*d));
	}
	void divfloat()
	{
		System.out.println("Division :"+(c/d));
	}
}
