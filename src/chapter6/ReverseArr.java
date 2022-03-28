package chapter6;

public class ReverseArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,65,6,90};
		System.out.println("array Valuse are..");
		for(int i : a)
		{
			System.out.print(i+"\t");
		}
System.out.println("\nReverse Array is ...");
int n=a.length/2;
int LIndex=a.length-1;
int temp;
for(int j=0; j<=n;j++)
{
	/*
	 * a[LIndex]+=a[j]; // same swapping rule a,b a[j]=a[LIndex]-a[j];
	 * a[LIndex]-=a[j];
	 */
	temp=a[j];
	a[j]=a[LIndex-j];
	a[LIndex-j]=temp;
	
}
for(int index : a)
{
	System.out.print(index+ "\t");
}
	}

}
