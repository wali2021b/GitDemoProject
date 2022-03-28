package chapter6;

public class MaxInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {-78,-66,-979,-660,-4993,-80};
int Max=Integer.MIN_VALUE;
for(int index : arr)
{
	if(Max<index)
	{
		Max=index;
	}
	System.out.print(index +"\t");
}
System.out.println("\nMax Value of this array is: "+Max);
	}

}
