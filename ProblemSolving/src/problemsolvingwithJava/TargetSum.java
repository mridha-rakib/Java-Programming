package problemsolvingwithJava;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
 
        findPair(nums, target);
	}
	
	public static void findPair( int[] nums, int target)
	{
		Arrays.sort( nums );
		
		int low = 0, high = nums.length - 1;
		
		while ( low < high )
		{
			if ( nums[low] + nums[high] == target )
			{
				System.out.print(nums[low] + " " + nums[high]);
				return;
			}
			
			if ( nums[low] + nums[high] < target )
				low++;
			else
				high--;
		}
	}
}
