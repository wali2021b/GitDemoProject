package chapter6;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5,6,88,54};
int[] b;
System.out.println("Your Array is...");
for(int j=0;j<a.length;j++)
{
	System.out.print(a[j]+"\t");
}
b=new int[a.length];
for(int i=0;i<b.length;i++) {
	b[b.length-i-1]=a[i];
}
System.out.println("\nReverse array is...");
for(int k=0;k<a.length;k++)
{
	System.out.print(b[k]+"\t");
}
	}
	

}
