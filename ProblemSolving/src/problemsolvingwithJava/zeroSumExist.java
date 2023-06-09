package problemsolvingwithJava;

import java.util.Set;
import java.util.HashSet;

public class zeroSumExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {4, -6, 3, -1, 4, 2, 7};
		
		if ( hasZeroSumSubarray(nums))
		{
			System.out.print("Sub array exist");
		}
		else
		{
			System.out.print("Subarray does not exist");
		}

	}
	
	public static boolean hasZeroSumSubarray( int[] nums)
	{
		Set<Integer>set = new HashSet<>();
		set.add(0);
		
		int sum = 0;
		
		for ( int value : nums )
		{
			sum += value;
			if ( set.contains(sum)) {
				return true;
			}
			
			set.add( sum );
		}
		
		return false;
	}

}
