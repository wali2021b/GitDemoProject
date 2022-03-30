package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,4,5,6,7,9,22};
		System.out.println("What At which position of this array you want to insert..."+Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int index=sc.nextInt();
		a[index]=num;
		System.out.println("Updated Array is  : "+Arrays.toString(a));

	}

}
