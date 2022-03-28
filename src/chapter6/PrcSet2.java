package chapter6;
import java.util.*;

public class PrcSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {2,3,5,6,8,9,7};
		System.out.println("Enter a number to find in the array..");
		Scanner sc=new Scanner(System.in);
		boolean mm=true;
		int find=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			if(find==arr[i]) {
				System.out.println(find+" is present at index :"+i);
			mm=false;
			}
			
			
		}
		if(mm)
		{
			System.out.println("OOPs! Key not fond");
		}
		

	}

}
