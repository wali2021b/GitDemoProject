package chapter6;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndexItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,4,6,7,9,0,8};
		System.out.println(Arrays.toString(a)+"\nWhic index Element you want to delete from this array");
		Scanner sc =new Scanner(System.in);
		int i=sc.nextInt();
		boolean value=(i>-1 && i<a.length-1);
		if(value)
		{
			for(int index=i;index<a.length-1;index++)
			{
				a[index]=a[index+1];
			}
		}
		else
			System.out.println("Invalid Index..");
System.out.println("Array After processing..\n"+Arrays.toString(a));
	}

}
