package date03042021;

public class PracticeStringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Java";
		String s2="Java";
		String s3="I am Learning java";
		String s4="java";
		System.out.println(s1.charAt(0));//index start from 0
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s1.concat(s3));
		System.out.println(s1.contains(s2));
		System.out.println(s1.contentEquals(s4));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s3.indexOf("a"));
		System.out.println(s3.indexOf("L"));
		System.out.println(s1.intern());
		System.out.println(s1.isEmpty());
		System.out.println(s3.lastIndexOf("a"));
		System.out.println(s1.length());//length start from 1
		System.out.println(s3.length());
		System.out.println(s1.repeat(3));//using repeat sentence repeated n number of times
		System.out.println(s1.replace("J", "c"));
		System.out.println(s1);//String is immuttable they cannot change once
		System.out.println(s3.replace(s2, s3));
		System.out.println(s1.replaceAll(s3, s4));
		System.out.println(s1.startsWith(s2));
		System.out.println(s2.strip());
		System.out.println(s3.substring(4));
		System.out.println(s3.substring(5, 8));
		System.out.println(s3.subSequence(2, 6));
		System.out.println(s1.toLowerCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1.split(s4));
		System.out.println(s1.valueOf(s4));

	}

}
