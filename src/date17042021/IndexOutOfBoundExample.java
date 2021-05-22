package date17042021;

public class IndexOutOfBoundExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="pune";
		try
		{
		char charAt=name.charAt(0);
		System.out.println("The character is:"+charAt);
		}
		catch(StringIndexOutOfBoundException e)
		{
			System.out.println("exception Ocuurs");
			System.out.println(e.getmessage());
		}
	
	}

}
