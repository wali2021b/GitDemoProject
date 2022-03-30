package chapter6;
import java.util.*;
public class ReverseArr3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a;
System.out.println("Enter size of the array ");
Scanner sc=new Scanner(System.in);
byte size=sc.nextByte();
a=new int[size];

System.out.printf("Enter %d Element in the Array \n",size);
for(int i=0;i<size;i++)
{
	a[i]=sc.nextInt();
}
System.out.println("Your Entered Array is :"+Arrays.toString(a)+" \nNow Reversed Array is..");
for(int i=0;i<size/2;i++)
{
	a[size-1-i]+=a[i];
	a[i]=a[size-1-i]-a[i];
	a[size-1-i]=a[size-1-i]-a[i];
}

System.out.println(Arrays.toString(a));


		
		
	}

}
