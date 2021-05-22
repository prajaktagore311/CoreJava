package date03042021;

public class StringBufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("I am Learning Java");
		System.out.println(sb.capacity());
		StringBuffer str=new StringBuffer("Java");
		System.out.println(str.insert(2, sb));
		System.out.println(str.replace(1, 3, "JVM"));
		System.out.println(sb.delete(3, 6));
		System.out.println(sb.reverse());
		
		

	}

}
