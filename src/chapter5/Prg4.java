package chapter5;

import java.util.Scanner;

public class Prg4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Multiplication table of n in reverse order..

		Scanner sc= new Scanner(System.in);
		System.out.println("which table do you want to print in revers.");
		int n=sc.nextInt();
		for(int i=10;i>=1;i--)
		{
			 System.out.printf("%d x %2d = %2d \n",n,i,n*i);
		}
	}

}
