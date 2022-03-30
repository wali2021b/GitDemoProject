package chapter6;
import java.util.*;
public class MInMaxArr {
static int Max;
static int Min;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,4,-77,79,9,0,8};
		Max=a[0];
		Min=a[0];
		for(int i=1;i<a.length-1;i++)
		{
			if(Max<a[i+1])
			{
				Max=a[i+1];
			}
			if(Min>a[i+1])
			{
				Min=a[i+1];
			}
		}
		System.out.println(" Array is :"+Arrays.toString(a));
		System.out.println("So Mini of the Array is :"+Min);
		System.out.println("So Max of the Array is :"+Max);
	}

}
