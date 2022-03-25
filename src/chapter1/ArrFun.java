package chapter1;

public class ArrFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr;
		arr=new int[8];
		int i=0;
		
		while(i<8)
		{
			arr[i]=i;
			i++;
		}
		for(i=arr.length;i<=0;i--)
		{
			System.out.println("arr "+i+ "  ="+ arr[i]);
		}
System.out.println("Helllo");
	}

}
