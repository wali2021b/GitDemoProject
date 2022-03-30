package chapter6;

import java.util.Arrays;

//Write a Java program to find the second largest element in an array.
public class SecondMax2 {
static int max,Sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5,6,7,8,1000,100,898,1000};
		System.out.println("Array elements are: "+Arrays.toString(a));
		max=a[0];
		Sc=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				Sc=max;
				max=a[i];
				
			}
			if(Sc<a[i] && max!=a[i])
			{
			  Sc=a[i];
			}
			
		}
		System.out.printf("Maximum value of the array is =%d\n and second Max is =%d",max,Sc);
	}

}
