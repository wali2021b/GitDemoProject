package chapter6;
import java.util.*;
public class PracticeQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a Java program to find the index of an array element.
		int[] a= {1,2,55,6,7,8};
		int key=55;
		Boolean isPresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("is present At index : "+i);
				isPresent=true;
			}
		}
		if(!isPresent)
		{
			System.out.printf("Sorry %d  Not found..",key);
		}
		 System.out.println("\nOriginal numeric array : "+Arrays.toString(a));
		 Arrays.sort(a);
		 System.out.println("\nNow Sorted array : "+Arrays.toString(a));
		 for(int i=0;i<a.length;i++)
			{
				if(key==a[i])
				{
					System.out.println("is present At index : "+i);
					isPresent=true;
				}
			}
			if(!isPresent)
			{
				System.out.printf("Sorry %d  Not found..",key);
			}
	}

}
