package problemsolvingwithJava;

public class FindSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = { 8, 7, 2, 5, 3, 1 };
		int target = 10;
		
		findPair( nums, target );

	}
	
	public static void findPair( int [] nums, int target )
	{
		for ( int i = 0; i < nums.length; i++ )
		{
			for ( int j = i; j < nums.length; j++ )
			{
				if ( nums[i] + nums[j] == target )
				{
					System.out.println(nums[i] +" "+nums[j]);
					return;
				}
			}
		}
	}

}
