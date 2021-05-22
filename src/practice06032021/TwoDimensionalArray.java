package practice06032021;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Two dimensional array");
		int rows=obj.nextInt();
		int columns=obj.nextInt();
		System.out.println("Enter 2D array");
		int twoD[][]=new int[rows][columns];
		for(int i=0;i<rows;i++) {
			if(i<=0)
			{
				System.out.println(0);
			}
		for(int j=0;j<columns;j++)
		{
			if(j<=0)
			{
				System.out.println(0);
			}
			twoD[i][j]=obj.nextInt();
		}
		}
       /* System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
            System.out.print(y+"        ");
            }
            System.out.println();*/
        
	}

	}

