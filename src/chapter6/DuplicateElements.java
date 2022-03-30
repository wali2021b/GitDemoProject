
//Write a Java program to find the duplicate values of an array of integer values.
package chapter6;


public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {2,3,5,5,6,9,0,9};

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	if(a[i]==a[j])
	{
		System.out.printf("\"%d\" Element  at %d is same as element at %d :\n ",a[i],i,j);
	}
	{
		
	}
}

	}

}
