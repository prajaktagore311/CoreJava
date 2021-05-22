package collectionFramework;

import java.util.ArrayList;
import java.util.List;

//import com.sun.tools.javac.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("java");
		list.add("Paython");
		list.add("Cobol");
		list.add("Spring");
		list.add("java");
		list.add("c++");
		System.out.println(list);
		System.out.println(list.get(2));
		System.out.println(list.contains("Java"));
		System.out.println(list.contains("java"));
		System.out.println(list.indexOf("Spring"));
		System.out.println(list.lastIndexOf("java"));
		System.out.println(list.remove("java"));
		System.out.println(list);
		List<String> newList=list.subList(1, 5);
		System.out.println(newList);
		for(int i=0; i<list.size();i++)
		{
			System.out.println(i+"->"+list.get(i));
			
		}
		for(String val:list)
		{
			System.out.println(val);
		}

	}

}
