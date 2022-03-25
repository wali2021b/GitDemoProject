package chapter5;

import java.util.Scanner;

public class Prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Multiplication Table of given Numbers...
		int n,i;

		Scanner sc= new Scanner(System.in);
		System.out.println("Which table do you want to print.");
		 n=sc.nextInt();
		 for(i=1;i<=10;i++)
		 {
			 System.out.printf("%d x %2d = %2d \n",n,i,n*i);     // %2d just to formate the integer Minimum 2 digits.
		 }
		
	}

}
