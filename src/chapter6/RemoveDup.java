package chapter6;

import java.util.Arrays;

//Write a Java program to remove duplicate elements from an array.

public class RemoveDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,3,4,1,6,3,2};
int [] b=new int[4];
System.out.println("Array is: "+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
//			System.out.println(b[i]);
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					a[j]=0;
				}
		}
		}
		System.out.println("Updated Array.."+Arrays.toString(a));
		
	}

}
