package chapter6;
//Write a Java program to find the second largest element in an array.

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,82,3,24,5,6,7,8,1000,1001};
		System.out.println("Array elements are: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Second Largest Element in the array is."+a[a.length-2]);

	}

}
