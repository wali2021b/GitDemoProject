package chapter6;

public class IsSorted {

	public static void main(String[] args) {

		int[] arr= {10,4,3,2};
		boolean Asc=true;
		boolean Desc=true;
		for(int i=0;i<arr.length-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				Asc=false;
				break;
			}
		}
		for(int j=0;j<arr.length-1; j++)
		{
			if(arr[j]<arr[j+1])
			{
				Desc=false;
				break;
			}
		}
		if(Asc || Desc)
		{
			System.out.println("This Array is Sorted..."+"Descending:"+Desc+" Ascending: "+Asc);
			
		}
		else
		{
			System.out.println("OOPs! This is an Un-Sorted Array...");
			
		}

		
	}

}
