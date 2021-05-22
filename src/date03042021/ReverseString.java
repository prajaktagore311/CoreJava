package date03042021;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="I am Learning Java";
	//			StringBuilder s=new StringBuilder(name);
	//	s.reverse();
		//System.out.println(s);
		int srtlength=name.length();
		for(int i=srtlength-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}
	}

}
