package chapter6;
//. Write a Java program to find the second smallest element in an array.
import java.util.Arrays;
public class SecondMin {
static int min,sMin;
	public static void main(String[] args) {

		int [] a= {1,21,32,4,5,6,2,1,2,0};
//		int [] a= {4,3,2,1};
		min=a[0];
		sMin=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				sMin=min;
				min=a[i];
			}
			if((sMin<a[i] && sMin==min) || (sMin>a[i] && a[i]!=min) )
			{
				sMin=a[i];
			}
		}
		System.out.println("Array is : "+Arrays.toString(a));
		System.out.printf("Min= %d \nSeconde Min=%d",min,sMin);
		
	}

}
