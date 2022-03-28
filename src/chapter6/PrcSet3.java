package chapter6;

public class PrcSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Mean of physic marks which is stored in an array using for-each loop.....

		int[] physics= {3,3,3,90};
		float mean,sum=0;
		System.out.println(sum);
		for(int i: physics)
		{
			sum+=i;
		}
		mean=sum/physics.length;
		System.out.println("Mean of physics Marks Is :"+mean);
	}

}
