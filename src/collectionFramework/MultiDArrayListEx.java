package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MultiDArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<Integer> num=new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> number= new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> num1=new ArrayList<Integer>();
		ArrayList<Integer> num2=new ArrayList<Integer>();
		ArrayList<Integer> num3=new ArrayList<Integer>();
		
		
		LinkedList<String> str1=new LinkedList<String>();
		
		num1.add(2);
		num1.add(4);
		num1.add(6);
		
		num2.add(3);
		num2.add(6);
		num2.add(9);
		num2.add(12);
		
		num3.add(4);
		num3.add(8);
		num3.add(12);
		num3.add(16);
		num3.add(20);
		
		
		
		number.add(num1);
		number.add(num2);
		number.add(num3);
		
		System.out.println(number);
		System.out.println(number.size());
		System.out.println(number.get(2));
		
		List<Integer> temp=number.get(1);
		System.out.println("Temp"+temp);
		System.out.println(temp.get(1));
		System.out.println(number.get(1).get(2));
		
		
		
	}

}
