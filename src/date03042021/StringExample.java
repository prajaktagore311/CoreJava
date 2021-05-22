package date03042021;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="I am Learning Java";
		String another="Pune";
		String str1="pune";
		System.out.println(name.charAt(3));
		System.out.println(name.length());
		System.out.println(name.compareTo(another));
		System.out.println(name.concat("Hello!"));
		System.out.println(name.contains("Learn"));
		System.out.println(name.contains("java"));
		System.out.println(str1.contentEquals(another));
		System.out.println(another.equals(str1));
		System.out.println(another.equalsIgnoreCase(str1));
		System.out.println(name.indexOf("J"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("a", 10));
		System.out.println(name.isEmpty());
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.lastIndexOf("j", 10));
		String NewValue=name.replace("ava", "AVA");
		System.out.println(NewValue);
		System.out.println(name);
		//System.out.println(name.split(""));
		System.out.println(name.substring(5));
		System.out.println(name.substring(5, 13));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
	}

}
