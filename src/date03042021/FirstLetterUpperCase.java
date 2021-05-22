package date03042021;

public class FirstLetterUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am learning java";
		//sentence=>word=>split(" ")
		//substring=>separate the letter
		//every word first letter
		String[] words=str.split(" ");
		String newStr="";
		for(int i=0;i<words.length;i++)
		{
			String temp=words[i].substring(0, i);
			
		}

	}

}
