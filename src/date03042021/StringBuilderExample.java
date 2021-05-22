package date03042021;



public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sdr=new StringBuilder("Java");
		StringBuilder sdr1=new StringBuilder("Java");
		//StringBuilder sdr1=sdr.append("hasd");
		System.out.println(sdr.capacity());
		sdr.append("Hello Welcome in java tutorial");
		System.out.println(sdr);
		System.out.println(sdr.capacity());
		System.out.println(sdr.equals(sdr1));
		System.out.println(sdr.capacity());
		System.out.println(sdr.charAt(2));
		System.out.println(sdr.indexOf("o"));
		System.out.println(sdr.indexOf("l", 9));
		System.out.println(sdr.lastIndexOf("o"));
		System.out.println(sdr.lastIndexOf("i", 32));
		System.out.println(sdr.length());
		System.out.println(sdr.substring(8));
		System.out.println(sdr.substring(5, 23));
		System.out.println(sdr.subSequence(5, 14));
		//System.out.println(sdr.reverse());
		System.out.println(sdr.replace(21, 25, "cava"));

	}

}
