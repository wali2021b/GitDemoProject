package chapter6;

public class MinValueArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,-90,78};
		int min=Integer.MAX_VALUE;
		for(int i : arr)
		{
			if(min>i) {
				min=i;
				
			}
			System.out.print("\t"+i);
		}
		System.out.println("\n Minimum of the array value is... : "+min);

	}

}
